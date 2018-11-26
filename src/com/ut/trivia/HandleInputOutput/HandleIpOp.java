package com.ut.trivia.HandleInputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.ut.trivia.UserOptions.GamePlayer;
import com.ut.trivia.constants.AdminConstants;
import com.ut.trivia.constants.GeneralConstants;
import com.ut.trivia.data.AppData;
import com.ut.trivia.dto.Option;
import com.ut.trivia.dto.Question;
import com.ut.trivia.dto.Results;

public class HandleIpOp {

	public static int getCategoryChoice(Scanner scanner) {
		System.out.println(GeneralConstants.START_MESSAGE);
		printCategoryChoice();
		Integer categoryChoice = null;
		try {
			do {
				String cateGoryChoiceText = scanner.nextLine();
				categoryChoice = Integer.parseInt(cateGoryChoiceText);
				if ((categoryChoice < GeneralConstants.ZERO_INT || categoryChoice > AppData.getCategories().size()+1)
						&& categoryChoice != AdminConstants.ADMIN_CODE) {
					categoryChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} while (categoryChoice == null);
		} catch (NumberFormatException e) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			e.printStackTrace();
		}
		return categoryChoice;
	}

	public static int getAdminOperationChoice(Scanner scan) {
		System.out.println(AdminConstants.WELCOME_MESSAGE);
		System.out.println(AdminConstants.OPTION_1);
		System.out.println(AdminConstants.OPTION_2);
		System.out.println(AdminConstants.OPTION_3);
		System.out.println(AdminConstants.OPTION_4);
		System.out.println(AdminConstants.ENTER_OPTION);
		Integer adminChoice = null;
		do {
			try {

				String choice = scan.nextLine();
				adminChoice = Integer.parseInt(choice);
				if (adminChoice < GeneralConstants.ZERO_INT || adminChoice > GeneralConstants.FOUR_INT) {
					adminChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);

			}
		} while (adminChoice == null);

		return adminChoice;

	}

	public static String getNewQuestion(Scanner scanner) {
		System.out.println(AdminConstants.ADD_REQUEST);
		String questionText = scanner.nextLine();
		return questionText;
	}

