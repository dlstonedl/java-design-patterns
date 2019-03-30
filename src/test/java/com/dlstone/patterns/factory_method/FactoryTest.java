package com.dlstone.patterns.factory_method;

import com.dlstone.patterns.factory_method.java8_new.Connect;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void validate_java8_factory_method() {
        Connect product = Connect.makeConnect("rpc");
        product.connect();
    }

    @Test
    public void validate_factory_method() {
        Factory factory = new FactoryOne();
        Product product = factory.makeProduct();
        product.doSomething();
    }

}
