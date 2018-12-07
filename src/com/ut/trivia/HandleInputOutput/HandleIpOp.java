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

/**
 * 
 * 
 * @author sahilgogna Nov 30, 2018
 */
public class HandleIpOp {
	/**
	 * this class handle all the inputs and outputs of the program
	 */

	/**
	 * this method is used to get the input choice of the user
	 * 
	 * @param scanner object of scanner class
	 * @return choice category choice of user
	 */
	public static int getCategoryChoice(Scanner scanner) {
		System.out.println(GeneralConstants.START_MESSAGE);
		printCategoryChoice();
		Integer categoryChoice = null;
		do {
			try {
				String cateGoryChoiceText = scanner.nextLine();
				categoryChoice = Integer.parseInt(cateGoryChoiceText);
				if ((categoryChoice < GeneralConstants.ZERO_INT || categoryChoice > AppData.getCategories().size() + 1) // number of categorie+1 for exit option
						&& categoryChoice != AdminConstants.ADMIN_CODE) {
					categoryChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			}
		} while (categoryChoice == null);

		return categoryChoice;
	}

	/**
	 * this method is used to get the input choice of the administrator
	 * 
	 * @param scanner scanner class object
	 * @return admin category choice
	 */
	public static int getAdminCategoryChoice(Scanner scanner) {
		System.out.println(GeneralConstants.START_MESSAGE_ADMIN);
		printAdminCategoryChoice();
		Integer categoryChoice = null;
		do {
			try {
				String cateGoryChoiceText = scanner.nextLine();
				categoryChoice = Integer.parseInt(cateGoryChoiceText);
				if ((categoryChoice < GeneralConstants.ZERO_INT || categoryChoice > AppData.getCategories().size())
						&& categoryChoice != AdminConstants.ADMIN_CODE) {
					categoryChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			}
		} while (categoryChoice == null);

		return categoryChoice;
	}

	/**
	 * this is used to get which operation admin wants to perform
	 * 
	 * @param scan scanner class object
	 * @return admin operation choice
	 */
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
				if (adminChoice < GeneralConstants.ZERO_INT || adminChoice > GeneralConstants.FOUR_INT) { // if not between the number of categories
					adminChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			}
		} while (adminChoice == null);

		return adminChoice;

	}

	/**
	 * gets the new question from the administrator
	 * 
	 * @param scanner scanner class object
	 * @return question in the form of String
	 */
	public static String getNewQuestion(Scanner scanner) {
		System.out.println(AdminConstants.ADD_REQUEST);
		String questionText = scanner.nextLine();
		return questionText;
	}

	/**
	 * gets the list of options from the user
	 * 
	 * @param scanner scanner class object
	 * @return option List
	 */
	public static List<Option> geQuestionOptions(Scanner scanner) {
		int numberOfOptions = 0;
		List<Option> optionsList = new ArrayList<>();

		do {
			try {
				System.out.println(AdminConstants.NUM_OF_OPT_REQ);
				String options = scanner.nextLine();
				numberOfOptions = Integer.parseInt(options);
				if (numberOfOptions < GeneralConstants.ONE_INT && numberOfOptions > GeneralConstants.FIVE_INT) { //maximium number of options that an admin can enter is 5
					numberOfOptions = GeneralConstants.MINUS_ONE_INT;
					System.out.println(AdminConstants.NUM_OF_OPT_ERROR);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);
			}

		} while (numberOfOptions == GeneralConstants.MINUS_ONE_INT);

		for (int i = 1; i <= numberOfOptions; i++) {
			System.out.println(AdminConstants.ENTER_OPT_REQ + i);
			String optionText = scanner.nextLine();
			Option option = new Option(i, optionText);
			optionsList.add(option);
		}

		return optionsList;
	}

	/**
	 * gets the correct option from the user
	 * 
	 * @param scan scanner class object
	 * @param options list of options for a question
	 * @return correct option
	 */
	public static int getCorrectOption(Scanner scan, List<Option> options) {
		System.out.println(AdminConstants.CORRECT_ANS_REQ);
		Integer correctOption = null;
		do {
			try {
				String stringCorrectAns = scan.nextLine();
				correctOption = Integer.parseInt(stringCorrectAns);
				if (correctOption < GeneralConstants.ZERO_INT || correctOption > options.size()) {
					correctOption = GeneralConstants.MINUS_ONE_INT;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);

			}
		} while (correctOption == GeneralConstants.MINUS_ONE_INT);

		return correctOption;
	}

	/**
	 * gets which question number admin wants to edit
	 * 
	 * @param adminCategory index of category selected by the admin
	 * @param scan scanner class object
	 * @return position of question
	 */
	public static int getEditQuestionIndex(int adminCategory, Scanner scan) {
		System.out.println(AdminConstants.EDIT_REQUEST);
		for (Question question : AppData.getQuestionsByCategory().get(adminCategory)) {
			System.out.println(question.getQuestionId() + GeneralConstants.DOT_SPACE + question.getText());
		}
		Integer questionNumber = null;

		do {
			try {
				String quesNum = scan.nextLine();
				questionNumber = Integer.parseInt(quesNum);
				if ((questionNumber < GeneralConstants.ZERO_INT
						|| questionNumber > AppData.getQuestionsByCategory().get(adminCategory).size())) {
					questionNumber = GeneralConstants.MINUS_ONE_INT;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);

			}
		} while (questionNumber == GeneralConstants.MINUS_ONE_INT);

		return questionNumber;
	}

