package com.neeraj.design_patterns.behavioural.mediator_pattern.version_2;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class PlaygroundForMediatorPatternUsingObserverPattern {

    public static void main(String[] args) {
        var articlesDialogBox = new ArticlesDialogBox();
        articlesDialogBox.simulateUserInteraction();
    }
}
