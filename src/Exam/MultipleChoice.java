/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author truong
 */
public class MultipleChoice {
   List<MultipleChoiceQuestion> multipleChoiceQuestion;
   int level;
   int chapter;
   public MultipleChoice(){
       this.multipleChoiceQuestion=createMockMultipleChoiceQuestion();
   }
   public MultipleChoice(List<MultipleChoiceQuestion> multipleChoiceQuestion){
       this.multipleChoiceQuestion=multipleChoiceQuestion;
   }
   public List<MultipleChoiceQuestion> getMultipleChoice(int level,int chapter,Subject subject){
       List<MultipleChoiceQuestion> result = new ArrayList<MultipleChoiceQuestion>();
              

       result=this.multipleChoiceQuestion.stream().filter( multipleChoiceQuestion -> multipleChoiceQuestion.level==level && multipleChoiceQuestion.chapter==chapter && multipleChoiceQuestion.subject.name==subject.name).collect(Collectors.toList());
       System.out.println("cheasf"+result.size());
       return result;
   }
   public List<MultipleChoiceQuestion> createMockMultipleChoiceQuestion(){
       List<MultipleChoiceQuestion>tmp=new ArrayList<MultipleChoiceQuestion>();
       List<Choice> choice=new ArrayList<Choice>();
       choice.add(new Choice(1,"abc"));
       choice.add(new Choice(2,"cdc"));
       choice.add(new Choice(3,"bce"));
       choice.add(new Choice(4,"asdf"));
       Subject subject=new Subject("oop","IT3110",10,"khong biet");
       tmp.add(new MultipleChoiceQuestion("how old are you",choice,5,2,subject));
       tmp.add(new MultipleChoiceQuestion("What time is it",choice,6,2,subject));
       tmp.add(new MultipleChoiceQuestion("Do you have launch",choice,5,2,subject));
       tmp.add(new MultipleChoiceQuestion("Hello from the out the side",choice,5,2,subject));
       return tmp;
   }
}
