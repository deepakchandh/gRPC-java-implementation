package org.deepak.grpc.protoFiles;

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
    comments = "Source: products.proto")
public final class productsGrpc {

  private productsGrpc() {}

  public static final String SERVICE_NAME = "products";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.prodId,
      org.deepak.grpc.protoFiles.Products.APIResponse> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProduct",
      requestType = org.deepak.grpc.protoFiles.Products.prodId.class,
      responseType = org.deepak.grpc.protoFiles.Products.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.prodId,
      org.deepak.grpc.protoFiles.Products.APIResponse> getGetProductMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.prodId, org.deepak.grpc.protoFiles.Products.APIResponse> getGetProductMethod;
    if ((getGetProductMethod = productsGrpc.getGetProductMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getGetProductMethod = productsGrpc.getGetProductMethod) == null) {
          productsGrpc.getGetProductMethod = getGetProductMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Products.prodId, org.deepak.grpc.protoFiles.Products.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "getProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Products.prodId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Products.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("getProduct"))
                  .build();
          }
        }
     }
     return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.product,
      org.deepak.grpc.protoFiles.Products.APIResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProduct",
      requestType = org.deepak.grpc.protoFiles.Products.product.class,
      responseType = org.deepak.grpc.protoFiles.Products.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.product,
      org.deepak.grpc.protoFiles.Products.APIResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.product, org.deepak.grpc.protoFiles.Products.APIResponse> getAddProductMethod;
    if ((getAddProductMethod = productsGrpc.getAddProductMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getAddProductMethod = productsGrpc.getAddProductMethod) == null) {
          productsGrpc.getAddProductMethod = getAddProductMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Products.product, org.deepak.grpc.protoFiles.Products.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "addProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Products.product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Products.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("addProduct"))
                  .build();
          }
        }
     }
     return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.prodId,
      org.deepak.grpc.protoFiles.Products.APIResponse> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProduct",
      requestType = org.deepak.grpc.protoFiles.Products.prodId.class,
      responseType = org.deepak.grpc.protoFiles.Products.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.prodId,
      org.deepak.grpc.protoFiles.Products.APIResponse> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Products.prodId, org.deepak.grpc.protoFiles.Products.APIResponse> getDeleteProductMethod;
    if ((getDeleteProductMethod = productsGrpc.getDeleteProductMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getDeleteProductMethod = productsGrpc.getDeleteProductMethod) == null) {
          productsGrpc.getDeleteProductMethod = getDeleteProductMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Products.prodId, org.deepak.grpc.protoFiles.Products.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "deleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Products.prodId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Products.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("deleteProduct"))
                  .build();
          }
        }
     }
     return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static productsStub newStub(io.grpc.Channel channel) {
    return new productsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static productsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new productsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static productsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new productsFutureStub(channel);
  }

  /**
   */
  public static abstract class productsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProduct(org.deepak.grpc.protoFiles.Products.prodId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    public void addProduct(org.deepak.grpc.protoFiles.Products.product request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(org.deepak.grpc.protoFiles.Products.prodId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Products.prodId,
                org.deepak.grpc.protoFiles.Products.APIResponse>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getAddProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Products.product,
                org.deepak.grpc.protoFiles.Products.APIResponse>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            getDeleteProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Products.prodId,
                org.deepak.grpc.protoFiles.Products.APIResponse>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class productsStub extends io.grpc.stub.AbstractStub<productsStub> {
    private productsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productsStub(channel, callOptions);
    }

    /**
     */
    public void getProduct(org.deepak.grpc.protoFiles.Products.prodId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProduct(org.deepak.grpc.protoFiles.Products.product request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(org.deepak.grpc.protoFiles.Products.prodId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class productsBlockingStub extends io.grpc.stub.AbstractStub<productsBlockingStub> {
    private productsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productsBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Products.APIResponse getProduct(org.deepak.grpc.protoFiles.Products.prodId request) {
      return blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Products.APIResponse addProduct(org.deepak.grpc.protoFiles.Products.product request) {
      return blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Products.APIResponse deleteProduct(org.deepak.grpc.protoFiles.Products.prodId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class productsFutureStub extends io.grpc.stub.AbstractStub<productsFutureStub> {
    private productsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Products.APIResponse> getProduct(
        org.deepak.grpc.protoFiles.Products.prodId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Products.APIResponse> addProduct(
        org.deepak.grpc.protoFiles.Products.product request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Products.APIResponse> deleteProduct(
        org.deepak.grpc.protoFiles.Products.prodId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT = 0;
  private static final int METHODID_ADD_PRODUCT = 1;
  private static final int METHODID_DELETE_PRODUCT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final productsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(productsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((org.deepak.grpc.protoFiles.Products.prodId) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((org.deepak.grpc.protoFiles.Products.product) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((org.deepak.grpc.protoFiles.Products.prodId) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Products.APIResponse>) responseObserver);
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

  private static abstract class productsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    productsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.deepak.grpc.protoFiles.Products.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("products");
    }
  }

  private static final class productsFileDescriptorSupplier
      extends productsBaseDescriptorSupplier {
    productsFileDescriptorSupplier() {}
  }

  private static final class productsMethodDescriptorSupplier
      extends productsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    productsMethodDescriptorSupplier(String methodName) {
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
      synchronized (productsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new productsFileDescriptorSupplier())
              .addMethod(getGetProductMethod())
              .addMethod(getAddProductMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
