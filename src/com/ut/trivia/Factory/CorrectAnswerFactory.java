package com.ut.trivia.Factory;

import com.ut.trivia.QuestionAnswers.FoodCorrectAnswers;

public class CorrectAnswerFactory {
	
	private static FoodCorrectAnswers foodCorrectAnswersInstance;
	
	public static FoodCorrectAnswers getFoodCorrectAnswersInstance() {
		
		if(foodCorrectAnswersInstance == null) {
			foodCorrectAnswersInstance = new FoodCorrectAnswers();
		}
		return foodCorrectAnswersInstance;
	}

}
