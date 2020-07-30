package com.neeraj.design_patterns.behavioural.command.composite_command_example;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Command;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Applying the Resize command....");
    }
}
