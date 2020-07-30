package com.neeraj.design_patterns.behavioural.chain_of_responsibility;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    public boolean authenticate(HttpRequest httpRequest) {
        var isValid = httpRequest.getUsername() == "neeraj" &&
                httpRequest.getPassword() == "1234";
        System.out.println("Authenticating the request... and isValidUser ? " + isValid);

        // Now since if we want this request to go forward, we need to send false to handler
        // and if the username and password didn't match we need to stop processing and return
        // back to user so let's pass true in that scenario.
        return !isValid;
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        return authenticate(httpRequest);
    }
}
