package com.neeraj.design_patterns.behavioural.mediator_pattern.version_1;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class ListBox extends UIControl {
    private String selection;

    public ListBox(DialogBox owner) {
        super(owner);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;

        /**
         * Inform the container {@link DialogBox} about the change
         */
        owner.change(this);
    }
}
