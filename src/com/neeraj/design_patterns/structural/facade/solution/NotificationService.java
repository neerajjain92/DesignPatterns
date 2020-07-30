package com.neeraj.design_patterns.structural.facade.solution;

import com.neeraj.design_patterns.structural.facade.problem.Message;
import com.neeraj.design_patterns.structural.facade.problem.NotificationServer;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class NotificationService {

    /**
     * Client will just interact with this guy....
     */
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("192.168.44.323");
        var authToken = server.authenticate("my-facade-design-pattern-app-id", "shhh-secret-key-classified");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
