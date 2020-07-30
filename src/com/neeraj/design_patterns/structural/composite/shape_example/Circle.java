package com.neeraj.design_patterns.structural.composite.shape_example;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Circle implements Shape {
    @Override
    public void render() {
        System.out.println("Rendering Circle.....");
    }

    @Override
    public void move(String fromLocation, String toLocation) {
        System.out.println("Moving Circle from "+ fromLocation + " to "+ toLocation);
    }
}
