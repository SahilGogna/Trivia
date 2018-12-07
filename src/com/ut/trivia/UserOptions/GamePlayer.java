package com.ut.trivia.UserOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.data.AppData;
import com.ut.trivia.dto.Question;
import com.ut.trivia.dto.Results;
/**
 * this class handle the gameplay for the user
 * 
 * @author sahilgogna
 * Dec 6, 2018
 */
public class GamePlayer {
	
	private static int count; // counter for correct options
	private static List<Results> resultList = new ArrayList<Results>(); //this stores the category played and score
	
	/**
	 * this takes input category , displays questions accordingly and notes correct answers
	 * @param category
	 * @param scan
	 */
	public static void playGame(int category, Scanner scan) {
		count = 0;
		List<Question> questionList = AppData.getQuestionsByCategory().get(category);
		for(Question question: questionList) { // for each question in the category
			HandleIpOp.printQuestionOptions(question);
			int userChoice = HandleIpOp.getUserOptionChoice(scan, question.getOptionList().size());
			if(userChoice == question.getCorrectOption()) { //if correct option
				HandleIpOp.printCorrectOption();
				count++;
			}else {
				HandleIpOp.printRightChoice(question.getCorrectOption());
			}
		}
		Results gameResult = new Results();
		gameResult.setScore(countScore(questionList.size(), count));
		gameResult.setCategory(AppData.getCategories().get(category));
		resultList.add(gameResult); // adding result of game to list
	}
	
	/**
	 * counts the percentage of correct answers
	 * @param size
	 * @param correctOPtions
	 * @return
	 */
	private static float countScore(int size, int correctOPtions) {
		float score = 0;
		score = ((float)correctOPtions*100)/(float)size; // calculation percentage
		return score;
	}

	/**
	 * returns the list that has the details of games played by the user and percentage of score in each game
	 * 
	 * @return ArrayList
	 */
	public static List<Results> getResultList() {
		return resultList;
	}

}
