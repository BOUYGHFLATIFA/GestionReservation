package ma.projet.hotel.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double prix;
    private Boolean disponible;

    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;

   
}