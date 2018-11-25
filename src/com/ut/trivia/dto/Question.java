package com.ut.trivia.dto;

import java.util.List;

/**
 * @author sahilgogna
 * @since November 22, 2018
 */
public class Question {

    private int questionId;

    private String text;

    private List<Option> optionList;
    
    private int correctOption;

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

	public int getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}
    
}
