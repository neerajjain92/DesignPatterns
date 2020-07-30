package com.neeraj.design_patterns.behavioural.observer.excel;

/**
 * @author neeraj on 31/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PieChartObserver implements Observer {
    @Override
    public void update() {
        System.out.println("PieChart Updated......");
    }
}
