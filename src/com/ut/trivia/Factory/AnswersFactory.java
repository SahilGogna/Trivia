package com.ut.trivia.Factory;

import com.ut.trivia.QuestionAnswers.FoodAnswers;

public class AnswersFactory {
	private static FoodAnswers foodAnswersInstance;
	
	
	public static FoodAnswers getFoodAnswersInstance() {
		if(foodAnswersInstance == null) {
			foodAnswersInstance = new FoodAnswers();
		}
		return foodAnswersInstance;
	}
}
