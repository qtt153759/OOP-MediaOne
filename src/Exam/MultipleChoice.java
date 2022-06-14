/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import Question.MultipleChoiceQuestion;
import Question.Choice;
import Subject.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author truong
 */

public class MultipleChoice {

    List<MultipleChoiceQuestion> multipleChoiceQuestion;

    public MultipleChoice() {
        this.multipleChoiceQuestion = new ArrayList<MultipleChoiceQuestion>();

    }

    public List<MultipleChoiceQuestion> getMultipleChoice(int level, int chapter, Subject subject) {
        List<MultipleChoiceQuestion> result = new ArrayList<MultipleChoiceQuestion>();
        result = this.multipleChoiceQuestion.stream().filter(multipleChoiceQuestion -> multipleChoiceQuestion.level == level && multipleChoiceQuestion.chapter == chapter && multipleChoiceQuestion.subject.name == subject.name).collect(Collectors.toList());
        System.out.println("cheasf" + result.size());
        return result;
    }

    public void addMultipleChoiceQuestion(String question, List<Choice> choice, List<Choice> answer, int level, int chapter, Subject subject) {
        MultipleChoiceQuestion multiQuest = new MultipleChoiceQuestion(question, choice, answer, level, chapter, subject);
        this.multipleChoiceQuestion.add(multiQuest);
        return;
    }

    public void setMultipleChoiceQuestion(List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestion = multipleChoiceQuestions;
    }
}
