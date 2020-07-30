package com.neeraj.design_patterns.structural.composite.file_folder_example;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class File extends Data {

    public File(int fileSize) {
        size = fileSize;
    }

    @Override
    int getSize() {
        return size;
    }
}
