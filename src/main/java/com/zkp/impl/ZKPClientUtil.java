package com.zkp.impl;

import java.math.BigInteger;
import java.util.logging.Logger;

public class ZKPClientUtil {

    private static final Logger logger = Logger.getLogger(ZKPClientUtil.class.getName());

    public static void registerUser(ZKPClient zkpClient, String userName, int x) {
        BigInteger y1 = Constants.g.pow(x);
        BigInteger y2 = Constants.h.pow(x);
        RegisterRequest req = RegisterRequest.newBuilder().setUser(userName).setY1(y1.toString()).setY2(y2.toString()).build();
        zkpClient.register(req);
    }

    public static void loginUser(ZKPClient zkpClient, String userName, int x) {
        int k = Constants.leftLimit + (int) (Math.random() * (Constants.rightLimit - Constants.leftLimit));
        logger.info("Username " + userName);
        BigInteger r1 = Constants.g.pow(k);
        BigInteger r2 = Constants.h.pow(k);
        logger.info("k " + k + " r1 " + r1 + " r2 " + r2);
        AuthenticationChallengeRequest authenticationChallengeRequest = AuthenticationChallengeRequest.newBuilder()
                .setUser(userName)
                .setR1(r1.toString())
                .setR2(r2.toString())
                .build();
        AuthenticationChallengeResponse authenticationChallengeResponse = zkpClient.challenge(authenticationChallengeRequest);
        long c = authenticationChallengeResponse.getC();

        long s = (k - (c*x))% Constants.mod;

        AuthenticationAnswerRequest request = AuthenticationAnswerRequest.newBuilder()
                .setAuthId(authenticationChallengeResponse.getAuthId())
                .setS(s)
                .build();
        AuthenticationAnswerResponse response = zkpClient.verify(request);
        logger.info("Login result " + response.getSessionId());
    }
}
