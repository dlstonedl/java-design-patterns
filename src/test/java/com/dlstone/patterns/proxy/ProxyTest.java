package com.dlstone.patterns.proxy;

import com.dlstone.patterns.proxy.dynamic_proxy.DynamicProxy;
import com.dlstone.patterns.proxy.dynamic_proxy.MyInvocationHandler;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;

public class ProxyTest {

    @Test
    public void validate_dynamic_proxy() {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);

        proxy.doSomething("validate proxy");
    }

    @Test
    public void validate_proxy() {
        Subject subject = new Proxy();
        subject.doSomething("subject");
    }

}
