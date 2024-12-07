package ma.projet.hotel.repositories;

import ma.projet.hotel.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}

