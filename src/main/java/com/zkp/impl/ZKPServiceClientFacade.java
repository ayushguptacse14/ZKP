package com.zkp.impl;

import io.grpc.Channel;
import io.grpc.StatusRuntimeException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ZKPServiceClientFacade {

    private static final Logger logger = Logger.getLogger(ZKPServiceClientFacade.class.getName());
    private final AuthGrpc.AuthBlockingStub blockingStub;

    public ZKPServiceClientFacade(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = AuthGrpc.newBlockingStub(channel);
    }

    public void register(RegisterRequest request) {
        logger.info("Will try to register " + request.getUser() + " ...");
        RegisterResponse response;
        try {
            response = blockingStub.register(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("got this response " + response + " ...");
    }

    public AuthenticationChallengeResponse challenge(AuthenticationChallengeRequest request) {
        logger.info("Will try to challenge " + request.getUser() + " ...");
        AuthenticationChallengeResponse response;
        try {
            response = blockingStub.createAuthenticationChallenge(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            throw e;
        }
        return response;
    }

    public AuthenticationAnswerResponse verify(AuthenticationAnswerRequest request) {
        AuthenticationAnswerResponse response;
        try {
            response = blockingStub.verifyAuthentication(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            throw e;
        }
        return response;
    }
}
