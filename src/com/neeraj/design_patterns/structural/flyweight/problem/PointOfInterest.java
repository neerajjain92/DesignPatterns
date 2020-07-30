package com.neeraj.design_patterns.structural.flyweight.problem;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PointOfInterest {

    // Coordinates
    private int x; // 4 bytes
    private int y; // 4 bytes

    // What type of point this is, Hospital, Gas Station, Restaurant etc.
    private PointOfInterestType pointOfInterestType; // 4 bytes

    // Icon which will be presented in Google Maps for this point.
    private byte[] icon; // 20 KB -----For 1000+ points in the application this will be--> 20MB
    // and that is where the problem is for small mobile devices having 30 MB memory consumed for objects will lead to crash.

    public PointOfInterest(int x, int y, PointOfInterestType pointOfInterestType, byte[] icon) {
        this.x = x;
        this.y = y;
        this.pointOfInterestType = pointOfInterestType;
        this.icon = icon;
    }

    /**
     * Draw this point on Map
     */
    public void draw() {
        System.out.printf("%s at (%d, %d)", pointOfInterestType, x, y);
    }
}
