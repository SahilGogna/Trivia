package com.sahil.trivia.dto;

/**
 * @author Nagarro
 * @since November 22, 2018
 */
public class Option {

    private int answerId;

    private String text;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Option(int answerId, String text) {
        this.answerId = answerId;
        this.text = text;
    }
}
