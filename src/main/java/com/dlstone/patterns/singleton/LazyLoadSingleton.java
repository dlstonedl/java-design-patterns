package com.dlstone.patterns.singleton;

public final class LazyLoadSingleton {
    private static volatile LazyLoadSingleton instance;

    private LazyLoadSingleton() {}

    public synchronized static LazyLoadSingleton getInstance() {
        if(instance == null) {
            instance = new LazyLoadSingleton();
        }

        return instance;
    }

}
