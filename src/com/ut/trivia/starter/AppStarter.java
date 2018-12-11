package com.ut.trivia.starter;

import java.util.Scanner;

import com.ut.trivia.AdminOptions.AdminFunctionalitiesImpl;
import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.UserOptions.GamePlayer;
import com.ut.trivia.constants.AdminConstants;
import com.ut.trivia.constants.GeneralConstants;
import com.ut.trivia.data.AppData;

/**
 * @author sahilgogna
 * @since November 22, 2018
 * 
 * 
 */
public class AppStarter {
	/**
	 * this is the starting point of the application
	 * 
	 */

    public static void main(String[] args) {
    	
        try {
            Scanner scanner = new Scanner(System.in);
            int userChoice = GeneralConstants.MINUS_ONE_INT;
        	do {
        		HandleIpOp.printGeneralMode();
        		userChoice = HandleIpOp.getCategoryChoice(scanner);
        		if(userChoice == AdminConstants.ADMIN_CODE) { // if admin mode is activated
            		HandleIpOp.printAdminWelcome();
            		int adminOperationChoice;
            		int adminCategory;
            		do {
            			HandleIpOp.printAdminMode();
                		adminCategory = HandleIpOp.getAdminCategoryChoice(scanner);
                		if(adminCategory != AppData.getCategories().size()+1) {
                			do{ // while admin wants to perform certain tasks
                        		adminOperationChoice = HandleIpOp.getAdminOperationChoice(scanner);
                        		switch (adminOperationChoice){ // switch for admin operations
                        		case 1: AdminFunctionalitiesImpl.addQuestion(adminCategory,scanner);break;
                        		case 2: AdminFunctionalitiesImpl.editQuestion(adminCategory,scanner); break;
                        		case 3: AdminFunctionalitiesImpl.deleteQuestion(adminCategory,scanner); break;
                        		case 4: break;
                        		}
                    		}while(adminOperationChoice != GeneralConstants.FOUR_INT);
                		}
            		}while(adminCategory != AppData.getCategories().size()+1);
            	}else if(userChoice == AppData.getCategories().size()+1){ // if user wants to exit
            		break;
            	}else { // if user mode is activated
            			HandleIpOp.printUserMode(); // welcome method for user
            			GamePlayer.playGame(userChoice,scanner); // starts the game for category selected by the user
            	}
        	}while(userChoice != AppData.getCategories().size()+1);
        	HandleIpOp.printFinalScores(); // printing resuls before exiting
        	
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
