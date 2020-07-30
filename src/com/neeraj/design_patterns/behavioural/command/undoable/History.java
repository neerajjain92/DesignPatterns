package com.neeraj.design_patterns.behavioural.command.undoable;

import com.neeraj.design_patterns.behavioural.command.undoable.editor.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public int size() {
        return commands.size();
    }

    public void push(UndoableCommand undoableCommand) {
        this.commands.add(undoableCommand);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }
}
