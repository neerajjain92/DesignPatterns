package com.neeraj.design_patterns.behavioural.chain_of_responsibility;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public abstract class Handler {
    private Handler next; // Pointer to the next Handler

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest httpRequest) {
        // If any stage sends true that means our pipeline should stop there itself.
        // In order to go to the next stage Handlers should send false informing that
        // there is yet to be work done in the pipeline by other handlers.
        if (doHandle(httpRequest)) {
            return; // We will stop immediately whenever our pipeline in the stage says it has completed
        }

          if (next != null) { // Making sure we do have more stages in pipeline.
            next.handle(httpRequest);
        }
    }

    protected abstract boolean doHandle(HttpRequest httpRequest);
}
