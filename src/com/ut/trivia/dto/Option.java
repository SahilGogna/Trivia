package com.ut.trivia.dto;

/**
 * 
 * @author sahilgogna
 * @since November 22, 2018
 */
public class Option {
	/**
	 * this class is the DTO class for options
	 */

	/**
	 * the id for option
	 */
    private int optionId;

    /**
     * option body
     */
    private String text;

    /**
     * 
     * @return option id
     */
    public int getOptionId() {
        return optionId;
    }
    
    /**
     * sets option id
     * @param optionId
     */
    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    /**
     * 
     * @return option body
     */
    public String getText() {
        return text;
    }

    /**
     * sets the option body
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @param optionId
     * @param text
     */
    public Option(int optionId, String text) {
        this.optionId = optionId;
        this.text = text;
    }
}
