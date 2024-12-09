package ma.projet.hotel.graphql;

import lombok.RequiredArgsConstructor;

import ma.projet.hotel.entities.Reservation;
import ma.projet.hotel.services.ReservationService;
import ma.projet.hotel.entities.Client;
import ma.projet.hotel.entities.Chambre;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ma.projet.hotel.dto.ReservationDTO;
import ma.projet.hotel.repositories.ClientRepository;
import ma.projet.hotel.repositories.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ReservationResolver {

    private final ReservationService reservationService;
    private final ClientRepository clientRepository;
    private final ChambreRepository chambreRepository;

    // Query to get all reservations
    @QueryMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // Query to get a reservation by ID
    @QueryMapping
    public Optional<Reservation> getReservationById(@Argument Long id) {
        return reservationService.getReservationById(id);
    }

    // Mutation to create a new reservation
    @MutationMapping
    public Reservation createReservation(@Argument ReservationDTO input) {
        Client client = clientRepository.findById(input.getClientId())
            .orElseThrow(() -> new RuntimeException("Client introuvable pour l'id : " + input.getClientId()));

        Chambre chambre = chambreRepository.findById(input.getChambreId())
            .orElseThrow(() -> new RuntimeException("Chambre introuvable pour l'id : " + input.getChambreId()));

        Reservation reservation = input.toEntity(client, chambre);
        return reservationService.createReservation(reservation);
    }

    // Mutation to update a reservation
    @MutationMapping
    public Reservation updateReservation(@Argument Long id, @Argument ReservationDTO input) {
        // Vérifiez si la réservation existe
        Reservation existingReservation = reservationService.getReservationById(id)
            .orElseThrow(() -> new RuntimeException("Réservation introuvable pour l'id : " + id));

        // Récupérez le client et la chambre
        Client client = clientRepository.findById(input.getClientId())
            .orElseThrow(() -> new RuntimeException("Client introuvable pour l'id : " + input.getClientId()));
        Chambre chambre = chambreRepository.findById(input.getChambreId())
            .orElseThrow(() -> new RuntimeException("Chambre introuvable pour l'id : " + input.getChambreId()));

        // Mettez à jour les champs
        existingReservation.setDateDebut(input.getDateDebut());
        existingReservation.setDateFin(input.getDateFin());
        existingReservation.setPreferences(input.getPreferences());
        existingReservation.setClient(client);
        existingReservation.setChambre(chambre);

        // Enregistrez la réservation mise à jour
        return reservationService.updateReservation(id, existingReservation);
    }

    // Mutation to delete a reservation by ID
    @MutationMapping
    public boolean deleteReservation(@Argument Long id) {
        reservationService.deleteReservation(id);
        return true;
    }
}
