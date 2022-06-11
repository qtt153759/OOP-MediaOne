package Exam;

import Question.EssayQuestion;
import Question.Question;
import Subject.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author truong
 */
public class Essay {
   List<EssayQuestion> essayQuestion;
   int level;
   int chapter;
   public Essay(){
       this.essayQuestion=new ArrayList<EssayQuestion>();
   }
   public List<EssayQuestion> getEssayQuestion(int level,int chapter,Subject subject){
       List<EssayQuestion> result = new ArrayList<EssayQuestion>();
       System.out.println("origin essay"+essayQuestion.size()+"   "+level +chapter+subject.name);
       result=this.essayQuestion.stream().filter( essayQuestion -> essayQuestion.level==level && essayQuestion.chapter==chapter && essayQuestion.subject.name==subject.name).collect(Collectors.toList());
       System.out.println("result esay"+result.size());
       return result;
   }
   public void addEssayQuestion(String question,String hint,int level,int chapter,Subject subject){
       EssayQuestion essayQuest=new EssayQuestion(question,hint,level,chapter,subject);
       this.essayQuestion.add(essayQuest);
       return;
   }
   public void setEssayQuestion(List<EssayQuestion> essayQuestion){
       this.essayQuestion=essayQuestion;
   }

}