package com.zkp.impl;

import java.math.BigInteger;

public class ActiveAuthSessionsDB {
    private String authId;
    private String userName;
    private String sessionId;
    private BigInteger r1;
    private BigInteger r2;
    private long c;

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public BigInteger getR1() {
        return r1;
    }

    public void setR1(BigInteger r1) {
        this.r1 = r1;
    }

    public BigInteger getR2() {
        return r2;
    }

    public void setR2(BigInteger r2) {
        this.r2 = r2;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return this.getAuthId() + " " + this.getSessionId() + " " + this.getUserName() + " " + this.getC() + " " + this.getR1()+ " " + this.getR2();
    }
}
