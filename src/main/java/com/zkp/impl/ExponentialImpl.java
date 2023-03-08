package com.zkp.impl;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

public class ExponentialImpl extends AuthGrpc.AuthImplBase {

    private static final Logger logger = Logger.getLogger(ExponentialImpl.class.getName());
    private final Map<String, UserDB> userDBMap;
    private final Map<String, ActiveAuthSessionsDB> activeAuthSessionsDBMap;

    public ExponentialImpl() {
        userDBMap = new HashMap<>();
        activeAuthSessionsDBMap = new HashMap<>();
    }

    @Override
    public void register(RegisterRequest req, StreamObserver<RegisterResponse> responseObserver) {
        System.out.println("register req " + req);
        UserDB user = new UserDB();
        user.setUserName(req.getUser());
        user.setY1(new BigInteger(req.getY1()));
        user.setY2(new BigInteger(req.getY2()));
        userDBMap.put(req.getUser(), user);
        logger.info("DB entry" + userDBMap.get(req.getUser()).toString());
        RegisterResponse reply = RegisterResponse.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void createAuthenticationChallenge(AuthenticationChallengeRequest req, StreamObserver<AuthenticationChallengeResponse> responseObserver) {
        System.out.println("challenge req " + req);
        try {
            if(!userDBMap.containsKey(req.getUser())) throw new Exception("User Does not exist!!");
            String authId = UUID.randomUUID().toString();
            String sessionId = UUID.randomUUID().toString();
            long c = Constants.leftLimit + (long) (Math.random() * (Constants.rightLimit - Constants.leftLimit));

            ActiveAuthSessionsDB authSession = new ActiveAuthSessionsDB();
            authSession.setAuthId(authId);
            authSession.setSessionId(sessionId);
            authSession.setUserName(req.getUser());
            authSession.setC(c);
            authSession.setR1(new BigInteger(req.getR1()));
            authSession.setR2(new BigInteger(req.getR2()));
            activeAuthSessionsDBMap.put(authId, authSession);
            logger.info("DB entry" + activeAuthSessionsDBMap.get(authId).toString());
            AuthenticationChallengeResponse response = AuthenticationChallengeResponse.newBuilder().setAuthId(authId).setC(c).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL.withDescription(e.getMessage())
                    .asRuntimeException());
        }

    }

    @Override
    public void verifyAuthentication(AuthenticationAnswerRequest req, StreamObserver<AuthenticationAnswerResponse> responseObserver) {
        System.out.println("verify req " + req);
        String authId = req.getAuthId();
        ActiveAuthSessionsDB authSession = activeAuthSessionsDBMap.get(authId);
        String userName = authSession.getUserName();
        UserDB user = userDBMap.get(userName);
        BigInteger exp1, exp2;
        if(req.getS() >= 0) {
            exp1 = (Constants.g.pow((int)req.getS()).multiply(user.getY1().pow((int)authSession.getC())));
            exp2 = (Constants.h.pow((int)req.getS()).multiply(user.getY2().pow((int)authSession.getC())));
        } else {
            exp1 = (user.getY1().pow((int)authSession.getC())).divide(Constants.g.pow((int)Math.abs(req.getS())));
            exp2 = (user.getY2().pow((int)authSession.getC())).divide(Constants.h.pow((int)Math.abs(req.getS())));
        }
        logger.info("exp1" + exp1);
        logger.info("exp2" + exp2);

        AuthenticationAnswerResponse response;
        if(exp1.equals(authSession.getR1()) && exp2.equals(authSession.getR2())) {
            response = AuthenticationAnswerResponse.newBuilder().setSessionId(authSession.getSessionId()).build();
        } else {
            response = AuthenticationAnswerResponse.newBuilder().setSessionId("INVALID").build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}