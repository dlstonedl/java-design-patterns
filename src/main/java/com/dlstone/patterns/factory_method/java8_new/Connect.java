package com.dlstone.patterns.factory_method.java8_new;

public interface Connect {

    static Connect makeConnect(String type) {
        if (type.equals("rpc")) {
            return new RpcConnect();
        } else {
            return new HttpConnect();
        }
    }

    void connect();
}
