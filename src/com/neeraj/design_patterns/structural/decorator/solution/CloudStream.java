package com.neeraj.design_patterns.structural.decorator.solution;

/**
 * @author neeraj on 21/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("Storing data in cloud.... :==> " + data);
    }
}
