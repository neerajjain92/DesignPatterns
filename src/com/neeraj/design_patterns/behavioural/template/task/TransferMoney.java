package com.neeraj.design_patterns.behavioural.template.task;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class TransferMoney extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Transferring the Money...");
    }
}
