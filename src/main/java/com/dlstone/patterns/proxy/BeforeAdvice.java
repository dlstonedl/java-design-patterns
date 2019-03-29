package com.dlstone.patterns.proxy;

public class BeforeAdvice implements Advice {

    @Override
    public void exec() {
        System.out.println("before advice");
    }
}
