package com.neeraj.design_patterns.behavioural.strategy.compressor;

import com.neeraj.design_patterns.behavioural.strategy.Image;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PNGCompressor implements Compressor {
    @Override
    public void compress(Image image) {
        System.out.println("Compressing image --> " + image.getName() + " using PNG compression");
    }
}
