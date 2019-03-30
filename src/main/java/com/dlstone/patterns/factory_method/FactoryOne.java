package com.dlstone.patterns.factory_method;

public class FactoryOne implements Factory {

    @Override
    public Product makeProduct() {
        return new ProductOne();
    }

}
