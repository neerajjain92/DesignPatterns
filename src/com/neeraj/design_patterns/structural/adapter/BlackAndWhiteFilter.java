package com.neeraj.design_patterns.structural.adapter;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Applying Black And White Filter.....");
    }
}
