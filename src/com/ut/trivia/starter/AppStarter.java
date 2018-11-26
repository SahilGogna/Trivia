package com.ut.trivia.starter;

import java.util.Scanner;

import com.ut.trivia.AdminOptions.AdminFunctionalities;
import com.ut.trivia.HandleInputOutput.HandleIpOp;
import com.ut.trivia.constants.AdminConstants;
import com.ut.trivia.constants.GeneralConstants;

/**
 * @author sahilgogna
 * @since November 22, 2018
 */
public class AppStarter {

    public static void main(String[] args) {
    	
        try {
            Scanner scanner = new Scanner(System.in);
            int userChoice = -1;
        	do {
        		userChoice = HandleIpOp.getCategoryChoice(scanner);
        		if(userChoice == AdminConstants.ADMIN_CODE) {
            		HandleIpOp.printAdminWelcome();
            		int adminOperationChoice;
            		do{
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
            	}
            		else {
            			HandleIpOp.printUserMode();
            	}
        	}while(userChoice != GeneralConstants.SEVEN_INT);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
