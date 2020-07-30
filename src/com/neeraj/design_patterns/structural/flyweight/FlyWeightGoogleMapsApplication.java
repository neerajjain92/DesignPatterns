package com.neeraj.design_patterns.structural.flyweight;

import com.neeraj.design_patterns.structural.flyweight.problem.PointOfInterest;
import com.neeraj.design_patterns.structural.flyweight.problem.PointService;
import com.neeraj.design_patterns.structural.flyweight.solution.FlyWeightPointService;
import com.neeraj.design_patterns.structural.flyweight.solution.PointOfInterestWithSolution;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class FlyWeightGoogleMapsApplication {

    public static void main(String[] args) {
        var pointService = new PointService();
        for (PointOfInterest point : pointService.getPoints()) {
            point.draw();
        }

        var posService = new FlyWeightPointService();
        for (PointOfInterestWithSolution pointOfInterestWithSolution : posService.getPoints()) {
            pointOfInterestWithSolution.draw();
        }
    }
}
