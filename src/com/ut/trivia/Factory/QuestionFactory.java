package com.ut.trivia.Factory;

import com.ut.trivia.QuestionAnswers.FoodQuestions;

/**
 * this is a factory class that instantiates the object of classes that has questions
 * 
 * @author sahilgogna
 * Nov 18, 2018
 */
public class QuestionFactory {
	
	private static FoodQuestions foodQuestionsInstance;
	
	
	public static FoodQuestions getFoodQuestionsInstance() {
		if(foodQuestionsInstance == null) {
			foodQuestionsInstance = new FoodQuestions();
		}
		return foodQuestionsInstance;
	}
	
}
