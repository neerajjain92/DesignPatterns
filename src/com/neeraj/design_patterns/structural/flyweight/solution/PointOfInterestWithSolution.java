package com.neeraj.design_patterns.structural.flyweight.solution;

import com.neeraj.design_patterns.structural.flyweight.solution.point_icon.PointIcon;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PointOfInterestWithSolution {

    // Coordinates
    private int x;
    private int y;
    private PointIcon pointIcon;

    public PointOfInterestWithSolution(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    /**
     * Draw this point on Map
     */
    public void draw() {
        System.out.printf("\n %s at (%d, %d)", pointIcon.getPointOfInterestType(), x, y);
    }
}
