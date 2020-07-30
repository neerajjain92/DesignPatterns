package com.neeraj.design_patterns.behavioural.template.task;

import com.neeraj.design_patterns.behavioural.template.AuditTrial;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public abstract class Task {

    private AuditTrial auditTrial;

    public Task() {
        this.auditTrial = new AuditTrial();
    }

    public void execute() {
        this.auditTrial.record(this.getClass().getCanonicalName());
        doExecute();
    }

    protected abstract void doExecute();
}
