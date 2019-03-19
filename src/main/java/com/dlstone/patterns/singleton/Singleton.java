package com.dlstone.patterns.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
