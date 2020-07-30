package com.neeraj.design_patterns.behavioural.strategy;

import com.neeraj.design_patterns.behavioural.strategy.compressor.Compressor;
import com.neeraj.design_patterns.behavioural.strategy.filter.ImageFilter;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class ImageStorage {

    private Compressor compressor;
    private ImageFilter imageFilter;

    public ImageStorage(Compressor compressor, ImageFilter imageFilter) {
        this.compressor = compressor;
        this.imageFilter = imageFilter;
    }

    public void uploadImage(Image image) {
        this.compressor.compress(image);
        this.imageFilter.apply(image);
        System.out.println("Uploading the image now....." + image.getName());
    }
}
