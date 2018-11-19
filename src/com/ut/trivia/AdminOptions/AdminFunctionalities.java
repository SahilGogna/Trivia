package com.ut.trivia.AdminOptions;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import com.ut.trivia.Factory.AnswersFactory;
import com.ut.trivia.Factory.CorrectAnswerFactory;
import com.ut.trivia.Factory.QuestionFactory;
import com.ut.trivia.QuestionAnswers.FoodAnswers;
import com.ut.trivia.QuestionAnswers.FoodCorrectAnswers;
import com.ut.trivia.QuestionAnswers.FoodQuestions;
import com.ut.trivia.constants.AdminConstants;

public class AdminFunctionalities {
	
	Scanner scan = new Scanner(System.in);
	java.lang.reflect.Method method;
	public void handleEditQuestion() {
		System.out.println(AdminConstants.ENTER_CATEGORY);
		String category = scan.nextLine();
		System.out.println(AdminConstants.EDIT_REQUEST);
		String questionNumber = scan.nextLine();
		
		String questionMethod = AdminConstants.GET_QUESTION+questionNumber;
		String optionA = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_A;
		String optionB = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_B;
		String optionC = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_C;
		String optionD = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_D;
		String correctAnsMethod = AdminConstants.SET_ANS_UDERSCORE+questionNumber;
		switch(category){
		case "1":
			try {
			FoodQuestions foodQuestions = QuestionFactory.getFoodQuestionsInstance();
			FoodAnswers   foodAnswers = AnswersFactory.getFoodAnswersInstance();
			FoodCorrectAnswers foodCorrectAnswers = CorrectAnswerFactory.getFoodCorrectAnswersInstance();
			
			System.out.println(AdminConstants.ENTERED_QUESTION);
			method = foodQuestions.getClass().getMethod(questionMethod);
			method.invoke(foodQuestions);
			System.out.println(method.invoke(foodQuestions));
			System.out.println(AdminConstants.EDIT_REQUEST);
			String question = scan.nextLine();
			String setQuestionMethod = AdminConstants.SET_QUESTION+questionNumber;
			method = foodQuestions.getClass().getMethod(setQuestionMethod,String.class);
			method.invoke(foodQuestions, question);
			System.out.println(AdminConstants.OPTION_A_REQUEST);
			String answer = scan.nextLine();
			method = foodAnswers.getClass().getMethod(optionA,String.class);
			method.invoke(foodAnswers, answer);
			System.out.println(AdminConstants.OPTION_B_REQUEST);
			answer = scan.nextLine();
			method = foodAnswers.getClass().getMethod(optionB,String.class);
			method.invoke(foodAnswers, answer);
			System.out.println(AdminConstants.OPTION_C_REQUEST);
			answer = scan.nextLine();
			method = foodAnswers.getClass().getMethod(optionC,String.class);
			method.invoke(foodAnswers, answer);
			System.out.println(AdminConstants.OPTION_D_REQUEST);
			answer = scan.nextLine();
			method = foodAnswers.getClass().getMethod(optionD,String.class);
			method.invoke(foodAnswers, answer);
			System.out.println(AdminConstants.CORRECT_ANS_REQ);
			answer = scan.nextLine();
			method = foodCorrectAnswers.getClass().getMethod(correctAnsMethod,String.class);
			method.invoke(foodCorrectAnswers, answer.toLowerCase());
			
			System.out.println(foodQuestions.getQuestion1());
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			} catch(NoSuchMethodException e) {
				
			}
		}
	}

}