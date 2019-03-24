package com.dlstone.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void printValue() {
        System.out.println("composite start");
        for (int i = 0; i < children.size(); i++) {
            children.get(i).printValue();
        }
        System.out.println("composite end");
    }

}
