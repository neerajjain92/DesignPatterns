package com.neeraj.design_patterns.behavioural.observer.excel;

/**
 * @author neeraj on 31/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class DataSource extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        System.out.println("Updating the Content in DataSource...");
        this.content = content;

        // Since we have modified the content, let's inform all observers.
        super.notifyObservers();
    }
}
