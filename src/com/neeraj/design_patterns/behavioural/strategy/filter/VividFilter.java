package com.neeraj.design_patterns.behavioural.strategy.filter;

import com.neeraj.design_patterns.behavioural.strategy.Image;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class VividFilter implements ImageFilter {
    @Override
    public void apply(Image image) {
        System.out.println("Vivid Filter applied on " + image.getName());
    }
}
