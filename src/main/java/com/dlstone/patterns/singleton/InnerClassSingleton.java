package com.dlstone.patterns.singleton;

public final class InnerClassSingleton {
    private InnerClassSingleton() {}

    private static class InnerClassSingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.INSTANCE;
    }
}
