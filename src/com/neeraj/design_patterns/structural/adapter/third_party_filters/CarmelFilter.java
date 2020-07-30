package com.neeraj.design_patterns.structural.adapter.third_party_filters;

import com.neeraj.design_patterns.structural.adapter.Image;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CarmelFilter {

    public void init() {

    }

    public void render(Image image) {
        System.out.println("Applying Carmel Filter....");
    }
}
