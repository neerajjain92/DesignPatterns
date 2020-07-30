package com.neeraj.design_patterns.behavioural.observer.excel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 31/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
