package com.dlstone.patterns.factory_method.java8_new;

public class RpcConnect implements Connect {

    RpcConnect(){}

    @Override
    public void connect() {
        System.out.println("RpcConnect connect...");
    }

}
