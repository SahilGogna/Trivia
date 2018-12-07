package com.ut.trivia.dto;

/**
 * 
 * 
 * @author sahilgogna Nov 30, 2018
 */
public class Results {
	/**
	 * this class is DTO class for Results
	 */

	// stores the score
	float score;

	// stores the category
	String category;

	/**
	 * 
	 * @return score of a category
	 */
	public float getScore() {
		return score;
	}

	/**
	 * sets score of a category
	 * 
	 * @param score
	 */
	public void setScore(float score) {
		this.score = score;
	}

	/**
	 * 
	 * @return category played by user
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * set category played by the user
	 * 
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
}
