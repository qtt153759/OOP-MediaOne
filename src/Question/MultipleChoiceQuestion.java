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
    List<Choice> answer;

    public MultipleChoiceQuestion(String question, List<Choice> choice,  List<Choice> answer, int level, int chapter, Subject subject) {
        super(question, level, chapter, subject);
        this.choice = choice;
        this.answer = answer;
    }

    @Override
    public String getAnswer() {
        String listChoice = "Options : ";
        String listAnsw = "\nAnswers : ";
        for (Choice choi : choice) {
            listChoice += choi.getChoice()+" - ";
        }
        for( Choice answ:answer){
            listAnsw+=answ.getChoice()+" - ";
        }
        return listChoice + listAnsw; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Choice> getChoice() {
        return this.choice;
    }
    public List<Choice> getAnswerList(){
        return this.answer;
    }


    public void setAnswer(List<Choice> choiceList, List<Choice> answer) {
        this.choice = choiceList;
        this.answer = answer;
    }

}
