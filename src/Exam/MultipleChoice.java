/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

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
   int level;
   int chapter;
   List<Subject>subjectList;
   public MultipleChoice(){
       this.multipleChoiceQuestion=new ArrayList<MultipleChoiceQuestion>();

   }
   public List<MultipleChoiceQuestion> getMultipleChoice(int level,int chapter,Subject subject){
       List<MultipleChoiceQuestion> result = new ArrayList<MultipleChoiceQuestion>();
       result=this.multipleChoiceQuestion.stream().filter( multipleChoiceQuestion -> multipleChoiceQuestion.level==level && multipleChoiceQuestion.chapter==chapter && multipleChoiceQuestion.subject.name==subject.name).collect(Collectors.toList());
       System.out.println("cheasf"+result.size());
       return result;
   }
   public void createMockMultipleChoiceQuestion(List<Subject>subjectList){
       List<Choice> choice=new ArrayList<Choice>();
       choice.add(new Choice(1,"abc"));
       choice.add(new Choice(2,"cdc"));
       choice.add(new Choice(3,"bce"));
       choice.add(new Choice(4,"asdf"));
       this.multipleChoiceQuestion.add(new MultipleChoiceQuestion("how old are you",choice,choice.get(new Random().nextInt(choice.size())),5,2,subjectList.get(new Random().nextInt(subjectList.size()))));
       this.multipleChoiceQuestion.add(new MultipleChoiceQuestion("What time is it",choice,choice.get(new Random().nextInt(choice.size())),6,2,subjectList.get(new Random().nextInt(subjectList.size()))));
       this.multipleChoiceQuestion.add(new MultipleChoiceQuestion("Do you have launch",choice,choice.get(new Random().nextInt(choice.size())),5,2,subjectList.get(new Random().nextInt(subjectList.size()))));
       this.multipleChoiceQuestion.add(new MultipleChoiceQuestion("Hello from the out the side",choice,choice.get(new Random().nextInt(choice.size())),5,2,subjectList.get(new Random().nextInt(subjectList.size()))));
   }
    public void addMultipleChoiceQuestion(String question,List<Choice> choice,Choice answer,int level,int chapter,Subject subject){
       MultipleChoiceQuestion multiQuest=new MultipleChoiceQuestion(question,choice,answer,level,chapter,subject);
       this.multipleChoiceQuestion.add(multiQuest);
       return;
   }
}