	public static List<Option> geQuestionOptions(Scanner scanner) {
		int numberOfOptions;
		List<Option> optionsList = new ArrayList<>();
		try {
			do {
				System.out.println(AdminConstants.NUM_OF_OPT_REQ);
				String options = scanner.nextLine();
				numberOfOptions = Integer.parseInt(options);
				if (numberOfOptions < GeneralConstants.ONE_INT && numberOfOptions > GeneralConstants.FIVE_INT) {
					numberOfOptions = GeneralConstants.MINUS_ONE_INT;
					System.out.println(AdminConstants.NUM_OF_OPT_ERROR);
				}
			} while (numberOfOptions == GeneralConstants.MINUS_ONE_INT);

			for (int i = 1; i <= numberOfOptions; i++) {
				System.out.println(AdminConstants.ENTER_OPT_REQ + i);
				String optionText = scanner.nextLine();
				Option option = new Option(i, optionText);
				optionsList.add(option);
			}
		} catch (NumberFormatException e) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
		}
		return optionsList;
	}

	public static int getCorrectOption(Scanner scan, List<Option> options) {
		System.out.println(AdminConstants.CORRECT_ANS_REQ);
		Integer correctOption = null;
		try {
			do {
				String stringCorrectAns = scan.nextLine();
				correctOption = Integer.parseInt(stringCorrectAns);
				if (correctOption < GeneralConstants.ZERO_INT || correctOption > options.size()) {
					correctOption = GeneralConstants.MINUS_ONE_INT;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} while (correctOption == GeneralConstants.MINUS_ONE_INT);
		} catch (NumberFormatException e) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			e.printStackTrace();
		}
		return correctOption;
	}

	public static int getEditQuestionIndex(int adminCategory, Scanner scan) {
		System.out.println(AdminConstants.EDIT_REQUEST);
		for (Question question : AppData.getQuestionsByCategory().get(adminCategory)) {
			System.out.println(question.getQuestionId() + GeneralConstants.DOT_SPACE + question.getText());
		}
		Integer questionNumber = null;
		try {
			do {
				String quesNum = scan.nextLine();
				questionNumber = Integer.parseInt(quesNum);
				if ((questionNumber < GeneralConstants.ZERO_INT
						|| questionNumber > AppData.getQuestionsByCategory().get(adminCategory).size())) {
					questionNumber = GeneralConstants.MINUS_ONE_INT;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} while (questionNumber == GeneralConstants.MINUS_ONE_INT);

		} catch (NumberFormatException e) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			e.printStackTrace();
		}
		return questionNumber;
	}

	public static String getEditedQuestion(Scanner scanner) {
		System.out.println(AdminConstants.EDIT_QUES_REQ);
		String questionText = scanner.nextLine();
		return questionText;
	}

	public static int getDeleteQuestionIndex(int adminCategory, Scanner scan) {
		Integer questionNumber = null;
		if (AppData.getQuestionsByCategory().get(adminCategory).size() > GeneralConstants.ZERO_INT) {
			System.out.println(AdminConstants.DEL_QUES_REQ);
			for (Question question : AppData.getQuestionsByCategory().get(adminCategory)) {
				System.out.println(question.getQuestionId() + GeneralConstants.DOT_SPACE + question.getText());
			}
			try {
				do {
					String quesNum = scan.nextLine();
					questionNumber = Integer.parseInt(quesNum);
					if ((questionNumber < GeneralConstants.ZERO_INT
							|| questionNumber > AppData.getQuestionsByCategory().get(adminCategory).size())) {
						questionNumber = GeneralConstants.MINUS_ONE_INT;
						System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
					}
				} while (questionNumber == GeneralConstants.MINUS_ONE_INT);

			} catch (NumberFormatException e) {
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
				e.printStackTrace();
			}
		} else {
			questionNumber = GeneralConstants.MINUS_ONE_INT;
		}
		return questionNumber;
	}

	private static void printCategoryChoice() {
		for (Map.Entry<Integer, String> category : AppData.getCategories().entrySet()) {
			System.out.println(category.getKey() + GeneralConstants.DOT_SPACE + category.getValue());
		}
	}

	public static void printAdminWelcome() {
		System.out.println(AdminConstants.DASH + AdminConstants.WELCOME_MESSAGE + AdminConstants.DASH);
	}

	public static void printAdminMode() {
		System.out.println(AdminConstants.MODE_ADMIN);
	}

	public static void printUserMode() {
		System.out.println(GeneralConstants.MODE_USER);
	}
	
	public static void printQuestionOptions(Question question) {
		System.out.println(question.getQuestionId() + GeneralConstants.DOT_SPACE + question.getText());
		for (Option option : question.getOptionList()) {
          System.out.println( option.getOptionId() + GeneralConstants.DOT_SPACE + option.getText());
      }
	}
	
	public static int getUserOptionChoice(Scanner scanner, int numberOfChoices) {
		System.out.println(GeneralConstants.USER_OPTION_REQUEST);
		Integer userChoice = null;
		try {
			do {
				String userChoiceText = scanner.nextLine();
				userChoice = Integer.parseInt(userChoiceText);
				if (userChoice < GeneralConstants.ZERO_INT || userChoice > numberOfChoices) {
					userChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} while (userChoice == null);
		} catch (NumberFormatException e) {
			System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			e.printStackTrace();
		}
		return userChoice;
	}
	
	public static void printFinalScores() {
		System.out.println("Here are the results!");
		System.out.println("Total number of games played: "+ GamePlayer.getResultList().size());
		for(Results result: GamePlayer.getResultList()) {
			System.out.println(result.getCategory() +"----"+ result.getScore()+"%");
		}
	}

	public static void printRightChoice(int correctOption) {
		System.out.println("Wrong Answer! Correct option is :" + correctOption);
		
	}

	public static void printCorrectOption() {
		System.out.println("Correct Option!");
		
	}

}
