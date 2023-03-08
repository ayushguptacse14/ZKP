package com.zkp.impl;

import java.math.BigInteger;

public class UserDB {
    private String userName;
    private BigInteger y1;
    private BigInteger y2;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigInteger getY1() {
        return y1;
    }

    public void setY1(BigInteger y1) {
        this.y1 = y1;
    }

    public BigInteger getY2() {
        return y2;
    }

    public void setY2(BigInteger y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return this.getUserName() + " " + this.getY1() + " " + this.getY2();
    }
}