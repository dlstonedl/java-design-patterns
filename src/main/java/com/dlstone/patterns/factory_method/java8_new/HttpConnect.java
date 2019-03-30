package com.dlstone.patterns.factory_method.java8_new;

public class HttpConnect implements Connect {

    @Override
    public void connect() {
        System.out.println("HttpConnect connect...");
    }

}
