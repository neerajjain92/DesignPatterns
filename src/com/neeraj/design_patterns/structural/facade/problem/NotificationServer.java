package com.neeraj.design_patterns.structural.facade.problem;

/**
 * @author neeraj on 23/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class NotificationServer {
    /**
     * Bare Minimum Steps
     * 1) connect() --> Returns {@link Connection} class object.
     * 2) authenticate(appId, key) --> Returns {@link AuthToken}
     * 3) send(authToken, message, target)
     * 4) connection.disconnect();
     */

    public Connection connect(String ipAddressOfNotificationServer) {
        // Establish connection with actual NotificationServer provided by the ipAddress.
        System.out.print("Establishing Connection");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, final Message message, final String target) {
        System.out.println("Sending Notification ..." + message.getContent());
    }


}
