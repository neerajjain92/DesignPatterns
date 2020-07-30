package com.neeraj.design_patterns.structural.facade.problem;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Message {

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
