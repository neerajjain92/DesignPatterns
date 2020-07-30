package com.neeraj.design_patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class BrowserHistory {

    private List<String> urls;

    public BrowserHistory() {
        urls = new ArrayList<>();
    }

    public void push(final String url) {
        this.urls.add(url);
    }

    public Iterator getIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private BrowserHistory browserHistory;
        private int index;

        public ListIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }

        @Override
        public boolean hasNext() {
            return index < this.browserHistory.urls.size();
        }

        @Override
        public Object current() {
            return this.browserHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
