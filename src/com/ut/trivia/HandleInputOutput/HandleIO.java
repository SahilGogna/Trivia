package com.ut.trivia.HandleInputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ut.trivia.constants.GeneralConstants;

public class HandleIO {
	
	Scanner scan = new Scanner(System.in);
	
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
			choice = scan.nextLine();
		}catch(InputMismatchException exception) {
			System.out.println(GeneralConstants.NUMBERFORMATEXCEPTIONMESSAGE);
		}catch(Exception exception) {
			System.out.println(GeneralConstants.NUMBERFORMATEXCEPTIONMESSAGE);
		}
		return choice;
	}
	
    public void HandleOutput() {
		
	}
    

}
