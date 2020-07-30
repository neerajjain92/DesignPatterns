package com.neeraj.design_patterns.structural.decorator.solution;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author neeraj on 21/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class EncryptedStream implements Stream {
    private Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Encrypting the Data......" + data);
        var encryptedData = encryptData(data);
        this.stream.write(encryptedData);
    }

    private String encryptData(String data) {
        try {
            return String.valueOf(MessageDigest.getInstance("SHA-256").digest(data.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
