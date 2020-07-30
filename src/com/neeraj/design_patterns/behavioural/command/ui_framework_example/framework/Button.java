package com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
}
