package com.neeraj.design_patterns.behavioural.strategy;

import com.neeraj.design_patterns.behavioural.strategy.compressor.PNGCompressor;
import com.neeraj.design_patterns.behavioural.strategy.filter.BlackAndWhiteFilter;
import com.neeraj.design_patterns.behavioural.strategy.filter.VividFilter;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class StrategyDesignPatternApplication {

    public static void main(String[] args) {
        var compressor = new PNGCompressor();
        var filter = new BlackAndWhiteFilter();

        var imageStorage = new ImageStorage(compressor, filter);
        imageStorage.uploadImage(new Image("abc.jpeg"));

        imageStorage = new ImageStorage(compressor, new VividFilter());
        imageStorage.uploadImage(new Image("yyt.png"));
    }
}
