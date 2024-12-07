package ma.projet.hotel.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomUtilisateur;
    private String motDePasse;
    private String role; 
}
