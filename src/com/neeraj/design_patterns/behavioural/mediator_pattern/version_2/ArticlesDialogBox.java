package com.neeraj.design_patterns.behavioural.mediator_pattern.version_2;

/**
 * Mediator implementor
 *
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
@SuppressWarnings("DuplicatedCode")
public class ArticlesDialogBox {

    /**
     * Articles Dialog box knows what all UIControl i need for myself.
     */
    private ListBox articlesListBox = new ListBox();
    private TextBox articlesTextBox = new TextBox();
    private Button articleBoxSaveButton = new Button();

    public ArticlesDialogBox() {
        // Attaching the observers... and also providing what should
        // the observer do when update method is invoked
        // Event Handlers
        /**
         * We are providing the concrete implementation of {@link EventHandler#update()} method.
         */
        articlesListBox.addEventHandlers(this::articlesSelected);
        articlesTextBox.addEventHandlers(this::titleChanged);
    }

    public void simulateUserInteraction() {
        this.articlesListBox.setSelection("Article 1");

        System.out.println("TextBox:  " + this.articlesTextBox.getContent());
        System.out.println("Button: " + this.articleBoxSaveButton.isEnabled());

        this.articlesTextBox.setContent("");
        System.out.println("TextBox:  " + this.articlesTextBox.getContent());
        System.out.println("Button: " + this.articleBoxSaveButton.isEnabled());

        this.articlesListBox.setSelection("Article 2");
        System.out.println("TextBox:  " + this.articlesTextBox.getContent());
        System.out.println("Button: " + this.articleBoxSaveButton.isEnabled());

        this.articlesTextBox.setContent(null);
        System.out.println("TextBox:  " + this.articlesTextBox.getContent());
        System.out.println("Button: " + this.articleBoxSaveButton.isEnabled());

        this.articlesTextBox.setContent("Funny Article");
        System.out.println("TextBox:  " + this.articlesTextBox.getContent());
        System.out.println("Button: " + this.articleBoxSaveButton.isEnabled());
    }


    private void articlesSelected() {
        String selectedArticle = this.articlesListBox.getSelection();
        this.articlesTextBox.setContent(selectedArticle);
        this.articleBoxSaveButton.setEnabled(true);
    }

    private void titleChanged() {
        String titleOfArticle = this.articlesTextBox.getContent();
        if (titleOfArticle == null || titleOfArticle.isEmpty()) {
            // Since title is mandatory and it can't be empty.
            this.articleBoxSaveButton.setEnabled(false);
        } else {
            // Someone refilled the details.
            this.articleBoxSaveButton.setEnabled(true);
        }
    }
}
