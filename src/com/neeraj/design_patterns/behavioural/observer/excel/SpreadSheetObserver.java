package com.neeraj.design_patterns.behavioural.observer.excel;

/**
 * @author neeraj on 31/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class SpreadSheetObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet updated.....");
    }
}
