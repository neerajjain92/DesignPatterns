package com.neeraj.design_patterns.structural.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PointService {

    public List<PointOfInterest> getPoints() {
        // In real-world scenario we should get this data from Database.
        List<PointOfInterest> pointOfInterests = new ArrayList<>();
        var point = new PointOfInterest(1, 2, PointOfInterestType.CAFE, null);
        pointOfInterests.add(point);
        return pointOfInterests;
    }
}
