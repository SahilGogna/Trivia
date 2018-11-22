package com.sahil.trivia;

import com.sahil.trivia.data.AppData;
import com.sahil.trivia.dto.Option;
import com.sahil.trivia.dto.Question;
import com.sahil.trivia.dto.UserSelection;
import com.ut.trivia.constants.GeneralConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Nagarro
 * @since November 22, 2018
 */
public class AppStarter {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            UserSelection userSelection = new UserSelection("Sahil Gogna");
            System.out.println(GeneralConstants.START_MESSAGE);
            printCategoryChoice();
            Integer categoryChoice = null;
            do {
                try {
                    String cateGoryChoiceText = scanner.nextLine();
                    categoryChoice = Integer.parseInt(cateGoryChoiceText);
                    if (categoryChoice < 0 && categoryChoice > AppData.getCategories().size()) {
                        categoryChoice = null;
                        System.out.println("Please enter right choice");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter number only");
                }
            } while (categoryChoice == null);
            printQuetions(categoryChoice);

            //Printing sample user selection. This can be recorded by given user input
            sampleUserSelection().printSelection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printCategoryChoice() {
        for (Map.Entry<Integer, String> category : AppData.getCategories().entrySet()) {
            System.out.println(category.getKey() + GeneralConstants.DOR_SPACE + category.getValue());
        }
    }

    private static void printQuetions(int category) {
        for (Question question : AppData.getQuestionsByCategory().get(category)) {
            System.out.println(question.getQuestionId() + GeneralConstants.DOR_SPACE + question.getText());
            for (Option option : question.getOptionList()) {
                System.out.println((char) (65 + option.getOptionId()) + GeneralConstants.DOR_SPACE + option.getText());
            }
        }
    }

    public static UserSelection sampleUserSelection(){
        UserSelection userSelection = new UserSelection("Shiv");
        Map<Integer, Map<Integer, Integer>> prefrences = new HashMap<>();
        prefrences.put(1, new HashMap<Integer, Integer>(){{
            put(0,1);
            put(1,3);
            put(2,0);
        }});
        userSelection.setCategoryQuestionAnswerMap(prefrences);
        return userSelection;
    }
}
