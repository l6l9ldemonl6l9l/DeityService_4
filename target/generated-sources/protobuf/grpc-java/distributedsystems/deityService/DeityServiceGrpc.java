package distributedsystems.deityService;

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
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: deity.proto")
public final class DeityServiceGrpc {

  private DeityServiceGrpc() {}

  public static final String SERVICE_NAME = "distributedsystems.deityService.DeityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<distributedsystems.deityService.AllDeityRequest,
      distributedsystems.deityService.AllDeityResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = distributedsystems.deityService.AllDeityRequest.class,
      responseType = distributedsystems.deityService.AllDeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.deityService.AllDeityRequest,
      distributedsystems.deityService.AllDeityResponse> getAllMethod() {
    io.grpc.MethodDescriptor<distributedsystems.deityService.AllDeityRequest, distributedsystems.deityService.AllDeityResponse> getAllMethod;
    if ((getAllMethod = DeityServiceGrpc.getAllMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getAllMethod = DeityServiceGrpc.getAllMethod) == null) {
          DeityServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<distributedsystems.deityService.AllDeityRequest, distributedsystems.deityService.AllDeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.AllDeityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.AllDeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.deityService.DeityRequest,
      distributedsystems.deityService.DeityResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = distributedsystems.deityService.DeityRequest.class,
      responseType = distributedsystems.deityService.DeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.deityService.DeityRequest,
      distributedsystems.deityService.DeityResponse> getAddMethod() {
    io.grpc.MethodDescriptor<distributedsystems.deityService.DeityRequest, distributedsystems.deityService.DeityResponse> getAddMethod;
    if ((getAddMethod = DeityServiceGrpc.getAddMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getAddMethod = DeityServiceGrpc.getAddMethod) == null) {
          DeityServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<distributedsystems.deityService.DeityRequest, distributedsystems.deityService.DeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByIdRequest,
      distributedsystems.deityService.DeityResponse> getByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byId",
      requestType = distributedsystems.deityService.DeityByIdRequest.class,
      responseType = distributedsystems.deityService.DeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByIdRequest,
      distributedsystems.deityService.DeityResponse> getByIdMethod() {
    io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByIdRequest, distributedsystems.deityService.DeityResponse> getByIdMethod;
    if ((getByIdMethod = DeityServiceGrpc.getByIdMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getByIdMethod = DeityServiceGrpc.getByIdMethod) == null) {
          DeityServiceGrpc.getByIdMethod = getByIdMethod =
              io.grpc.MethodDescriptor.<distributedsystems.deityService.DeityByIdRequest, distributedsystems.deityService.DeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("byId"))
              .build();
        }
      }
    }
    return getByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByNameRequest,
      distributedsystems.deityService.DeityResponse> getByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byName",
      requestType = distributedsystems.deityService.DeityByNameRequest.class,
      responseType = distributedsystems.deityService.DeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByNameRequest,
      distributedsystems.deityService.DeityResponse> getByNameMethod() {
    io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByNameRequest, distributedsystems.deityService.DeityResponse> getByNameMethod;
    if ((getByNameMethod = DeityServiceGrpc.getByNameMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getByNameMethod = DeityServiceGrpc.getByNameMethod) == null) {
          DeityServiceGrpc.getByNameMethod = getByNameMethod =
              io.grpc.MethodDescriptor.<distributedsystems.deityService.DeityByNameRequest, distributedsystems.deityService.DeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("byName"))
              .build();
        }
      }
    }
    return getByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByIdRequest,
      distributedsystems.deityService.DeleteDeityResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = distributedsystems.deityService.DeityByIdRequest.class,
      responseType = distributedsystems.deityService.DeleteDeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByIdRequest,
      distributedsystems.deityService.DeleteDeityResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<distributedsystems.deityService.DeityByIdRequest, distributedsystems.deityService.DeleteDeityResponse> getDeleteMethod;
    if ((getDeleteMethod = DeityServiceGrpc.getDeleteMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getDeleteMethod = DeityServiceGrpc.getDeleteMethod) == null) {
          DeityServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<distributedsystems.deityService.DeityByIdRequest, distributedsystems.deityService.DeleteDeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeityByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.deityService.DeleteDeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeityServiceStub>() {
        @java.lang.Override
        public DeityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeityServiceStub(channel, callOptions);
        }
      };
    return DeityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeityServiceBlockingStub>() {
        @java.lang.Override
        public DeityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeityServiceBlockingStub(channel, callOptions);
        }
      };
    return DeityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeityServiceFutureStub>() {
        @java.lang.Override
        public DeityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeityServiceFutureStub(channel, callOptions);
        }
      };
    return DeityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void all(distributedsystems.deityService.AllDeityRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.AllDeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void add(distributedsystems.deityService.DeityRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void byId(distributedsystems.deityService.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByIdMethod(), responseObserver);
    }

    /**
     */
    public void byName(distributedsystems.deityService.DeityByNameRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByNameMethod(), responseObserver);
    }

    /**
     */
    public void delete(distributedsystems.deityService.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeleteDeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.deityService.AllDeityRequest,
                distributedsystems.deityService.AllDeityResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.deityService.DeityRequest,
                distributedsystems.deityService.DeityResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.deityService.DeityByIdRequest,
                distributedsystems.deityService.DeityResponse>(
                  this, METHODID_BY_ID)))
          .addMethod(
            getByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.deityService.DeityByNameRequest,
                distributedsystems.deityService.DeityResponse>(
                  this, METHODID_BY_NAME)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.deityService.DeityByIdRequest,
                distributedsystems.deityService.DeleteDeityResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class DeityServiceStub extends io.grpc.stub.AbstractAsyncStub<DeityServiceStub> {
    private DeityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeityServiceStub(channel, callOptions);
    }

    /**
     */
    public void all(distributedsystems.deityService.AllDeityRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.AllDeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(distributedsystems.deityService.DeityRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byId(distributedsystems.deityService.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byName(distributedsystems.deityService.DeityByNameRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(distributedsystems.deityService.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.deityService.DeleteDeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeityServiceBlockingStub> {
    private DeityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public distributedsystems.deityService.AllDeityResponse all(distributedsystems.deityService.AllDeityRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.deityService.DeityResponse add(distributedsystems.deityService.DeityRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.deityService.DeityResponse byId(distributedsystems.deityService.DeityByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.deityService.DeityResponse byName(distributedsystems.deityService.DeityByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.deityService.DeleteDeityResponse delete(distributedsystems.deityService.DeityByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeityServiceFutureStub> {
    private DeityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.deityService.AllDeityResponse> all(
        distributedsystems.deityService.AllDeityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.deityService.DeityResponse> add(
        distributedsystems.deityService.DeityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.deityService.DeityResponse> byId(
        distributedsystems.deityService.DeityByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.deityService.DeityResponse> byName(
        distributedsystems.deityService.DeityByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.deityService.DeleteDeityResponse> delete(
        distributedsystems.deityService.DeityByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL = 0;
  private static final int METHODID_ADD = 1;
  private static final int METHODID_BY_ID = 2;
  private static final int METHODID_BY_NAME = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((distributedsystems.deityService.AllDeityRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.deityService.AllDeityResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((distributedsystems.deityService.DeityRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse>) responseObserver);
          break;
        case METHODID_BY_ID:
          serviceImpl.byId((distributedsystems.deityService.DeityByIdRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse>) responseObserver);
          break;
        case METHODID_BY_NAME:
          serviceImpl.byName((distributedsystems.deityService.DeityByNameRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.deityService.DeityResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((distributedsystems.deityService.DeityByIdRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.deityService.DeleteDeityResponse>) responseObserver);
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

  private static abstract class DeityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return distributedsystems.deityService.Deity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeityService");
    }
  }

  private static final class DeityServiceFileDescriptorSupplier
      extends DeityServiceBaseDescriptorSupplier {
    DeityServiceFileDescriptorSupplier() {}
  }

  private static final class DeityServiceMethodDescriptorSupplier
      extends DeityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeityServiceFileDescriptorSupplier())
              .addMethod(getAllMethod())
              .addMethod(getAddMethod())
              .addMethod(getByIdMethod())
              .addMethod(getByNameMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
