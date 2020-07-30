package com.neeraj.design_patterns.behavioural.mediator_pattern.version_1;

/**
 * Mediator implementor
 *
 * @author neeraj on 13/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class ArticlesDialogBox extends DialogBox {

    /**
     * Articles Dialog box knows what all UIControl i need for myself.
     */
    private ListBox articlesListBox = new ListBox(this);
    private TextBox articlesTextBox = new TextBox(this);
    private Button articleBoxSaveButton = new Button(this);

    @Override
    public void change(UIControl control) {
        if (control instanceof ListBox) {
            articlesSelected();
        } else if (control instanceof TextBox) {
            titleChanged();
        }
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
