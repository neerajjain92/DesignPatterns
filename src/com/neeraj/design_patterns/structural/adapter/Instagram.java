package com.neeraj.design_patterns.structural.adapter;

import com.neeraj.design_patterns.structural.adapter.third_party_filters.CarmelFilter;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Instagram {

    public static void main(String[] args) {
        var imagePreview = new ImagePreview(new Image());
        imagePreview.apply(new VividFilter());
        imagePreview.apply(new BlackAndWhiteFilter());

        // We are adapting Carmel Filter using CarmelAdapter
        // even though Carmel Filter doesn't implement filter method.
        imagePreview.apply(new CarmelAdapter(new CarmelFilter()));
    }
}
