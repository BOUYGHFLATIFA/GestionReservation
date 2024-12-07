package ma.projet.hotel.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;

}

