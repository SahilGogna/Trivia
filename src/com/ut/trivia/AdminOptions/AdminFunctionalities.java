package com.ut.trivia.AdminOptions;

import java.util.List;
import java.util.Scanner;
import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.constants.GeneralConstants;
import com.ut.trivia.data.AppData;
import com.ut.trivia.dto.Option;
import com.ut.trivia.dto.Question;

public class AdminFunctionalities {
	
	
	java.lang.reflect.Method method;
	public void handleEditQuestion() {
//		System.out.println(AdminConstants.ENTER_CATEGORY);
//		String category = scan.nextLine();
//		System.out.println(AdminConstants.EDIT_REQUEST);
//		String questionNumber = scan.nextLine();
//		
//		String questionMethod = AdminConstants.GET_QUESTION+questionNumber;
//		String optionA = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_A;
//		String optionB = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_B;
//		String optionC = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_C;
//		String optionD = AdminConstants.SET_ANSWER+questionNumber+AdminConstants.OPTION_D;
//		String correctAnsMethod = AdminConstants.SET_ANS_UDERSCORE+questionNumber;
//		switch(category){
//		case "1":
//			try {
//			FoodQuestions foodQuestions = QuestionFactory.getFoodQuestionsInstance();
//			FoodAnswers   foodAnswers = AnswersFactory.getFoodAnswersInstance();
//			FoodCorrectAnswers foodCorrectAnswers = CorrectAnswerFactory.getFoodCorrectAnswersInstance();
//			
//			System.out.println(AdminConstants.ENTERED_QUESTION);
//			method = foodQuestions.getClass().getMethod(questionMethod);
//			method.invoke(foodQuestions);
//			System.out.println(method.invoke(foodQuestions));
//			System.out.println(AdminConstants.EDIT_REQUEST);
//			String question = scan.nextLine();
//			String setQuestionMethod = AdminConstants.SET_QUESTION+questionNumber;
//			method = foodQuestions.getClass().getMethod(setQuestionMethod,String.class);
//			method.invoke(foodQuestions, question);
//			System.out.println(AdminConstants.OPTION_A_REQUEST);
//			String answer = scan.nextLine();
//			method = foodAnswers.getClass().getMethod(optionA,String.class);
//			method.invoke(foodAnswers, answer);
//			System.out.println(AdminConstants.OPTION_B_REQUEST);
//			answer = scan.nextLine();
//			method = foodAnswers.getClass().getMethod(optionB,String.class);
//			method.invoke(foodAnswers, answer);
//			System.out.println(AdminConstants.OPTION_C_REQUEST);
//			answer = scan.nextLine();
//			method = foodAnswers.getClass().getMethod(optionC,String.class);
//			method.invoke(foodAnswers, answer);
//			System.out.println(AdminConstants.OPTION_D_REQUEST);
//			answer = scan.nextLine();
//			method = foodAnswers.getClass().getMethod(optionD,String.class);
//			method.invoke(foodAnswers, answer);
//			System.out.println(AdminConstants.CORRECT_ANS_REQ);
//			answer = scan.nextLine();
//			method = foodCorrectAnswers.getClass().getMethod(correctAnsMethod,String.class);
//			method.invoke(foodCorrectAnswers, answer.toLowerCase());
//			
//			System.out.println(foodQuestions.getQuestion1());
//			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//				e.printStackTrace();
//			} catch(NoSuchMethodException e) {
//				
//			}
//		}
	}
	
	public static void editQuestion(int adminCategory , Scanner scan) {
		int questionIndex = HandleIpOp.getEditQuestionIndex(adminCategory, scan);
		String questionText = HandleIpOp.getEditedQuestion(scan);
		List<Option> options = HandleIpOp.geQuestionOptions(scan);
		int correctoption = HandleIpOp.getCorrectOption(scan,options);
		Question question = AppData.getQuestionsByCategory().get(adminCategory).get(questionIndex);
		question.setText(questionText);
		question.setOptionList(options);
		question.setCorrectOption(correctoption);
		System.out.println(AppData.getQuestionsByCategory().get(adminCategory).get(questionIndex).getText());
	}
	
    public static void addQuestion(int adminCategory,Scanner scan) {
    	int questionIndex = AppData.getQuestionsByCategory().get(adminCategory).size();
    	String questionText = HandleIpOp.getNewQuestion(scan);
    	List<Option> options = HandleIpOp.geQuestionOptions(scan);
    	int correctoption = HandleIpOp.getCorrectOption(scan,options);
        Question question = new Question(questionIndex, questionText);
        question.setOptionList(options);
		question.setCorrectOption(correctoption);
		AppData.getQuestionsByCategory().get(adminCategory).add(question);
	}
    
    public static void deleteQuestion(int adminCategory, Scanner scan) {
    	int questionIndex = HandleIpOp.getDeleteQuestionIndex(adminCategory, scan);
    	AppData.getQuestionsByCategory().get(adminCategory).remove(questionIndex-1);
    	int i =GeneralConstants.ONE_INT;
    	for(Question question: AppData.getQuestionsByCategory().get(adminCategory)) {
    		question.setQuestionId(i);
    		i++;
		}
    }

}