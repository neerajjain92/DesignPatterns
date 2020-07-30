package com.neeraj.design_patterns.behavioural.memento;

import java.util.Stack;

/**
 * This is the tare-caker class which managers the state of an object.
 *
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class History {
    private Stack<EditorState> history;

    public History() {
        history = new Stack<>();
    }

    /**
     * Retrieving the last state.
     */
    public EditorState pop() {
        return this.history.pop();
    }

    /**
     * Saving the current state into the history.
     */
    public void push(EditorState currentState) {
        this.history.push(currentState);
    }
}
