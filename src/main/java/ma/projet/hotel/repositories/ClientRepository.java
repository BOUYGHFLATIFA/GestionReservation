package ma.projet.hotel.repositories;

import ma.projet.hotel.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
