package com.dlstone.patterns.composite;

public class Leaf extends Component {

    private int value;

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public void printValue() {
        System.out.println("children: " + value);
    }

}
