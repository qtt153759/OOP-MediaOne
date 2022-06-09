package Exam;

import java.util.ArrayList;
import java.util.List;
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
       this.essayQuestion=createMockEssayQuestion();
   }
   public Essay(List<EssayQuestion> essayQuestion){
       this.essayQuestion=essayQuestion;
   }
   public List<EssayQuestion> getEssayQuestion(int level,int chapter,Subject subject){
       List<EssayQuestion> result = new ArrayList<EssayQuestion>();
       System.out.println("origin essay"+essayQuestion.size()+"   "+level +chapter+subject.name);
              System.out.println("mock essay"+essayQuestion.get(0).level +essayQuestion.get(0).chapter+essayQuestion.get(0).subject.name);
       result=this.essayQuestion.stream().filter( essayQuestion -> essayQuestion.level==level && essayQuestion.chapter==chapter && essayQuestion.subject.name==subject.name).collect(Collectors.toList());
       System.out.println("result esay"+result.size());
       return result;
   }
   public List<EssayQuestion> createMockEssayQuestion(){
       List<EssayQuestion>tmp=new ArrayList<EssayQuestion>();
       Subject subject=new Subject("oop","IT3110",10,"khong biet");
       tmp.add(new EssayQuestion("how old are you", "i'm fine, thanks",5,2,subject));
       tmp.add(new EssayQuestion("how old are you", "i'm eight",5,2,subject));
       tmp.add(new EssayQuestion("What is your name", "i'm truong",5,2,subject));
       tmp.add(new EssayQuestion("How are you", "i'm fine, thanks",5,2,subject));
       tmp.add(new EssayQuestion("how do you do", "i'm police",5,2,subject));
       return tmp;
   }
}