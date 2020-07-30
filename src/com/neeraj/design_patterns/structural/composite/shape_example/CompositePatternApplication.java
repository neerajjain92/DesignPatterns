package com.neeraj.design_patterns.structural.composite.shape_example;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CompositePatternApplication {

    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Square());
        group1.add(new Circle());

        var group2 = new Group();
        group1.add(new Circle());
        group1.add(new Square());

        // As you can see we are treating the Group and the Shapes in the same way
        // This is like a directory
        // where in whenever we move a directory, the inner directory moves along with it.
        // and same applies to a file.
        var outerGroup = new Group();
        outerGroup.add(group1);
        outerGroup.add(group2);
        outerGroup.render();
        outerGroup.move("C Drive", "D Drive");
    }
}
