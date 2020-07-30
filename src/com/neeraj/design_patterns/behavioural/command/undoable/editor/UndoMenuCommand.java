package com.neeraj.design_patterns.behavioural.command.undoable.editor;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Command;
import com.neeraj.design_patterns.behavioural.command.undoable.History;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class UndoMenuCommand implements Command {
    private History history;

    public UndoMenuCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0) {
            history.pop().unexecute();
        }
    }
}
