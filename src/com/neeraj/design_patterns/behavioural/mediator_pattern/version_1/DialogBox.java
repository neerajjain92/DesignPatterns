package com.neeraj.design_patterns.behavioural.mediator_pattern.version_1;

/**
 * Dialog box is the mediator providing change contract which every {@link UIControl} should
 * invoke as soon as they change, so the Dialog box's implementor can do the orchestration.
 *
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public abstract class DialogBox {
    /**
     * This method will get invoked whenever any component changes it's state.
     */
    public abstract void change(UIControl control);
}
