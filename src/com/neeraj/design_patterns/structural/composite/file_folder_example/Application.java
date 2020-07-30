package com.neeraj.design_patterns.structural.composite.file_folder_example;

/**
 * @author neeraj on 20/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class Application {

    Folder folder1, folder2, folder3;

    private void createPattern() {
        // Folder 1 have file f1, f2, and f3
        folder1 = new Folder();
        folder1.add(new File(5));
        folder1.add(new File(10));
        folder1.add(new File(15));

        // Folder 2 have Folder 1 as child and f3 as file
        folder2 = new Folder();
        folder2.add(folder1);
        folder2.add(new File(20));

        // Folder 3 have folder1 and 2 as it's child
        folder3 = new Folder();
        folder3.add(folder1);
        folder3.add(folder2);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createPattern();

        System.out.println("Folder 1 Size : " + application.folder1.getSize());

        System.out.println("Folder 2 Size : " + application.folder2.getSize());

        System.out.println("Folder 3 Size : " + application.folder3.getSize());
    }
}
