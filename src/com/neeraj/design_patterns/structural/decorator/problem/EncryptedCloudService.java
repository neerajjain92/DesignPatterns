package com.neeraj.design_patterns.structural.decorator.problem;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author neeraj on 21/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class EncryptedCloudService extends CloudService {

    @Override
    public void write(String data) {
        final String encryptedData = encryptData(data);
        super.write(encryptedData);
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
