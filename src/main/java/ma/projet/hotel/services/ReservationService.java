package ma.projet.hotel.services;

import ma.projet.hotel.entities.Client;
import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.entities.Reservation;
import ma.projet.hotel.repositories.ChambreRepository;
import ma.projet.hotel.repositories.ClientRepository;
import ma.projet.hotel.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation createReservation(Reservation reservation) {
        // Vérification de la présence des objets liés
        if (reservation == null) {
            throw new IllegalArgumentException("La réservation ne peut pas être null.");
        }
        if (reservation.getChambre() == null) {
            throw new IllegalArgumentException("La chambre est obligatoire pour créer une réservation.");
        }
        if (reservation.getClient() == null) {
            throw new IllegalArgumentException("Le client est obligatoire pour créer une réservation.");
        }

        // Vérification des ID des entités liées
        Chambre chambre = reservation.getChambre();
        if (chambre.getId() == null) {
            throw new IllegalArgumentException("La chambre doit avoir un ID valide.");
        }
        Client client = reservation.getClient();
        if (client.getId() == null) {
            throw new IllegalArgumentException("Le client doit avoir un ID valide.");
        }

        // Si toutes les validations passent, enregistrer la réservation
        return reservationRepository.save(reservation);
    }


    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation updateReservation(Long id, Reservation updatedReservation) {
        Reservation existingReservation = reservationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Réservation introuvable pour l'id : " + id));

        // Mettez à jour les champs existants
        existingReservation.setDateDebut(updatedReservation.getDateDebut());
        existingReservation.setDateFin(updatedReservation.getDateFin());
        existingReservation.setPreferences(updatedReservation.getPreferences());
        existingReservation.setClient(updatedReservation.getClient());
        existingReservation.setChambre(updatedReservation.getChambre());

        return reservationRepository.save(existingReservation);
    }
    public Optional<Reservation> getReservationById(Long id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        if (reservation == null) {
            throw new RuntimeException("Réservation introuvable pour l'id : " + id);
        }
        return reservation;
    }
    public void deleteReservation(Long id) {
        Reservation reservation = reservationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Réservation introuvable pour l'id : " + id));
        reservationRepository.delete(reservation);
    }
}