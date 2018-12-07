package com.ut.trivia.AdminOptions;

import java.util.List;
import java.util.Scanner;
import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.constants.GeneralConstants;
import com.ut.trivia.data.AppData;
import com.ut.trivia.dto.Option;
import com.ut.trivia.dto.Question;

/**
 * 
 * @author sahilgogna
 * Nov 26, 2018
 *
 */
public class AdminFunctionalitiesImpl{
	/**
	 * this class helps user to perform all the administrator functionalities
	 */
	
	/**
	 * This method allows user to edit an existing question
	 * 
	 * @param adminCategory - category selected by the admin
	 * @param scan - scanner class object
	 */
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
	
	/**
	 * this method allows a user to add a new question
	 * 
	 * @param adminCategory
	 * @param scan
	 */
    public static void addQuestion(int adminCategory,Scanner scan) {
    	int questionIndex = AppData.getQuestionsByCategory().get(adminCategory).size();
    	String questionText = HandleIpOp.getNewQuestion(scan);
    	List<Option> options = HandleIpOp.geQuestionOptions(scan);
    	int correctoption = HandleIpOp.getCorrectOption(scan,options);
        Question question = new Question(questionIndex, questionText);
        question.setOptionList(options);
		question.setCorrectOption(correctoption);
		AppData.getQuestionsByCategory().get(adminCategory).add(question); // adding question to list
	}
    
    /**
     * this method allows a user to delete a question
     * 
     * @param adminCategory
     * @param scan
     */
    public static void deleteQuestion(int adminCategory, Scanner scan) {
    	int questionIndex = HandleIpOp.getDeleteQuestionIndex(adminCategory, scan);
    	AppData.getQuestionsByCategory().get(adminCategory).remove(questionIndex-1); //removing question at index
    	int i =GeneralConstants.ONE_INT;
    	// resetting question indexes
    	for(Question question: AppData.getQuestionsByCategory().get(adminCategory)) {//once a question is removed remaining question indexes updated
    		question.setQuestionId(i);
    		i++;
		}
    }

}