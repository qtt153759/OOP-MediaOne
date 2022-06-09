/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truong
 */
public class Exam {
    int level;
   int chapter;
   Essay essay;
   MultipleChoice multipleChoice;
   Subject subject;
   public Exam(){

   }
   public List<Question> getExam(int level,int chapter,Subject subject){
       essay=new Essay();
       multipleChoice =new MultipleChoice();
       List<EssayQuestion> essayQuestionList=essay.getEssayQuestion(level, chapter,subject);
       List<MultipleChoiceQuestion> multipleChoiceQuestionList=multipleChoice.getMultipleChoice(level, chapter,subject);
       List<Question> question=new ArrayList<Question>();
       question.addAll(essayQuestionList);
       question.addAll(multipleChoiceQuestionList);
       return question;
   }

  
}
