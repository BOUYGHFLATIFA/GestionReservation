package ma.projet.hotel.reservation;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Définition des services gRPC
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "reservation.ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest.class,
      responseType = ma.projet.hotel.reservation.ReservationProto.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest, ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest, ma.projet.hotel.reservation.ReservationProto.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest.class,
      responseType = ma.projet.hotel.reservation.ReservationProto.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest, ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest, ma.projet.hotel.reservation.ReservationProto.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.SuccessResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest.class,
      responseType = ma.projet.hotel.reservation.ReservationProto.SuccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.SuccessResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest, ma.projet.hotel.reservation.ReservationProto.SuccessResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest, ma.projet.hotel.reservation.ReservationProto.SuccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.SuccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ma.projet.hotel.reservation.ReservationProto.ReservationsResponse> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = com.google.protobuf.Empty.class,
      responseType = ma.projet.hotel.reservation.ReservationProto.ReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ma.projet.hotel.reservation.ReservationProto.ReservationsResponse> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ma.projet.hotel.reservation.ReservationProto.ReservationsResponse> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ma.projet.hotel.reservation.ReservationProto.ReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationService", "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.ReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.ReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationById",
      requestType = ma.projet.hotel.reservation.ReservationProto.ReservationRequest.class,
      responseType = ma.projet.hotel.reservation.ReservationProto.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.ReservationRequest,
      ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.reservation.ReservationProto.ReservationRequest, ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.reservation.ReservationProto.ReservationRequest, ma.projet.hotel.reservation.ReservationProto.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationService", "GetReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.reservation.ReservationProto.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationById"))
                  .build();
          }
        }
     }
     return getGetReservationByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Définition des services gRPC
   * </pre>
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public void createReservation(ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modifier une réservation
     * </pre>
     */
    public void updateReservation(ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public void deleteReservation(ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.SuccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public void getAllReservations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public void getReservationById(ma.projet.hotel.reservation.ReservationProto.ReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest,
                ma.projet.hotel.reservation.ReservationProto.ReservationResponse>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest,
                ma.projet.hotel.reservation.ReservationProto.ReservationResponse>(
                  this, METHODID_UPDATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest,
                ma.projet.hotel.reservation.ReservationProto.SuccessResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                ma.projet.hotel.reservation.ReservationProto.ReservationsResponse>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .addMethod(
            getGetReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.reservation.ReservationProto.ReservationRequest,
                ma.projet.hotel.reservation.ReservationProto.ReservationResponse>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * Définition des services gRPC
   * </pre>
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public void createReservation(ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifier une réservation
     * </pre>
     */
    public void updateReservation(ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public void deleteReservation(ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.SuccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public void getAllReservations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public void getReservationById(ma.projet.hotel.reservation.ReservationProto.ReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Définition des services gRPC
   * </pre>
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public ma.projet.hotel.reservation.ReservationProto.ReservationResponse createReservation(ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifier une réservation
     * </pre>
     */
    public ma.projet.hotel.reservation.ReservationProto.ReservationResponse updateReservation(ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public ma.projet.hotel.reservation.ReservationProto.SuccessResponse deleteReservation(ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public ma.projet.hotel.reservation.ReservationProto.ReservationsResponse getAllReservations(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public ma.projet.hotel.reservation.ReservationProto.ReservationResponse getReservationById(ma.projet.hotel.reservation.ReservationProto.ReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Définition des services gRPC
   * </pre>
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> createReservation(
        ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifier une réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> updateReservation(
        ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.reservation.ReservationProto.SuccessResponse> deleteReservation(
        ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.reservation.ReservationProto.ReservationsResponse> getAllReservations(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.reservation.ReservationProto.ReservationResponse> getReservationById(
        ma.projet.hotel.reservation.ReservationProto.ReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_UPDATE_RESERVATION = 1;
  private static final int METHODID_DELETE_RESERVATION = 2;
  private static final int METHODID_GET_ALL_RESERVATIONS = 3;
  private static final int METHODID_GET_RESERVATION_BY_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((ma.projet.hotel.reservation.ReservationProto.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((ma.projet.hotel.reservation.ReservationProto.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((ma.projet.hotel.reservation.ReservationProto.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.SuccessResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((ma.projet.hotel.reservation.ReservationProto.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.reservation.ReservationProto.ReservationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.hotel.reservation.ReservationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getGetReservationByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
