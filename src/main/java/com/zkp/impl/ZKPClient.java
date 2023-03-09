package com.zkp.impl;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static com.zkp.impl.ZKPClientUtil.registerUser;
import static com.zkp.impl.ZKPClientUtil.loginUser;

/**
 * A simple client from the {@link ZKPServer}.
 */
public class ZKPClient {
  private static final Logger logger = Logger.getLogger(ZKPClient.class.getName());

  private final ZKPServiceClientFacade zkpClient;

  public ZKPClient(Channel channel) {
     this.zkpClient = new ZKPServiceClientFacade(channel);
  }

  public void register(RegisterRequest request) {
    zkpClient.register(request);
  }

  public AuthenticationChallengeResponse challenge(AuthenticationChallengeRequest request) {
    return zkpClient.challenge(request);
  }

  public AuthenticationAnswerResponse verify(AuthenticationAnswerRequest request) {
    return zkpClient.verify(request);
  }

  public static void main(String[] args) throws Exception {
    String target = "localhost:50051";
    boolean isRegister = "-register".equals(args[0]);
    boolean isLogin = "-login".equals(args[0]);
    String user = args[1];
    int x = (int) Long.parseLong(args[2]);

    // Create a communication channel to the server, known as a Channel. Channels are thread-safe
    // and reusable. It is common to create channels at the beginning of your application and reuse
    // them until the application shuts down.
    //
    // For the example we use plaintext insecure credentials to avoid needing TLS certificates. To
    // use TLS, use TlsChannelCredentials instead.
    ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
            .build();
    try {
      ZKPClient client = new ZKPClient(channel);
      if(isRegister) {
        registerUser(client, user, x);
      }
      else if(isLogin) {
        loginUser(client, user, x);
      }
      else {
        logger.info("Invalid Command. Please try available command \n Register using ./build/install/examples/bin/zkp-client -register username Id(Int) \nLogin Using ./build/install/examples/bin/zkp-client -login username Id(Int)");
      }
    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
      // resources the channel should be shut down when it will no longer be used. If it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}