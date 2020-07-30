package com.neeraj.design_patterns.behavioural.memento;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Editor {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    /**
     * Saving the current State of the Editor.
     */
    public EditorState createCurrentState() {
        return new EditorState(content);
    }

    /**
     * We can restore the previously saved editor State.
     * Something similar to resuming your game from previously stored checkpoint.
     */
    public void restoreState(EditorState editorState) {
        this.content = editorState.getContent();
    }
}
