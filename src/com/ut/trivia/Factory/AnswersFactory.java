package com.ut.trivia.Factory;

import com.ut.trivia.QuestionAnswers.FoodAnswers;
/**
 * this is a factory class that instantiates the object of classes that has answers
 * 
 * @author sahilgogna
 * Nov 18, 2018
 */
public class AnswersFactory {
	private static FoodAnswers foodAnswersInstance;
	
	
	public static FoodAnswers getFoodAnswersInstance() {
		if(foodAnswersInstance == null) {
			foodAnswersInstance = new FoodAnswers();
		}
		return foodAnswersInstance;
	}
}
