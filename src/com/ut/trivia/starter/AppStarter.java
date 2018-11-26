package com.ut.trivia.starter;

import java.util.Scanner;

import com.ut.trivia.AdminOptions.AdminFunctionalities;
import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.UserOptions.GamePlayer;
import com.ut.trivia.constants.AdminConstants;
import com.ut.trivia.constants.GeneralConstants;

/**
 * @author sahilgogna
 * @since November 22, 2018
 * 
 * this is the starting point of the application
 */
public class AppStarter {

    public static void main(String[] args) {
    	
        try {
            Scanner scanner = new Scanner(System.in);
            int userChoice = GeneralConstants.MINUS_ONE_INT;
        	do {
        		userChoice = HandleIpOp.getCategoryChoice(scanner);
        		if(userChoice == AdminConstants.ADMIN_CODE) { // of admin mode is activated
            		HandleIpOp.printAdminWelcome();
            		int adminOperationChoice;
            		do{ // while admin wants to perform certain tasks
            			HandleIpOp.printAdminMode();
            			int adminCategory = HandleIpOp.getCategoryChoice(scanner);
                		adminOperationChoice = HandleIpOp.getAdminOperationChoice(scanner);
                		switch (adminOperationChoice){
                		case 1: AdminFunctionalities.addQuestion(adminCategory,scanner);break;
                		case 2: AdminFunctionalities.editQuestion(adminCategory,scanner); break;
                		case 3: AdminFunctionalities.deleteQuestion(adminCategory,scanner); break;
                		case 4: break;
                		}
            		}while(adminOperationChoice != GeneralConstants.FOUR_INT);
            	}if(userChoice == 5){
            		break;
            	}else { // if user mode is activated
            			HandleIpOp.printUserMode();
            			GamePlayer.playGame(userChoice,scanner);
            	}
        	}while(userChoice != GeneralConstants.SEVEN_INT);
        	HandleIpOp.printFinalScores();
        	
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
