package com.neeraj.design_patterns.structural.facade;

import com.neeraj.design_patterns.structural.facade.problem.Message;
import com.neeraj.design_patterns.structural.facade.problem.NotificationServer;
import com.neeraj.design_patterns.structural.facade.solution.NotificationService;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class FacadeApplication {

    public static void main(String[] args) {

        // This piece of code is a problem.... every time we have to send
        // notification we need to follow this steps, it's better to put them
        // in a service which becomes our facade/face of Notification System
        // and we interact with just that.
//        var server = new NotificationServer();
//        var connection = server.connect("192.168.44.323");
//        var authToken = server.authenticate("my-facade-design-pattern-app-id", "shhh-secret-key-classified");
//        server.send(authToken, new Message("You are placed in Amazon."), "Neeraj Jain");
//        connection.disconnect();

        // Solution:
        var notificationService = new NotificationService();
        notificationService.send("You are placed in Amazon.", "Neeraj Jain");
    }
}
