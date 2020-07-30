package com.neeraj.design_patterns.behavioural.state_pattern;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class StatePatternMobileApplication {

    public static void main(String[] args) {

        /**
         * Based on in which state my Mobile is in the behavior changes
         * and at any point in time Mobile can be in just 1 particular state.
         * So this is a kind of Polymorphism.
         */
        Mobile mobile = new Mobile();
        mobile.setMobileAlertState(new RingerState());

        mobile.incomingCall();

        mobile.setMobileAlertState(new SilentState());
        mobile.incomingCall();

        mobile.setMobileAlertState(new VibrationState());
        mobile.incomingCall();
    }
}
