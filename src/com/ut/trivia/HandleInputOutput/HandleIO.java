package com.ut.trivia.HandleInputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ut.trivia.constants.AdminConstants;
import com.ut.trivia.constants.GeneralConstants;
/**
 * this class handles the input and output functions
 * 
 * @author sahilgogna
 * Nov 18, 2018
 */
public class HandleIO {
	
	Scanner scan = new Scanner(System.in);
	/**
	 * this method handles user input
	 * 
	 * @return choice entered by the user as a String
	 */
	public String HandleInput() {
		String choice = null;
		try {
			System.out.println(GeneralConstants.START_MESSAGE);
			System.out.println(GeneralConstants.ONE+GeneralConstants.DOT+GeneralConstants.SPACE+GeneralConstants.GAME_CATEGORY_FOOD);
			System.out.println(GeneralConstants.TWO+GeneralConstants.DOT+GeneralConstants.SPACE+GeneralConstants.GAME_CATEGORY_ANIMAL);
			System.out.println(GeneralConstants.THREE+GeneralConstants.DOT+GeneralConstants.SPACE+GeneralConstants.GAME_CATEGORY_GEOGRAPHY);
			System.out.println(GeneralConstants.FOUR+GeneralConstants.DOT+GeneralConstants.SPACE+GeneralConstants.GAME_CATEGORY_HISTORY);
			System.out.println(GeneralConstants.FIVE+GeneralConstants.DOT+GeneralConstants.SPACE+GeneralConstants.GAME_CATEGORY_HOBBIES);
			System.out.println(GeneralConstants.SIX+GeneralConstants.DOT+GeneralConstants.SPACE+GeneralConstants.GAME_CATEGORY_SPORTS);
			System.out.println(GeneralConstants.ENTER_CHOICE);
			choice = scan.nextLine();
		}catch(InputMismatchException exception) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
		}catch(Exception exception) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
		}
		return choice;
	}
	
	/**
	 * this method handles Administrator input
	 * 
	 * @return choice entered by the user as a String
	 */
	public String HandleAdminInput() {
		String choice = null;
		try {
			System.out.println(AdminConstants.WELCOME_MESSAGE);
			System.out.println(AdminConstants.OPTION_1);
			System.out.println(AdminConstants.OPTION_2);
			System.out.println(AdminConstants.OPTION_3);
			System.out.println(AdminConstants.OPTION_4);
			System.out.println(AdminConstants.ENTER_OPTION);
			choice = scan.nextLine();
		}catch(InputMismatchException exception) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
		}catch(Exception exception) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
		}
		return choice;
	}
	
	/**
	 * this method handles the user output
	 */
    public void HandleOutput() {
		
	}
    

}
