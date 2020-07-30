package com.neeraj.design_patterns.behavioural.observer;

import com.neeraj.design_patterns.behavioural.observer.excel.DataSource;
import com.neeraj.design_patterns.behavioural.observer.excel.PieChartObserver;
import com.neeraj.design_patterns.behavioural.observer.excel.SpreadSheetObserver;

/**
 * @author neeraj on 31/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class ObserverPatternApplication {

    public static void main(String[] args) {
        var spreadSheet = new SpreadSheetObserver();
        var pieChart = new PieChartObserver();

        var dataSource = new DataSource();
        dataSource.attach(spreadSheet);
        dataSource.attach(pieChart);

        dataSource.setContent("Hello World...");

        // We can detach pieChart observer if not interested.
        dataSource.detach(pieChart);
        dataSource.setContent("New world..");
    }
}
