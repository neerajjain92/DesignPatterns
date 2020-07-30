package com.neeraj.design_patterns.structural.composite.shape_example;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Square implements Shape {
    @Override
    public void render() {
        System.out.println("Rendering Square.....");
    }

    @Override
    public void move(String fromLocation, String toLocation) {
        System.out.println("Moving Square from "+ fromLocation + " to "+ toLocation);
    }
}
