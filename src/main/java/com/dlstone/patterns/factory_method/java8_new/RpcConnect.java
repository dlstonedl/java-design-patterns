package com.dlstone.patterns.factory_method.java8_new;

public class RpcConnect implements Connect {

    @Override
    public void connect() {
        System.out.println("RpcConnect connect...");
    }

}
