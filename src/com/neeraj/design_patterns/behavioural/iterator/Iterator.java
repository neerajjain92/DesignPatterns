package com.neeraj.design_patterns.behavioural.iterator;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public interface Iterator<T> {

    boolean hasNext();

    T current();

    void next();
}
