package com.dlstone.patterns.composite;

import org.junit.Test;

public class CompositeTest {

    @Test
    public void validate_composite() {
        Composite root = new Composite();

        Composite one = new Composite();
        Leaf leaf1 = new Leaf(1);
        Leaf leaf2 = new Leaf(2);
        one.add(leaf1);
        one.add(leaf2);
        root.add(one);

        Leaf leaf3 = new Leaf(3);
        root.add(leaf3);

        root.printValue();
    }

}
