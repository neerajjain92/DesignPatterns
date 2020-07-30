package com.neeraj.design_patterns.behavioural.template;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class AuditTrial {
    public void record(final String action) {
        System.out.println("Auditing the " + action);
    }
}
