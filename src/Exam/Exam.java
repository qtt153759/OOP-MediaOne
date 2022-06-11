/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import Question.EssayQuestion;
import Question.Question;
import Question.ManageQuestion;
import Question.MultipleChoiceQuestion;
import Subject.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truong
 */
public class Exam {
   String name;
   int level;
   int chapter;
   Essay essay;
   MultipleChoice multipleChoice;
   List<Question> questionList;
   Subject subject;
   public Exam(String name){
       this.name=name;
       this.essay=new Essay();
       this.multipleChoice=new MultipleChoice();
       this.questionList=new ArrayList<Question>();
   }
   public void createShuffleExam(int level,int chapter,Subject subject){
       this.level=level;
       this.chapter=chapter;
       this.subject=subject;
       List<EssayQuestion> essayList=(List)ManageQuestion.getQuestionList(level, chapter, subject,"ESSAY");
       List<MultipleChoiceQuestion> multipleChoiceList=(List)ManageQuestion.getQuestionList(level, chapter, subject, "MULTIPLE_CHOICE");
       essayList=ManageQuestion.getShuffleQuestion((List)essayList,5);
       multipleChoiceList=ManageQuestion.getShuffleQuestion((List)multipleChoiceList,5);
       this.essay.setEssayQuestion(essayList);
       this.multipleChoice.setMultipleChoiceQuestion(multipleChoiceList);
       this.questionList.addAll(essayList);
       this.questionList.addAll(multipleChoiceList);
       return;
   }
   public void printExam(){
       System.out.println("exam-name: "+this.name+" level: "+this.level+" chapter: "+this.chapter);
   }
}
