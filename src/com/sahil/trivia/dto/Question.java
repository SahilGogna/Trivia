package com.sahil.trivia.dto;

import java.util.List;

/**
 * @author Nagarro
 * @since November 22, 2018
 */
public class Question {

    private int questionId;

    private String text;

    private List<Option> optionList;

    public Question(int questionId, String text) {
        this.questionId = questionId;
        this.text = text;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
