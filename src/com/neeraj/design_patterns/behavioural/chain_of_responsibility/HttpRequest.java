package com.neeraj.design_patterns.behavioural.chain_of_responsibility;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class HttpRequest {

    private String username;
    private String password;

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Http Request :: [UserName: " + username + ", Password: " + password + "]";
    }
}
