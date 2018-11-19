package com.ut.trivia.Factory;

import com.ut.trivia.QuestionAnswers.FoodCorrectAnswers;

/**
 * this is a factory class that instantiates the object of classes that has correct answers
 * 
 * @author sahilgogna
 * Nov 18, 2018
 */
public class CorrectAnswerFactory {
	
	private static FoodCorrectAnswers foodCorrectAnswersInstance;
	
	public static FoodCorrectAnswers getFoodCorrectAnswersInstance() {
		
		if(foodCorrectAnswersInstance == null) {
			foodCorrectAnswersInstance = new FoodCorrectAnswers();
		}
		return foodCorrectAnswersInstance;
	}

}
