package com.ut.trivia.dto;

import java.util.List;

/**
 * 
 * @author sahilgogna
 * @since November 22, 2018
 */
public class Question {
	/**
	 * this class is DTO class for questions
	 */

	/**
	 * the question id
	 */
    private int questionId;

    /**
     * the question text
     */
    private String text;

    /**
     * list of options for question
     */
    private List<Option> optionList;
    
    /**
     * the correct option
     */
    private int correctOption;

    /**
     * constructor
     * 
     * @param questionId
     * @param text
     */
    public Question(int questionId, String text) {
        this.questionId = questionId;
        this.text = text;
    }

    /**
     * 
     * @return id of question
     */
    public int getQuestionId() {
        return questionId;
    }

    /**
     * sets question id
     * @param questionId
     */
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    /**
     * 
     * @return question text
     */
    public String getText() {
        return text;
    }

    /**
     * sets question text
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return list of options for a question
     */
    public List<Option> getOptionList() {
        return optionList;
    }

    /**
     * sets list of options for a question
     * @param optionList
     */
    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    /**
     * 
     * @return correct option
     */
	public int getCorrectOption() {
		return correctOption;
	}

	/**
	 * sets correct option
	 * @param correctOption
	 */
	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}
    
}
