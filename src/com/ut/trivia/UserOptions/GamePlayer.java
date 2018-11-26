package com.ut.trivia.UserOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.data.AppData;
import com.ut.trivia.dto.Question;
import com.ut.trivia.dto.Results;

public class GamePlayer {
	
	private static int count;
	private static List<Results> resultList = new ArrayList<Results>();
	
	public static void playGame(int category, Scanner scan) {
		count = 0;
		List<Question> questionList = AppData.getQuestionsByCategory().get(category);
		for(Question question: questionList) {
			HandleIpOp.printQuestionOptions(question);
			int userChoice = HandleIpOp.getUserOptionChoice(scan, question.getOptionList().size());
			if(userChoice == question.getCorrectOption()) {
				HandleIpOp.printCorrectOption();
				count++;
			}else {
				HandleIpOp.printRightChoice(question.getCorrectOption());
			}
		}
		Results gameResult = new Results();
		gameResult.setScore(countScore(questionList.size(), count));
		gameResult.setCategory(AppData.getCategories().get(category));
		resultList.add(gameResult);
	}
	
	private static float countScore(int size, int correctOPtions) {
		float score = 0;
		score = ((float)correctOPtions*100)/(float)size;
		return score;
	}

	public static List<Results> getResultList() {
		return resultList;
	}

}
