package ma.projet.hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.services.ChambreService;

@RestController
@RequestMapping("/api/chambres")
public class ChambreController {

    @Autowired
    private ChambreService chambreService;

    // Endpoint pour ajouter une chambre
    @PostMapping
    public ResponseEntity<Chambre> addChambre(@RequestBody Chambre chambre) {
        Chambre newChambre = chambreService.addChambre(chambre);
        return ResponseEntity.status(HttpStatus.CREATED).body(newChambre);
    }
}

