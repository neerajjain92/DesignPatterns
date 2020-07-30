package com.neeraj.design_patterns.behavioural.command.undoable.editor;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Command;
import com.neeraj.design_patterns.behavioural.command.undoable.History;

/**
 * Concrete implementation of Both {@link UndoableCommand}
 * and {@link Command} interface
 *
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class BoldCommand implements UndoableCommand {

    private String prevContent;
    private HTMLDocumentEditor htmlDocumentEditor;
    private History history;

    public BoldCommand(HTMLDocumentEditor htmlDocumentEditor, History history) {
        this.htmlDocumentEditor = htmlDocumentEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = htmlDocumentEditor.getContent();
        htmlDocumentEditor.makeBold();
        this.history.push(this);
    }

    @Override
    public void unexecute() {
        htmlDocumentEditor.setContent(prevContent);
    }
}