	/**
	 * gets edited question
	 * 
	 * @param scanner scanner class object
	 * @return new edited question
	 */
	public static String getEditedQuestion(Scanner scanner) {
		System.out.println(AdminConstants.EDIT_QUES_REQ);
		String questionText = scanner.nextLine();
		return questionText;
	}

	/**
	 * gets which question number admin wants to delete
	 * 
	 * @param adminCategory as Integer
	 * @param scanner scanner class object 
	 * @return position of question
	 */
	public static int getDeleteQuestionIndex(int adminCategory, Scanner scan) {
		Integer questionNumber = null;
		if (AppData.getQuestionsByCategory().get(adminCategory).size() > GeneralConstants.ZERO_INT) {
			System.out.println(AdminConstants.DEL_QUES_REQ);
			for (Question question : AppData.getQuestionsByCategory().get(adminCategory)) {
				System.out.println(question.getQuestionId() + GeneralConstants.DOT_SPACE + question.getText());
			}

			do {
				try {
					String quesNum = scan.nextLine();
					questionNumber = Integer.parseInt(quesNum);
					if ((questionNumber < GeneralConstants.ZERO_INT
							|| questionNumber > AppData.getQuestionsByCategory().get(adminCategory).size())) {
						questionNumber = GeneralConstants.MINUS_ONE_INT;
						System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
					}
				} catch (NumberFormatException e) {
					//If entered number is not number so it will fail number conversion so asking user to enter again
					System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);

				}
			} while (questionNumber == GeneralConstants.MINUS_ONE_INT);

		} else {
			questionNumber = GeneralConstants.MINUS_ONE_INT;
		}
		return questionNumber;
	}

	/**
	 * prints all the categories for user
	 * 
	 */
	private static void printCategoryChoice() {
		for (Map.Entry<Integer, String> category : AppData.getCategories().entrySet()) {
			System.out.println(category.getKey() + GeneralConstants.DOT_SPACE + category.getValue());
		}
		System.out.println((AppData.getCategories().entrySet().size() + 1) + GeneralConstants.DOT_SPACE + "Exit");
	}

	/**
	 * prints all the categories for admin
	 * 
	 */
	private static void printAdminCategoryChoice() {
		for (Map.Entry<Integer, String> category : AppData.getCategories().entrySet()) {
			System.out.println(category.getKey() + GeneralConstants.DOT_SPACE + category.getValue());
		}
	}

	/**
	 * prints the welcome message for the admin
	 */
	public static void printAdminWelcome() {
		System.out.println(AdminConstants.DASH + AdminConstants.WELCOME_MESSAGE + AdminConstants.DASH);
	}

	/**
	 * prints admin mode
	 */
	public static void printAdminMode() {
		System.out.println(AdminConstants.MODE_ADMIN);
	}

	/**
	 * prints user mode
	 */
	public static void printUserMode() {
		System.out.println(GeneralConstants.MODE_USER);
	}

	/**
	 * prints options of the input question
	 * 
	 * @param question
	 */
	public static void printQuestionOptions(Question question) {
		System.out.println(question.getQuestionId() + GeneralConstants.DOT_SPACE + question.getText());
		for (Option option : question.getOptionList()) {
			System.out.println(option.getOptionId() + GeneralConstants.DOT_SPACE + option.getText());
		}
	}

	/**
	 * gets user choice
	 * 
	 * @param scanner scanner class object
	 * @param numberOfChoices number of choices for question
	 * @return
	 */
	public static int getUserOptionChoice(Scanner scanner, int numberOfChoices) {
		System.out.println(GeneralConstants.USER_OPTION_REQUEST);
		Integer userChoice = null;

		do {
			try {
				String userChoiceText = scanner.nextLine();
				userChoice = Integer.parseInt(userChoiceText);
				if (userChoice < GeneralConstants.ZERO_INT || userChoice > numberOfChoices) {
					userChoice = null;
					System.out.println(GeneralConstants.ENTER_RIGHT_CHOICE);
				}
			} catch (NumberFormatException e) {
				//If entered number is not number so it will fail number conversion so asking user to enter again
				System.out.println(GeneralConstants.NUMBER_IP_ERROR_MESSAGE);

			}
		} while (userChoice == null);

		return userChoice;
	}

	/**
	 * prints the final scores
	 */
	public static void printFinalScores() {
		System.out.println("\nHere are the results!\n");
		System.out.println("Total number of games played: " + GamePlayer.getResultList().size());
		// for each game played by the user print the result
		for (Results result : GamePlayer.getResultList()) {
			System.out.println(result.getCategory() + "----" + result.getScore() + "%");
		}
	}

	/**
	 * prints the message of wrong answer and also the correct option
	 * @param correctOption
	 */
	public static void printRightChoice(int correctOption) {
		System.out.println("\nWrong Answer! Correct option is :" + correctOption + "\n");

	}

	/**
	 * THe correct option
	 */
	public static void printCorrectOption() {
		System.out.println("\nCorrect Option!\n");

	}

}
