package com.ut.trivia.QuizHandler;

import java.util.Scanner;

import com.ut.trivia.Factory.AnswersFactory;
import com.ut.trivia.Factory.CorrectAnswerFactory;
import com.ut.trivia.Factory.QuestionFactory;
import com.ut.trivia.QuestionAnswers.FoodAnswers;
import com.ut.trivia.QuestionAnswers.FoodCorrectAnswers;
import com.ut.trivia.QuestionAnswers.FoodQuestions;
import com.ut.trivia.constants.GeneralConstants;

public class QuizHandler {
	
	public String startQuiz(String option) {
		
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int score=0;
		switch(option){
		case "1":{
			FoodQuestions foodquestions = QuestionFactory.getFoodQuestionsInstance();
			FoodAnswers foodanswers = AnswersFactory.getFoodAnswersInstance();
			FoodCorrectAnswers correctAnswers = CorrectAnswerFactory.getFoodCorrectAnswersInstance();
			int correctCounter = 0;
			//Question 1
			System.out.println(GeneralConstants.ONE + GeneralConstants.SPACE+ foodquestions.getQuestion1());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer1_optionA() + GeneralConstants.SPACE+
					           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer1_optionB() + GeneralConstants.SPACE+
					           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer1_optionC() + GeneralConstants.SPACE+
					           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer1_optionD());
			answer = scan.nextLine();
			
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_1())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
						           GeneralConstants.SPACE +correctAnswers.getAnswer_1());
			}
			
			// Question 2
			System.out.println(GeneralConstants.TWO + GeneralConstants.SPACE+ foodquestions.getQuestion2());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer2_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer2_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer2_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer2_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_2())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_2());
			}
			
			//Question 3
			System.out.println(GeneralConstants.THREE + GeneralConstants.SPACE+ foodquestions.getQuestion3());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer3_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer3_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer3_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer3_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_3())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_3());
			}
			
			//Question 4
			System.out.println(GeneralConstants.FOUR + GeneralConstants.SPACE+ foodquestions.getQuestion4());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer4_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer4_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer4_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer4_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_4())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_4());
			}
			
			//Question 5
			System.out.println(GeneralConstants.FIVE + GeneralConstants.SPACE+ foodquestions.getQuestion5());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer5_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer5_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer5_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer5_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_5())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_5());
			}
			
			//Question 6
			System.out.println(GeneralConstants.SIX + GeneralConstants.SPACE+ foodquestions.getQuestion6());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer6_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer6_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer6_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer6_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_6())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_6());
			}
			
			//Question 7
			System.out.println(GeneralConstants.SEVEN + GeneralConstants.SPACE+ foodquestions.getQuestion7());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer7_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer7_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer7_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer7_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_7())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_7());
			}
			
			//Question 8
			System.out.println(GeneralConstants.EIGHT + GeneralConstants.SPACE+ foodquestions.getQuestion8());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer8_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer8_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer8_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer8_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_8())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_8());
			}
			
			//Question 9
			System.out.println(GeneralConstants.NINE + GeneralConstants.SPACE+ foodquestions.getQuestion9());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer9_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer9_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer9_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer9_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_9())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_9());
			}
			
			//Question 10
			System.out.println(GeneralConstants.TEN + GeneralConstants.SPACE+ foodquestions.getQuestion10());
			System.out.println(GeneralConstants.A+ GeneralConstants.SPACE + foodanswers.getAnswer10_optionA() + GeneralConstants.SPACE+
			           GeneralConstants.B+ GeneralConstants.SPACE + foodanswers.getAnswer10_optionB() + GeneralConstants.SPACE+
			           GeneralConstants.C+ GeneralConstants.SPACE + foodanswers.getAnswer10_optionC() + GeneralConstants.SPACE+
			           GeneralConstants.D+ GeneralConstants.SPACE + foodanswers.getAnswer10_optionD());
			answer = scan.nextLine();
			if(answer.trim().toLowerCase().equals(correctAnswers.getAnswer_10())) {
				System.out.println(GeneralConstants.CORRECTANSWER);
				correctCounter++;
			}else {
				System.out.println(GeneralConstants.INCORRECTANSWER + GeneralConstants.DOT + GeneralConstants.SPACE+ GeneralConstants.CORRECTANSMESSAGE+
				           GeneralConstants.SPACE +correctAnswers.getAnswer_10());
			}
			
			score = calculateScore(correctCounter);
			System.out.println("Score from switch is "+ score);
		}
		}
		
		return String.valueOf(score);
	}
	
	public int calculateScore(int i) {
		System.out.println("Score from switch is "+ (i*100)/10);
		return ((i*100)/10);
	}
	
	public String getCategory(String option) {
		String category = null;
		switch(option){
		case "1":{
			category = GeneralConstants.GAME_CATEGORY_FOOD;
			break;
		}
		}
		return category;
	}

}
