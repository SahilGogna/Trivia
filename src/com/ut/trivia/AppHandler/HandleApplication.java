
package com.ut.trivia.AppHandler;

import com.ut.trivia.HandleInputOutput.HandleIO;
import com.ut.trivia.QuizHandler.QuizHandler;

public class HandleApplication {
	
	public static void main(String[] args) {
		String userChoice;
		String [][] gamePlayTracker = new String [20][20];
		int gameNumber = 0;
		
		HandleIO handleIO = new HandleIO();
		userChoice = handleIO.HandleInput();
		if(!userChoice.equals("7") && !userChoice.equals("007")) {
			QuizHandler quizhandler = new QuizHandler();
			gamePlayTracker[gameNumber][0] = quizhandler.getCategory(userChoice);
			gamePlayTracker[gameNumber++][1]  = quizhandler.startQuiz(userChoice);
			System.out.println("Results!");
			System.out.println(gamePlayTracker[0][0]+" "+ gamePlayTracker[0][1]+ "%");
		}
		else if(userChoice.equals("007")){
			
		}
		
	}

}
