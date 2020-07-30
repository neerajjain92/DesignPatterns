package com.neeraj.design_patterns.structural.composite.shape_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Group implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void render() {
        for (Component component : components) {
            component.render();
        }
    }

    @Override
    public void move(String fromLocation, String toLocation) {
        for(Component component: components) {
            component.move(fromLocation, toLocation);
        }
    }
}
