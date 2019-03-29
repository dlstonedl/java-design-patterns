package com.dlstone.patterns.proxy;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;

public class ProxyTest {

    @Test
    public void validate_proxy() {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);

        String result = proxy.doSomething("validate proxy");

        Assert.assertEquals(result, "do something: validate proxy");
    }

}
