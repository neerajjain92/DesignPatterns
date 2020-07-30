package com.neeraj.design_patterns.structural.decorator.problem;

/**
 * @author neeraj on 21/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CloudProvider {

    public static void main(String[] args) {
        CloudService cloudService = new CloudService();
        cloudService.write("Hello");

        var encryptedCloudService = new EncryptedCloudService();
        encryptedCloudService.write("Hello World...Credit Card Information....");
    }
}
