package com.neeraj.design_patterns.behavioural.command.composite_command_example;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CompositeCommandApplication {

    public static void main(String[] args) {
        var compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new ResizeCommand());
        compositeCommand.addCommand(new BlackAndWhiteCommand());

        /**
         * This way we can group multiple commands and execute them replay them.
         */
        compositeCommand.execute();

        // Executing the command again.
        compositeCommand.execute();
    }
}
