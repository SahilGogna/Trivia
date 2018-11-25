
package com.ut.trivia.AppHandler;
import com.ut.trivia.AdminOptions.AdminFunctionalities;
import com.ut.trivia.Factory.ApplicationFactory;
import com.ut.trivia.HandleInputOutput.HandleIO;
import com.ut.trivia.QuizHandler.QuizHandler;
/**
 * This class contains the main method that starts the application
 * 
 * @author sahilgogna
 * Nov 18, 2018
 */
//public class HandleApplication {
//	
//	public static void main(String[] args) {
//		String userChoice;
//		String [][] gamePlayTracker = new String [20][20];
//		int gameNumber = 0;
//		
//		do{
//			HandleIO handleIO = new HandleIO();
//			userChoice = handleIO.HandleInput();
//			if(!userChoice.equals("7") && !userChoice.equals("007")) {// if user choice is different from game options
//				QuizHandler quizhandler = new QuizHandler();
//				gamePlayTracker[gameNumber][0] = quizhandler.getCategory(userChoice);
//				gamePlayTracker[gameNumber++][1]  = quizhandler.startQuiz(userChoice);
//				System.out.println("Results!");
//				System.out.println(gamePlayTracker[0][0]+" "+ gamePlayTracker[0][1]+ "%");
//			} // special code for admin functions
//			else if(userChoice.equals("007")){
//				userChoice = handleIO.HandleAdminInput();
//				AdminFunctionalities adminFunctionalities = ApplicationFactory.getAdminFunctionsInstance();
//				adminFunctionalities.handleEditQuestion();
//			}
//		}while(!userChoice.equals("0"));
//	}
//}
