package com.neeraj.design_patterns.structural.decorator.solution;

/**
 * @author neeraj on 21/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CompressorStream implements Stream {

    private Stream stream;

    public CompressorStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Compressing the data....." + data);
        var compressed = compress(data);
        this.stream.write(compressed);
    }

    private String compress(String data) {
        return "Compressed String for [" + data + "]";
    }
}
