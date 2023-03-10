package com.zkp.impl;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: zkp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "ZKP.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zkp.impl.RegisterRequest,
      com.zkp.impl.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.zkp.impl.RegisterRequest.class,
      responseType = com.zkp.impl.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zkp.impl.RegisterRequest,
      com.zkp.impl.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.zkp.impl.RegisterRequest, com.zkp.impl.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = AuthGrpc.getRegisterMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRegisterMethod = AuthGrpc.getRegisterMethod) == null) {
          AuthGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.zkp.impl.RegisterRequest, com.zkp.impl.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zkp.impl.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zkp.impl.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zkp.impl.AuthenticationChallengeRequest,
      com.zkp.impl.AuthenticationChallengeResponse> getCreateAuthenticationChallengeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthenticationChallenge",
      requestType = com.zkp.impl.AuthenticationChallengeRequest.class,
      responseType = com.zkp.impl.AuthenticationChallengeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zkp.impl.AuthenticationChallengeRequest,
      com.zkp.impl.AuthenticationChallengeResponse> getCreateAuthenticationChallengeMethod() {
    io.grpc.MethodDescriptor<com.zkp.impl.AuthenticationChallengeRequest, com.zkp.impl.AuthenticationChallengeResponse> getCreateAuthenticationChallengeMethod;
    if ((getCreateAuthenticationChallengeMethod = AuthGrpc.getCreateAuthenticationChallengeMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getCreateAuthenticationChallengeMethod = AuthGrpc.getCreateAuthenticationChallengeMethod) == null) {
          AuthGrpc.getCreateAuthenticationChallengeMethod = getCreateAuthenticationChallengeMethod =
              io.grpc.MethodDescriptor.<com.zkp.impl.AuthenticationChallengeRequest, com.zkp.impl.AuthenticationChallengeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthenticationChallenge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zkp.impl.AuthenticationChallengeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zkp.impl.AuthenticationChallengeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("CreateAuthenticationChallenge"))
              .build();
        }
      }
    }
    return getCreateAuthenticationChallengeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zkp.impl.AuthenticationAnswerRequest,
      com.zkp.impl.AuthenticationAnswerResponse> getVerifyAuthenticationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyAuthentication",
      requestType = com.zkp.impl.AuthenticationAnswerRequest.class,
      responseType = com.zkp.impl.AuthenticationAnswerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zkp.impl.AuthenticationAnswerRequest,
      com.zkp.impl.AuthenticationAnswerResponse> getVerifyAuthenticationMethod() {
    io.grpc.MethodDescriptor<com.zkp.impl.AuthenticationAnswerRequest, com.zkp.impl.AuthenticationAnswerResponse> getVerifyAuthenticationMethod;
    if ((getVerifyAuthenticationMethod = AuthGrpc.getVerifyAuthenticationMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getVerifyAuthenticationMethod = AuthGrpc.getVerifyAuthenticationMethod) == null) {
          AuthGrpc.getVerifyAuthenticationMethod = getVerifyAuthenticationMethod =
              io.grpc.MethodDescriptor.<com.zkp.impl.AuthenticationAnswerRequest, com.zkp.impl.AuthenticationAnswerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyAuthentication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zkp.impl.AuthenticationAnswerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zkp.impl.AuthenticationAnswerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("VerifyAuthentication"))
              .build();
        }
      }
    }
    return getVerifyAuthenticationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthStub>() {
        @java.lang.Override
        public AuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthStub(channel, callOptions);
        }
      };
    return AuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub>() {
        @java.lang.Override
        public AuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthBlockingStub(channel, callOptions);
        }
      };
    return AuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub>() {
        @java.lang.Override
        public AuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthFutureStub(channel, callOptions);
        }
      };
    return AuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.zkp.impl.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.zkp.impl.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void createAuthenticationChallenge(com.zkp.impl.AuthenticationChallengeRequest request,
        io.grpc.stub.StreamObserver<com.zkp.impl.AuthenticationChallengeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthenticationChallengeMethod(), responseObserver);
    }

    /**
     */
    public void verifyAuthentication(com.zkp.impl.AuthenticationAnswerRequest request,
        io.grpc.stub.StreamObserver<com.zkp.impl.AuthenticationAnswerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyAuthenticationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zkp.impl.RegisterRequest,
                com.zkp.impl.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getCreateAuthenticationChallengeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zkp.impl.AuthenticationChallengeRequest,
                com.zkp.impl.AuthenticationChallengeResponse>(
                  this, METHODID_CREATE_AUTHENTICATION_CHALLENGE)))
          .addMethod(
            getVerifyAuthenticationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zkp.impl.AuthenticationAnswerRequest,
                com.zkp.impl.AuthenticationAnswerResponse>(
                  this, METHODID_VERIFY_AUTHENTICATION)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractAsyncStub<AuthStub> {
    private AuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     */
    public void register(com.zkp.impl.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.zkp.impl.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAuthenticationChallenge(com.zkp.impl.AuthenticationChallengeRequest request,
        io.grpc.stub.StreamObserver<com.zkp.impl.AuthenticationChallengeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthenticationChallengeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyAuthentication(com.zkp.impl.AuthenticationAnswerRequest request,
        io.grpc.stub.StreamObserver<com.zkp.impl.AuthenticationAnswerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyAuthenticationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthBlockingStub> {
    private AuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zkp.impl.RegisterResponse register(com.zkp.impl.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zkp.impl.AuthenticationChallengeResponse createAuthenticationChallenge(com.zkp.impl.AuthenticationChallengeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthenticationChallengeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zkp.impl.AuthenticationAnswerResponse verifyAuthentication(com.zkp.impl.AuthenticationAnswerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyAuthenticationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractFutureStub<AuthFutureStub> {
    private AuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zkp.impl.RegisterResponse> register(
        com.zkp.impl.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zkp.impl.AuthenticationChallengeResponse> createAuthenticationChallenge(
        com.zkp.impl.AuthenticationChallengeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthenticationChallengeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zkp.impl.AuthenticationAnswerResponse> verifyAuthentication(
        com.zkp.impl.AuthenticationAnswerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyAuthenticationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_CREATE_AUTHENTICATION_CHALLENGE = 1;
  private static final int METHODID_VERIFY_AUTHENTICATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.zkp.impl.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.zkp.impl.RegisterResponse>) responseObserver);
          break;
        case METHODID_CREATE_AUTHENTICATION_CHALLENGE:
          serviceImpl.createAuthenticationChallenge((com.zkp.impl.AuthenticationChallengeRequest) request,
              (io.grpc.stub.StreamObserver<com.zkp.impl.AuthenticationChallengeResponse>) responseObserver);
          break;
        case METHODID_VERIFY_AUTHENTICATION:
          serviceImpl.verifyAuthentication((com.zkp.impl.AuthenticationAnswerRequest) request,
              (io.grpc.stub.StreamObserver<com.zkp.impl.AuthenticationAnswerResponse>) responseObserver);
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zkp.impl.ZKPProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getCreateAuthenticationChallengeMethod())
              .addMethod(getVerifyAuthenticationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
