package com.dlstone.patterns.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        new BeforeAdvice().exec();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
