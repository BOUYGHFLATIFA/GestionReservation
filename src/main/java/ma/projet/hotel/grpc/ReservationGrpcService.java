package ma.projet.hotel.grpc;

import io.grpc.stub.StreamObserver;
import ma.projet.hotel.entities.Chambre;
import ma.projet.hotel.entities.Client;
import ma.projet.hotel.entities.Reservation;
import ma.projet.hotel.repositories.ChambreRepository;
import ma.projet.hotel.repositories.ClientRepository;
import ma.projet.hotel.repositories.ReservationRepository;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.Status;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class ReservationGrpcService extends ReservationServiceGrpc.ReservationServiceImplBase {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final ChambreRepository chambreRepository;

    public ReservationGrpcService(ReservationRepository reservationRepository,ClientRepository clientRepository, ChambreRepository chambreRepository  ) {
        this.reservationRepository = reservationRepository;
        this.clientRepository = clientRepository;
        this.chambreRepository = chambreRepository;
    }

    
    @Override
    public void createReservation(CreateReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        try {
            // Récupérer le client et la chambre depuis la base de données
            Client client = clientRepository.findById(Long.parseLong(request.getClientId()))
                    .orElseThrow(() -> new IllegalArgumentException("Client not found"));
            Chambre chambre = chambreRepository.findById(Long.parseLong(request.getChambreId()))
                    .orElseThrow(() -> new IllegalArgumentException("Chambre not found"));

            // Vérifier si la chambre est disponible
            if (!chambre.isDisponible()) {
                throw new IllegalArgumentException("La chambre sélectionnée n'est pas disponible.");
            }

            // Créer une nouvelle réservation
            Reservation reservation = new Reservation();
            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(request.getDateDebut());
            reservation.setDateFin(request.getDateFin());
            reservation.setPreferences(request.getPreferences());

            // Sauvegarder la réservation
            Reservation savedReservation = reservationRepository.save(reservation);

            // Mettre à jour la disponibilité de la chambre
            chambre.setDisponible(false);
            chambreRepository.save(chambre);

            // Construire la réponse
            ReservationResponse response = ReservationResponse.newBuilder()
                    .setId(savedReservation.getId().toString())
                    .setClientName(client.getNom() + " " + client.getPrenom())
                    .setChambreNumber(chambre.getId().toString())
                    .setDateDebut(savedReservation.getDateDebut())
                    .setDateFin(savedReservation.getDateFin())
                    .setPreferences(savedReservation.getPreferences())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }


    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        try {
            // Vérifier si la réservation existe
            Reservation existingReservation = reservationRepository.findById(Long.parseLong(request.getId()))
                    .orElseThrow(() -> new IllegalArgumentException("Reservation not found"));

            // Récupérer et mettre à jour le client
            if (!request.getClientId().isEmpty()) {
                Client client = clientRepository.findById(Long.parseLong(request.getClientId()))
                        .orElseThrow(() -> new IllegalArgumentException("Client not found"));
                existingReservation.setClient(client);
            }

            // Récupérer et mettre à jour la chambre
            if (!request.getChambreId().isEmpty()) {
                Chambre newChambre = chambreRepository.findById(Long.parseLong(request.getChambreId()))
                        .orElseThrow(() -> new IllegalArgumentException("Chambre not found"));

                // Vérifier la disponibilité de la nouvelle chambre
                if (!newChambre.isDisponible()) {
                    throw new IllegalArgumentException("Selected room is not available.");
                }

                // Rendre disponible l'ancienne chambre
                Chambre oldChambre = existingReservation.getChambre();
                if (oldChambre != null) {
                    oldChambre.setDisponible(true);
                    chambreRepository.save(oldChambre);
                }

                // Assigner la nouvelle chambre
                existingReservation.setChambre(newChambre);
                newChambre.setDisponible(false);
                chambreRepository.save(newChambre);
            }

            // Mettre à jour les dates et les préférences
            if (!request.getDateDebut().isEmpty()) {
                existingReservation.setDateDebut(request.getDateDebut());
            }
            if (!request.getDateFin().isEmpty()) {
                existingReservation.setDateFin(request.getDateFin());
            }
            if (!request.getPreferences().isEmpty()) {
                existingReservation.setPreferences(request.getPreferences());
            }

            // Sauvegarder la réservation mise à jour
            Reservation updatedReservation = reservationRepository.save(existingReservation);

            // Construire la réponse
            ReservationResponse response = ReservationResponse.newBuilder()
                    .setId(updatedReservation.getId().toString())
                    .setClientName(updatedReservation.getClient().getNom() + " " + updatedReservation.getClient().getPrenom())
                    .setChambreNumber(updatedReservation.getChambre().getId().toString())
                    .setDateDebut(updatedReservation.getDateDebut())
                    .setDateFin(updatedReservation.getDateFin())
                    .setPreferences(updatedReservation.getPreferences())
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            // En cas d'erreur, renvoyer une exception gRPC
            responseObserver.onError(Status.UNKNOWN.withDescription(e.getMessage()).asRuntimeException());
        }
    }


    @Override
    public void getAllReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        // Récupérer toutes les réservations
        List<Reservation> reservations = reservationRepository.findAll();
        List<ReservationResponse> responses = reservations.stream().map(reservation -> ReservationResponse.newBuilder()
                .setId(String.valueOf(reservation.getId()))
                .setDateDebut(reservation.getDateDebut())
                .setDateFin(reservation.getDateFin())
                .setPreferences(reservation.getPreferences())
                .build()).collect(Collectors.toList());

        // Construire la réponse
        GetAllReservationsResponse response = GetAllReservationsResponse.newBuilder()
                .addAllReservations(responses)
                .build();

        // Envoyer la réponse
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getReservationById(GetReservationByIdRequest request, StreamObserver<ReservationResponse> responseObserver) {
        // Rechercher une réservation par son ID
        Optional<Reservation> optionalReservation = reservationRepository.findById(Long.parseLong(request.getId()));
        if (optionalReservation.isPresent()) {
            Reservation reservation = optionalReservation.get();

            // Construire la réponse
            ReservationResponse response = ReservationResponse.newBuilder()
                    .setId(String.valueOf(reservation.getId()))
                    .setDateDebut(reservation.getDateDebut())
                    .setDateFin(reservation.getDateFin())
                    .setPreferences(reservation.getPreferences())
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new Throwable("Réservation non trouvée"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        // Supprimer une réservation par son ID
        boolean exists = reservationRepository.existsById(Long.parseLong(request.getId()));
        if (exists) {
            reservationRepository.deleteById(Long.parseLong(request.getId()));
            // Construire la réponse
            responseObserver.onNext(DeleteReservationResponse.newBuilder()
                    .setMessage("Réservation supprimée avec succès")
                    .build());
        } else {
            responseObserver.onError(new Throwable("Réservation non trouvée"));
        }
        responseObserver.onCompleted();
    }
    @Override
    public void createClient(CreateClientRequest request, StreamObserver<CreateClientResponse> responseObserver) {
        try {
            // Créer un nouveau client
            Client client = new Client();
            client.setNom(request.getNom());
            client.setPrenom(request.getPrenom());
            client.setEmail(request.getEmail());
            client.setTelephone(request.getTelephone());

            // Sauvegarder le client dans la base de données
            client = clientRepository.save(client);

            // Construire la réponse
            CreateClientResponse response = CreateClientResponse.newBuilder()
                    .setId(String.valueOf(client.getId()))
                    .setNom(client.getNom())
                    .setPrenom(client.getPrenom())
                    .setEmail(client.getEmail())
                    .setTelephone(client.getTelephone())
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("Erreur lors de la création du client : " + e.getMessage()));
        }
    }

    @Override
    public void createChambre(CreateChambreRequest request, StreamObserver<CreateChambreResponse> responseObserver) {
        try {
            // Créer une nouvelle chambre
            Chambre chambre = new Chambre();
            chambre.setType(request.getType());
            chambre.setPrix(request.getPrix());
            chambre.setDisponible(request.getDisponible());

            // Sauvegarder la chambre dans la base de données
            chambre = chambreRepository.save(chambre);

            // Construire la réponse
            CreateChambreResponse response = CreateChambreResponse.newBuilder()
                    .setId(String.valueOf(chambre.getId()))
                    .setType(chambre.getType())
                    .setPrix(chambre.getPrix())
                    .setDisponible(chambre.isDisponible())
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("Erreur lors de la création de la chambre : " + e.getMessage()));
        }
    }
}

