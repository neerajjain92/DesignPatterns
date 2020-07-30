package com.neeraj.design_patterns.behavioural.command.undoable.editor;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class HTMLDocumentEditor {

    private String content;

    /**
     * Business Logic on how to make anything bold.
     */
    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
