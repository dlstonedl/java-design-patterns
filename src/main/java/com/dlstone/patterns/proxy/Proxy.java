package com.dlstone.patterns.proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void doSomething(String str) {
        realSubject.doSomething(str);
    }
}
