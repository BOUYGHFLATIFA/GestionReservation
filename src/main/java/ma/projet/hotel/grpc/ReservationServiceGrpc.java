package ma.projet.hotel.grpc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateReservationRequest,
      ma.projet.hotel.grpc.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = ma.projet.hotel.grpc.CreateReservationRequest.class,
      responseType = ma.projet.hotel.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateReservationRequest,
      ma.projet.hotel.grpc.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateReservationRequest, ma.projet.hotel.grpc.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.CreateReservationRequest, ma.projet.hotel.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.UpdateReservationRequest,
      ma.projet.hotel.grpc.ReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = ma.projet.hotel.grpc.UpdateReservationRequest.class,
      responseType = ma.projet.hotel.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.UpdateReservationRequest,
      ma.projet.hotel.grpc.ReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.UpdateReservationRequest, ma.projet.hotel.grpc.ReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.UpdateReservationRequest, ma.projet.hotel.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.GetAllReservationsRequest,
      ma.projet.hotel.grpc.GetAllReservationsResponse> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = ma.projet.hotel.grpc.GetAllReservationsRequest.class,
      responseType = ma.projet.hotel.grpc.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.GetAllReservationsRequest,
      ma.projet.hotel.grpc.GetAllReservationsResponse> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.GetAllReservationsRequest, ma.projet.hotel.grpc.GetAllReservationsResponse> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.GetAllReservationsRequest, ma.projet.hotel.grpc.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.GetReservationByIdRequest,
      ma.projet.hotel.grpc.ReservationResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationById",
      requestType = ma.projet.hotel.grpc.GetReservationByIdRequest.class,
      responseType = ma.projet.hotel.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.GetReservationByIdRequest,
      ma.projet.hotel.grpc.ReservationResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.GetReservationByIdRequest, ma.projet.hotel.grpc.ReservationResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.GetReservationByIdRequest, ma.projet.hotel.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationById"))
                  .build();
          }
        }
     }
     return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.DeleteReservationRequest,
      ma.projet.hotel.grpc.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = ma.projet.hotel.grpc.DeleteReservationRequest.class,
      responseType = ma.projet.hotel.grpc.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.DeleteReservationRequest,
      ma.projet.hotel.grpc.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.DeleteReservationRequest, ma.projet.hotel.grpc.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.DeleteReservationRequest, ma.projet.hotel.grpc.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateClientRequest,
      ma.projet.hotel.grpc.CreateClientResponse> getCreateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClient",
      requestType = ma.projet.hotel.grpc.CreateClientRequest.class,
      responseType = ma.projet.hotel.grpc.CreateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateClientRequest,
      ma.projet.hotel.grpc.CreateClientResponse> getCreateClientMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateClientRequest, ma.projet.hotel.grpc.CreateClientResponse> getCreateClientMethod;
    if ((getCreateClientMethod = ReservationServiceGrpc.getCreateClientMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateClientMethod = ReservationServiceGrpc.getCreateClientMethod) == null) {
          ReservationServiceGrpc.getCreateClientMethod = getCreateClientMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.CreateClientRequest, ma.projet.hotel.grpc.CreateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "CreateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.CreateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.CreateClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateClient"))
                  .build();
          }
        }
     }
     return getCreateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateChambreRequest,
      ma.projet.hotel.grpc.CreateChambreResponse> getCreateChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChambre",
      requestType = ma.projet.hotel.grpc.CreateChambreRequest.class,
      responseType = ma.projet.hotel.grpc.CreateChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateChambreRequest,
      ma.projet.hotel.grpc.CreateChambreResponse> getCreateChambreMethod() {
    io.grpc.MethodDescriptor<ma.projet.hotel.grpc.CreateChambreRequest, ma.projet.hotel.grpc.CreateChambreResponse> getCreateChambreMethod;
    if ((getCreateChambreMethod = ReservationServiceGrpc.getCreateChambreMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateChambreMethod = ReservationServiceGrpc.getCreateChambreMethod) == null) {
          ReservationServiceGrpc.getCreateChambreMethod = getCreateChambreMethod = 
              io.grpc.MethodDescriptor.<ma.projet.hotel.grpc.CreateChambreRequest, ma.projet.hotel.grpc.CreateChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "CreateChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.CreateChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.hotel.grpc.CreateChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateChambre"))
                  .build();
          }
        }
     }
     return getCreateChambreMethod;
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
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Méthodes pour les réservations
     * </pre>
     */
    public void createReservation(ma.projet.hotel.grpc.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(ma.projet.hotel.grpc.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     */
    public void getAllReservations(ma.projet.hotel.grpc.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     */
    public void getReservationById(ma.projet.hotel.grpc.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(ma.projet.hotel.grpc.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Méthodes pour les clients
     * </pre>
     */
    public void createClient(ma.projet.hotel.grpc.CreateClientRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.CreateClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Méthodes pour les chambres
     * </pre>
     */
    public void createChambre(ma.projet.hotel.grpc.CreateChambreRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.CreateChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateChambreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.CreateReservationRequest,
                ma.projet.hotel.grpc.ReservationResponse>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.UpdateReservationRequest,
                ma.projet.hotel.grpc.ReservationResponse>(
                  this, METHODID_UPDATE_RESERVATION)))
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.GetAllReservationsRequest,
                ma.projet.hotel.grpc.GetAllReservationsResponse>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .addMethod(
            getGetReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.GetReservationByIdRequest,
                ma.projet.hotel.grpc.ReservationResponse>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.DeleteReservationRequest,
                ma.projet.hotel.grpc.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            getCreateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.CreateClientRequest,
                ma.projet.hotel.grpc.CreateClientResponse>(
                  this, METHODID_CREATE_CLIENT)))
          .addMethod(
            getCreateChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.hotel.grpc.CreateChambreRequest,
                ma.projet.hotel.grpc.CreateChambreResponse>(
                  this, METHODID_CREATE_CHAMBRE)))
          .build();
    }
  }

  /**
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
     * Méthodes pour les réservations
     * </pre>
     */
    public void createReservation(ma.projet.hotel.grpc.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(ma.projet.hotel.grpc.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservations(ma.projet.hotel.grpc.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(ma.projet.hotel.grpc.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(ma.projet.hotel.grpc.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Méthodes pour les clients
     * </pre>
     */
    public void createClient(ma.projet.hotel.grpc.CreateClientRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.CreateClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Méthodes pour les chambres
     * </pre>
     */
    public void createChambre(ma.projet.hotel.grpc.CreateChambreRequest request,
        io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.CreateChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateChambreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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
     * Méthodes pour les réservations
     * </pre>
     */
    public ma.projet.hotel.grpc.ReservationResponse createReservation(ma.projet.hotel.grpc.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.hotel.grpc.ReservationResponse updateReservation(ma.projet.hotel.grpc.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.hotel.grpc.GetAllReservationsResponse getAllReservations(ma.projet.hotel.grpc.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.hotel.grpc.ReservationResponse getReservationById(ma.projet.hotel.grpc.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.hotel.grpc.DeleteReservationResponse deleteReservation(ma.projet.hotel.grpc.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Méthodes pour les clients
     * </pre>
     */
    public ma.projet.hotel.grpc.CreateClientResponse createClient(ma.projet.hotel.grpc.CreateClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Méthodes pour les chambres
     * </pre>
     */
    public ma.projet.hotel.grpc.CreateChambreResponse createChambre(ma.projet.hotel.grpc.CreateChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateChambreMethod(), getCallOptions(), request);
    }
  }

  /**
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
     * Méthodes pour les réservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.ReservationResponse> createReservation(
        ma.projet.hotel.grpc.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.ReservationResponse> updateReservation(
        ma.projet.hotel.grpc.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.GetAllReservationsResponse> getAllReservations(
        ma.projet.hotel.grpc.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.ReservationResponse> getReservationById(
        ma.projet.hotel.grpc.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.DeleteReservationResponse> deleteReservation(
        ma.projet.hotel.grpc.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Méthodes pour les clients
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.CreateClientResponse> createClient(
        ma.projet.hotel.grpc.CreateClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Méthodes pour les chambres
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.hotel.grpc.CreateChambreResponse> createChambre(
        ma.projet.hotel.grpc.CreateChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateChambreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_UPDATE_RESERVATION = 1;
  private static final int METHODID_GET_ALL_RESERVATIONS = 2;
  private static final int METHODID_GET_RESERVATION_BY_ID = 3;
  private static final int METHODID_DELETE_RESERVATION = 4;
  private static final int METHODID_CREATE_CLIENT = 5;
  private static final int METHODID_CREATE_CHAMBRE = 6;

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
          serviceImpl.createReservation((ma.projet.hotel.grpc.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((ma.projet.hotel.grpc.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((ma.projet.hotel.grpc.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((ma.projet.hotel.grpc.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((ma.projet.hotel.grpc.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.DeleteReservationResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT:
          serviceImpl.createClient((ma.projet.hotel.grpc.CreateClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.CreateClientResponse>) responseObserver);
          break;
        case METHODID_CREATE_CHAMBRE:
          serviceImpl.createChambre((ma.projet.hotel.grpc.CreateChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.hotel.grpc.CreateChambreResponse>) responseObserver);
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
      return ma.projet.hotel.grpc.Reservation.getDescriptor();
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
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getCreateClientMethod())
              .addMethod(getCreateChambreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
