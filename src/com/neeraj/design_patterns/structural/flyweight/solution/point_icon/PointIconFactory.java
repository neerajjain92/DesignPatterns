package com.neeraj.design_patterns.structural.flyweight.solution.point_icon;

import com.neeraj.design_patterns.structural.flyweight.problem.PointOfInterestType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PointIconFactory {
    private static Map<PointOfInterestType, PointIcon> cache = new HashMap<>();

    // Making sure no once can instantiate this class.
    private PointIconFactory() {
    }

    public static PointIcon getPointIcon(PointOfInterestType pointOfInterestType) {

        if (!cache.containsKey(pointOfInterestType)) {
            cache.put(pointOfInterestType, new PointIcon(pointOfInterestType, null));
        }
        return cache.get(pointOfInterestType);
    }
}
