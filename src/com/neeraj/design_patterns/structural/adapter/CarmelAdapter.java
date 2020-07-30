package com.neeraj.design_patterns.structural.adapter;

import com.neeraj.design_patterns.structural.adapter.third_party_filters.CarmelFilter;

/**
 * Adapter Pattern here {@link CarmelAdapter} is the Adapter
 * and {@link CarmelFilter} is the Adaptee
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CarmelAdapter implements Filter {
    private CarmelFilter carmelFilter; // Composition

    public CarmelAdapter(CarmelFilter carmelFilter) {
        this.carmelFilter = carmelFilter;
    }

    @Override
    public void apply(Image image) {
        carmelFilter.init(); // Mandatory Requirement to invoke this method by third Party
        carmelFilter.render(image);
    }
}
