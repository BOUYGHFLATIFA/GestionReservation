package ma.projet.hotel.dto;
import lombok.Data;
import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.entities.Client;
import ma.projet.hotel.entities.Reservation;

@Data
public class ReservationDTO {
	private Long clientId;
    private Long chambreId;
    private String dateDebut;
    private String dateFin;
    private String preferences;
    
    public Reservation toEntity(Client client, Chambre chambre) {
        Reservation reservation = new Reservation();
        reservation.setDateDebut(this.dateDebut);
        reservation.setDateFin(this.dateFin);
        reservation.setPreferences(this.preferences);
        reservation.setClient(client);
        reservation.setChambre(chambre);
        return reservation;
    }
}
