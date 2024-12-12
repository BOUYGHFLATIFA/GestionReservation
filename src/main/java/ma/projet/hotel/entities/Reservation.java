package ma.projet.hotel.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.Data;



@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @XmlTransient
    private Client client;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    @XmlTransient
    private Chambre chambre;

    private String dateDebut;
    private String dateFin;
    private String preferences;
	

  
}


