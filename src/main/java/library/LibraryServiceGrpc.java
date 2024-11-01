package library;

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
 * Define the Library Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Library.proto")
public final class LibraryServiceGrpc {

  private LibraryServiceGrpc() {}

  public static final String SERVICE_NAME = "library.LibraryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<library.LibraryOuterClass.AddBookRequest,
      library.LibraryOuterClass.AddBookResponse> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBook",
      requestType = library.LibraryOuterClass.AddBookRequest.class,
      responseType = library.LibraryOuterClass.AddBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<library.LibraryOuterClass.AddBookRequest,
      library.LibraryOuterClass.AddBookResponse> getAddBookMethod() {
    io.grpc.MethodDescriptor<library.LibraryOuterClass.AddBookRequest, library.LibraryOuterClass.AddBookResponse> getAddBookMethod;
    if ((getAddBookMethod = LibraryServiceGrpc.getAddBookMethod) == null) {
      synchronized (LibraryServiceGrpc.class) {
        if ((getAddBookMethod = LibraryServiceGrpc.getAddBookMethod) == null) {
          LibraryServiceGrpc.getAddBookMethod = getAddBookMethod = 
              io.grpc.MethodDescriptor.<library.LibraryOuterClass.AddBookRequest, library.LibraryOuterClass.AddBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "library.LibraryService", "AddBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  library.LibraryOuterClass.AddBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  library.LibraryOuterClass.AddBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LibraryServiceMethodDescriptorSupplier("AddBook"))
                  .build();
          }
        }
     }
     return getAddBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<library.LibraryOuterClass.SearchBookRequest,
      library.LibraryOuterClass.SearchBookResponse> getSearchBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchBook",
      requestType = library.LibraryOuterClass.SearchBookRequest.class,
      responseType = library.LibraryOuterClass.SearchBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<library.LibraryOuterClass.SearchBookRequest,
      library.LibraryOuterClass.SearchBookResponse> getSearchBookMethod() {
    io.grpc.MethodDescriptor<library.LibraryOuterClass.SearchBookRequest, library.LibraryOuterClass.SearchBookResponse> getSearchBookMethod;
    if ((getSearchBookMethod = LibraryServiceGrpc.getSearchBookMethod) == null) {
      synchronized (LibraryServiceGrpc.class) {
        if ((getSearchBookMethod = LibraryServiceGrpc.getSearchBookMethod) == null) {
          LibraryServiceGrpc.getSearchBookMethod = getSearchBookMethod = 
              io.grpc.MethodDescriptor.<library.LibraryOuterClass.SearchBookRequest, library.LibraryOuterClass.SearchBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "library.LibraryService", "SearchBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  library.LibraryOuterClass.SearchBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  library.LibraryOuterClass.SearchBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LibraryServiceMethodDescriptorSupplier("SearchBook"))
                  .build();
          }
        }
     }
     return getSearchBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LibraryServiceStub newStub(io.grpc.Channel channel) {
    return new LibraryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LibraryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LibraryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LibraryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LibraryServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Define the Library Service
   * </pre>
   */
  public static abstract class LibraryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Method to add a book
     * </pre>
     */
    public void addBook(library.LibraryOuterClass.AddBookRequest request,
        io.grpc.stub.StreamObserver<library.LibraryOuterClass.AddBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    /**
     */
    public void searchBook(library.LibraryOuterClass.SearchBookRequest request,
        io.grpc.stub.StreamObserver<library.LibraryOuterClass.SearchBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                library.LibraryOuterClass.AddBookRequest,
                library.LibraryOuterClass.AddBookResponse>(
                  this, METHODID_ADD_BOOK)))
          .addMethod(
            getSearchBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                library.LibraryOuterClass.SearchBookRequest,
                library.LibraryOuterClass.SearchBookResponse>(
                  this, METHODID_SEARCH_BOOK)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the Library Service
   * </pre>
   */
  public static final class LibraryServiceStub extends io.grpc.stub.AbstractStub<LibraryServiceStub> {
    private LibraryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to add a book
     * </pre>
     */
    public void addBook(library.LibraryOuterClass.AddBookRequest request,
        io.grpc.stub.StreamObserver<library.LibraryOuterClass.AddBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchBook(library.LibraryOuterClass.SearchBookRequest request,
        io.grpc.stub.StreamObserver<library.LibraryOuterClass.SearchBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the Library Service
   * </pre>
   */
  public static final class LibraryServiceBlockingStub extends io.grpc.stub.AbstractStub<LibraryServiceBlockingStub> {
    private LibraryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to add a book
     * </pre>
     */
    public library.LibraryOuterClass.AddBookResponse addBook(library.LibraryOuterClass.AddBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public library.LibraryOuterClass.SearchBookResponse searchBook(library.LibraryOuterClass.SearchBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchBookMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the Library Service
   * </pre>
   */
  public static final class LibraryServiceFutureStub extends io.grpc.stub.AbstractStub<LibraryServiceFutureStub> {
    private LibraryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to add a book
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<library.LibraryOuterClass.AddBookResponse> addBook(
        library.LibraryOuterClass.AddBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<library.LibraryOuterClass.SearchBookResponse> searchBook(
        library.LibraryOuterClass.SearchBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BOOK = 0;
  private static final int METHODID_SEARCH_BOOK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LibraryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LibraryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((library.LibraryOuterClass.AddBookRequest) request,
              (io.grpc.stub.StreamObserver<library.LibraryOuterClass.AddBookResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BOOK:
          serviceImpl.searchBook((library.LibraryOuterClass.SearchBookRequest) request,
              (io.grpc.stub.StreamObserver<library.LibraryOuterClass.SearchBookResponse>) responseObserver);
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

  private static abstract class LibraryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LibraryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return library.LibraryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LibraryService");
    }
  }

  private static final class LibraryServiceFileDescriptorSupplier
      extends LibraryServiceBaseDescriptorSupplier {
    LibraryServiceFileDescriptorSupplier() {}
  }

  private static final class LibraryServiceMethodDescriptorSupplier
      extends LibraryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LibraryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LibraryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LibraryServiceFileDescriptorSupplier())
              .addMethod(getAddBookMethod())
              .addMethod(getSearchBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
