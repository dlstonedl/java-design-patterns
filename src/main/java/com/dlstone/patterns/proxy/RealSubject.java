package com.dlstone.patterns.proxy;

public class RealSubject implements Subject {

    @Override
    public String doSomething(String str) {
        return "do something: " + str;
    }
}
