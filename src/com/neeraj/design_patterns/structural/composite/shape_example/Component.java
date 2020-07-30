package com.neeraj.design_patterns.structural.composite.shape_example;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public interface Component {
    void render();
    void move(final String fromLocation, final String toLocation);
}
