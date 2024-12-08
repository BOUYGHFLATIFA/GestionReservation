package ma.projet.hotel.services;

import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.entities.Reservation;
import ma.projet.hotel.repositories.ChambreRepository;
import ma.projet.hotel.repositories.ClientRepository;
import ma.projet.hotel.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    public Reservation createReservation(Reservation reservation) {
        Chambre chambre = chambreRepository.findById(reservation.getChambre().getId())
            .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
        if (!chambre.isDisponible()) {
            throw new RuntimeException("La chambre sélectionnée n'est pas disponible pour la réservation.");
        }
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        Reservation reservation = reservationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Reservation not found"));

        reservation.setDateDebut(reservationDetails.getDateDebut());
        reservation.setDateFin(reservationDetails.getDateFin());
        reservation.setPreferences(reservationDetails.getPreferences());

        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        Reservation reservation = reservationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Réservation introuvable pour l'id : " + id));
        reservationRepository.delete(reservation);
    }
}
