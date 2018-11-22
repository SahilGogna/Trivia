package com.sahil.trivia.dto;

import com.sahil.trivia.data.AppData;
import com.ut.trivia.constants.GeneralConstants;

import java.util.List;
import java.util.Map;

/**
 * @author Nagarro
 * @since November 22, 2018
 */
public class UserSelection {

    private String                              username;
    private Map<Integer, Map<Integer, Integer>> categoryQuestionAnswerMap;

    public UserSelection(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Integer, Map<Integer, Integer>> getCategoryQuestionAnswerMap() {
        return categoryQuestionAnswerMap;
    }

    public void setCategoryQuestionAnswerMap(Map<Integer, Map<Integer, Integer>> categoryQuestionAnswerMap) {
        this.categoryQuestionAnswerMap = categoryQuestionAnswerMap;
    }

    public void printSelection() {
        System.out.println("Name: " + username);
        for (Map.Entry<Integer, Map<Integer, Integer>> categoryWise : categoryQuestionAnswerMap.entrySet()) {
            System.out.println(categoryWise.getKey() + GeneralConstants.DOR_SPACE + AppData.getCategories().get(categoryWise.getKey()));
            List<Question> questions = AppData.getQuestionsByCategory().get(categoryWise.getKey());
            for (Map.Entry<Integer, Integer> questionWise : categoryWise.getValue().entrySet()) {
                System.out.println("Question "+questionWise.getKey() + GeneralConstants.DOR_SPACE + questions.get(questionWise.getKey()).getText());
                System.out.println("Answer "+(char) (65 + questionWise.getValue()) + GeneralConstants.DOR_SPACE + questions.get(questionWise.getKey()).getOptionList().get(questionWise.getValue()).getText());
            }

        }
    }
}
