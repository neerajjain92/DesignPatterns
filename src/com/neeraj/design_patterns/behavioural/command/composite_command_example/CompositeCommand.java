package com.neeraj.design_patterns.behavioural.command.composite_command_example;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CompositeCommand implements Command {

    List<Command> commands;

    public CompositeCommand() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
