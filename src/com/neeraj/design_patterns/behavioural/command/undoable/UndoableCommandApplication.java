package com.neeraj.design_patterns.behavioural.command.undoable;

import com.neeraj.design_patterns.behavioural.command.undoable.editor.BoldCommand;
import com.neeraj.design_patterns.behavioural.command.undoable.editor.HTMLDocumentEditor;
import com.neeraj.design_patterns.behavioural.command.undoable.editor.UndoMenuCommand;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class UndoableCommandApplication {

    public static void main(String[] args) {
        var history = new History();
        var htmlEditor = new HTMLDocumentEditor();
        var boldCommand = new BoldCommand(htmlEditor, history);

        htmlEditor.setContent("Hello World....");
        
        boldCommand.execute();
        System.out.println(htmlEditor.getContent());

        var undoMenuCommand = new UndoMenuCommand(history);
        undoMenuCommand.execute();
        System.out.println(htmlEditor.getContent());

    }
}
