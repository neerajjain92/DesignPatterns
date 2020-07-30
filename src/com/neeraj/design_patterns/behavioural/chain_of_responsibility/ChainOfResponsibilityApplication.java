package com.neeraj.design_patterns.behavioural.chain_of_responsibility;

/**
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        // Chain of Process
        // authentication --> logging --> Compression
        var compression = new Compressor(null); // This is the last stage in the pipeline
        var logger = new Logger(compression); // Next stage for Logger is compressor
        var authentication = new Authenticator(logger); // Next stage for Authenticator is Logger.

        // Sending only the  1st Handler to the WebServer.
        var webServer = new WebServer(authentication);
        var httpRequest = new HttpRequest("neeraj", "1234");
        webServer.handle(httpRequest);
    }
}
