package com.dlstone.patterns.factory_method;

public class FactoryTwo implements Factory {

    @Override
    public Product makeProduct() {
        return new ProductTwo();
    }
}
