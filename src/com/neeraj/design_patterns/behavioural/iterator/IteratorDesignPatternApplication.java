package com.neeraj.design_patterns.behavioural.iterator;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class IteratorDesignPatternApplication {

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("google.com");
        history.push("youtube.com");
        history.push("facebook.com");
        history.push("stackoverflow.com");
        history.push("leetcode.com");

        Iterator iterator = history.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
