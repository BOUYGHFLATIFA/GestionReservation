package ma.projet.hotel.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "chambre_id", nullable = false)
    private Chambre chambre;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String preferences;

    // Getters and setters
}

