package com.neeraj.design_patterns.behavioural.command.undoable.editor;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Command;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public interface UndoableCommand extends Command {
    void unexecute();
}
