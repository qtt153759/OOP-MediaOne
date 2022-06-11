package Question;

import Subject.Subject;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author truong
 */
public class MultipleChoiceQuestion extends Question {

    List<Choice> choice;
    Choice answer;

    public MultipleChoiceQuestion(String question, List<Choice> choice, Choice answer, int level, int chapter, Subject subject) {
        super(question, level, chapter, subject);
        this.choice = choice;
        this.answer = answer;
    }

    @Override
    public String getAnswer() {
        String listChoice = "Choice list: ";
        for (Choice choi : choice) {
            listChoice += choi.getChoice();
        }
        return listChoice + "\nMulti answer is " + this.answer.getChoice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Choice> getChoice() {
        return this.choice;
    }

    public void printChoiceList() {

    }

    public void addAnswer(List<Choice> choiceList, Choice choice) {
        this.choice = choiceList;
        this.answer = choice;
    }

}
