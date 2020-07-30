package com.neeraj.design_patterns.behavioural.state_pattern;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Mobile {

    private MobileAlertState mobileAlertState;

    public void setMobileAlertState(MobileAlertState mobileAlertState) {
        this.mobileAlertState = mobileAlertState;
    }

    public void incomingCall() {
        this.mobileAlertState.handleAlert();
    }
}
