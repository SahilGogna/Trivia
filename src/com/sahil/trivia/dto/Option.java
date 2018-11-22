package com.sahil.trivia.dto;

/**
 * @author Nagarro
 * @since November 22, 2018
 */
public class Option {

    private int optionId;

    private String text;

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Option(int optionId, String text) {
        this.optionId = optionId;
        this.text = text;
    }
}
