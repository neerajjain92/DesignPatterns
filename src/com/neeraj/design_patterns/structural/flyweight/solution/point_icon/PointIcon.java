package com.neeraj.design_patterns.structural.flyweight.solution.point_icon;

import com.neeraj.design_patterns.structural.flyweight.problem.PointOfInterestType;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PointIcon {
    // Final Since NoOne should be able to set them once constructed.
    private final PointOfInterestType pointOfInterestType;
    private final byte[] icon;

    protected PointIcon(PointOfInterestType pointOfInterestType, byte[] icon) {
        this.pointOfInterestType = pointOfInterestType;
        this.icon = icon;
    }

    public PointOfInterestType getPointOfInterestType() {
        return pointOfInterestType;
    }

    public byte[] getIcon() {
        return icon;
    }
}
