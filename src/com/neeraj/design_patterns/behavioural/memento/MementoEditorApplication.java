package com.neeraj.design_patterns.behavioural.memento;

/**
 * @author neeraj on 29/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class MementoEditorApplication {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("Hello World.....");

        System.out.println(editor.getContent());


        // Let's store the History
        History history = new History();
        history.push(editor.createCurrentState());

        editor.setContent("New World......");
        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

    }
}
