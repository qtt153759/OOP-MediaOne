package Exam;

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
    public MultipleChoiceQuestion(String question,List<Choice> choice,int level,int chapter,Subject subject){
        super(question,level,chapter,subject);
        this.choice=choice;
        
    }
}
