package ma.projet.hotel.ws;
import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.entities.Client;
import ma.projet.hotel.entities.Reservation;
import ma.projet.hotel.repositories.ReservationRepository;
import ma.projet.hotel.repositories.ClientRepository;
import ma.projet.hotel.repositories.ChambreRepository;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@WebService(serviceName = "ReservationWS")
public class ReservationSoapService {

    @Autowired
    private ReservationRepository reservationRepository;
    
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChambreRepository chambreRepository;
    // Méthode pour récupérer toutes les réservations
    @WebMethod
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    // Méthode pour récupérer une réservation par ID
    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    // Méthode pour créer une nouvelle réservation
    @WebMethod
    public Reservation createReservation(
            @WebParam(name = "clientId") Long clientId,
            @WebParam(name = "chambreId") Long chambreId,
            @WebParam(name = "dateDebut") String dateDebut,
            @WebParam(name = "dateFin") String dateFin,
            @WebParam(name = "preferences") String preferences) {

        Client client = clientRepository.findById(clientId).orElseThrow();
        Chambre chambre = chambreRepository.findById(chambreId).orElseThrow();

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
        reservation.setPreferences(preferences);

        return reservationRepository.save(reservation);
    }
    @WebMethod
    public Reservation updateReservation(
            @WebParam(name = "id") Long id,
            @WebParam(name = "clientId") Long clientId,
            @WebParam(name = "chambreId") Long chambreId,
            @WebParam(name = "dateDebut") String dateDebut,
            @WebParam(name = "dateFin") String dateFin,
            @WebParam(name = "preferences") String preferences) {
        
        Optional<Reservation> reservationOptional = reservationRepository.findById(id);
        if (reservationOptional.isPresent()) {
            Reservation reservation = reservationOptional.get();
            
            // Récupération du client
            Optional<Client> clientOptional = clientRepository.findById(clientId);
            if (clientOptional.isEmpty()) {
                throw new IllegalArgumentException("Client introuvable avec l'ID : " + clientId);
            }
            reservation.setClient(clientOptional.get());
            
            // Récupération de la chambre
            Optional<Chambre> chambreOptional = chambreRepository.findById(chambreId);
            if (chambreOptional.isEmpty()) {
                throw new IllegalArgumentException("Chambre introuvable avec l'ID : " + chambreId);
            }
            reservation.setChambre(chambreOptional.get());
            
            // Mise à jour des autres champs
            reservation.setDateDebut(dateDebut);
            reservation.setDateFin(dateFin);
            reservation.setPreferences(preferences);
            
            return reservationRepository.save(reservation);
        } else {
            throw new IllegalArgumentException("Réservation introuvable avec l'ID : " + id);
        }
    }


    // Méthode pour supprimer une réservation
    @WebMethod
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

