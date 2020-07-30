package com.neeraj.design_patterns.behavioural.strategy.filter;

import com.neeraj.design_patterns.behavioural.strategy.Image;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class BlackAndWhiteFilter implements ImageFilter {
    @Override
    public void apply(Image image) {
        System.out.println("Black and White Filter applied on " + image.getName());
    }
}
