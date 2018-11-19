package com.ut.trivia.Factory;

import com.ut.trivia.QuestionAnswers.FoodQuestions;

public class QuestionFactory {
	
	private static FoodQuestions foodQuestionsInstance;
	
	
	public static FoodQuestions getFoodQuestionsInstance() {
		if(foodQuestionsInstance == null) {
			foodQuestionsInstance = new FoodQuestions();
		}
		return foodQuestionsInstance;
	}
	
}
