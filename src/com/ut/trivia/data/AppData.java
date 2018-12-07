package com.ut.trivia.data;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.ut.trivia.dto.Option;
import com.ut.trivia.dto.Question;

/**
 * 
 * @author sahilgogna
 * @since November 22, 2018
 */
public class AppData {
	/**
	 * this method reads the data from a text file and initializes all the maps
	 */

	// the seprator for input file
    private static final String SEPARATOR = ";";
    
    // the map that contains all the values
    private static Map<Integer, String> categories = null;

    //map containing questions by categories
    private static Map<Integer, List<Question>> questionsByCategory = null;

    public static Map<Integer, List<Question>> getQuestionsByCategory() {
        if (questionsByCategory == null) {
            initialiseData();
        }
        return questionsByCategory;
    }

    public static Map<Integer, String> getCategories() {
        if (categories == null) {
            initialiseData();
        }
        return categories;
    }

    /**
     * reads the text file and initializes all the maps and lists
     */
    private static void initialiseData() {
        categories = new HashMap<>();
        questionsByCategory = new HashMap<>();
        try (Scanner scanner = new Scanner(new File("triviadata"))) {
            int noOfCategory = Integer.parseInt(scanner.nextLine()); // reading number of categories
            for (int i=1; i<= noOfCategory; i++){
                String categoryLine = scanner.nextLine(); // reading category name and no of ques
                String[] categoryParts = categoryLine.split(SEPARATOR);
                String categoryName = categoryParts[0];
                int noOfQuestion = Integer.parseInt(categoryParts[1]);
                categories.put(i, categoryName);
                questionsByCategory.put(i, new ArrayList<>());
                for (int j = 1; j <= noOfQuestion; j++) {
                    String questionLine = scanner.nextLine(); // reading question, number of options and correct option
                    String[] questionParts = questionLine.split(SEPARATOR);
                    String questionText = questionParts[0];
                    int noOfOption = Integer.parseInt(questionParts[1]);
                    Question question = new Question(j, questionText);
                    List<Option> options = new ArrayList<>();
                    for (int k = 1; k <= noOfOption; k++) {
                        String optionText = scanner.nextLine();
                        Option option = new Option(k, optionText);
                        options.add(option);
                    }
                    int correctOption = Integer.parseInt(questionParts[2]);
                    question.setOptionList(options);
                    question.setCorrectOption(correctOption);
                    questionsByCategory.get(i).add(question); // adding to our list
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
