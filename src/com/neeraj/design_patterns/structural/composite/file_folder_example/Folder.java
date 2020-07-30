package com.neeraj.design_patterns.structural.composite.file_folder_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Folder extends Data {
    List<Data> dataList = new ArrayList<>();

    public void add(Data data) {
        this.dataList.add(data);
    }

    @Override
    int getSize() {
        int size = 0;
        // Calculating Size of all SubFolders and Files.
        for (Data data : dataList) {
            size += data.getSize();
        }
        return size;
    }
}
