package com.neeraj.design_patterns.behavioural.mediator_pattern.version_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public abstract class UIControl {
    List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandlers(EventHandler eventHandler) {
        this.eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var observer : eventHandlers) {
            observer.update();
        }
    }
}
