package ma.projet.hotel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.repositories.ChambreRepository;

@Service
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}

