package com.neeraj.design_patterns.structural.flyweight.solution;

import com.neeraj.design_patterns.structural.flyweight.problem.PointOfInterestType;
import com.neeraj.design_patterns.structural.flyweight.solution.point_icon.PointIconFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class FlyWeightPointService {

    public List<PointOfInterestWithSolution> getPoints() {
        // In real-world scenario we should get this data from Database.
        List<PointOfInterestWithSolution> pointOfInterests = new ArrayList<>();
        var pointIcon = PointIconFactory.getPointIcon(PointOfInterestType.HOSPITAL);
        var point = new PointOfInterestWithSolution(3, 4, pointIcon);
        pointOfInterests.add(point);
        return pointOfInterests;
    }
}
