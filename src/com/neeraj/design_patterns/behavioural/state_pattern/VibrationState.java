package com.neeraj.design_patterns.behavioural.state_pattern;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class VibrationState extends MobileAlertState {
    @Override
    public void handleAlert() {
        System.out.println("You phone is coming and is in a vibration state....");
    }
}
