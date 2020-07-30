package com.neeraj.design_patterns.structural.decorator.solution;

/**
 * @author neeraj on 21/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CloudProviderApplication {

    public static void main(String[] args) {

        storeCreditCard(new CloudStream()); // Storing Credit card information in plain text

        System.out.println("===========================");

        // No i want to encrypt it
        storeCreditCard(new EncryptedStream(new CloudStream()));

        System.out.println("===========================");

        // I Also want to compress it
        storeCreditCard(new EncryptedStream
                (new CompressorStream
                        (new CloudStream())));

    }

    private static void storeCreditCard(Stream stream) {
        stream.write("1234-7895-4332-0165");
    }
}
