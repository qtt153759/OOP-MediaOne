/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

import Subject.ManageSubject;
import Subject.Subject;
import static Subject.ManageSubject.subjectList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author truong
 */
public  class ManageQuestion {
    public static List<Question> questionList;
    public static List<MultipleChoiceQuestion> multipleChoiceQuestionList;
    public static List<EssayQuestion> essayQuestionList;
    public ManageQuestion(){
        this.questionList=new ArrayList<Question>();
        this.essayQuestionList=new ArrayList<EssayQuestion>();
        this.multipleChoiceQuestionList=new ArrayList<MultipleChoiceQuestion>();
    }
    public void mockQuestionList(){
        mockEssayQuestion();
        mockMultipleQuestion();
        this.questionList.addAll(this.essayQuestionList);
        this.questionList.addAll(this.multipleChoiceQuestionList);

    }
    public  void mockEssayQuestion(){
       this.essayQuestionList.add(new EssayQuestion("how old are you", "i'm fine, thanks",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Bye Bye", "i'm eight",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("What is your name", "i'm truong",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("How are you", "i'm fine, thanks",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Nothing gonna change my love for you", "i'm chirstan",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Good morning", "moring good",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Good afternoon", "afternoon good",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("God bless you", "Dear sir",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Hello fron the out the side", "Hello everyone",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Everyday i love you", "nothing at all",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("Avenger", "Caption america",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("What do you want", "i want more",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("This is a table", "thatle",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.essayQuestionList.add(new EssayQuestion("how do you do", "i'm police",5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));

   }
    public void mockMultipleQuestion(){
      List<Choice> choice=new ArrayList<Choice>();
       choice.add(new Choice(1,"abc"));
       choice.add(new Choice(2,"cdc"));
       choice.add(new Choice(3,"bce"));
       choice.add(new Choice(4,"asdf"));
 
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("how old are you",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("What time is it",choice,choice.get(new Random().nextInt(choice.size())),6,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Do you have launch",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Hello from the out the side",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("how old are you",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("how do you like that",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("let her go",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Photography",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Among us",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Landmark",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("international company",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
       this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("solution architect",choice,choice.get(new Random().nextInt(choice.size())),5,2,ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));

       return;
   }
  
    public static List<Question> getShuffleQuestion(List<Question>questionList,int numberQuestion){
        //nếu số câu hỏi mà lớn hơn tổng số questionList thì numberQuestion=questionList;
        numberQuestion=questionList.size()<numberQuestion?questionList.size():numberQuestion;
        List<Question> tmpQuestions=new ArrayList<Question>(questionList);
        List<Question> shuffleQuestions=new ArrayList<Question>();
        for(int i=0;i<numberQuestion;i++){
            int v=new Random().nextInt(tmpQuestions.size());
            shuffleQuestions.add(tmpQuestions.get(v));
            tmpQuestions.remove(tmpQuestions.get(v));
        }
        return shuffleQuestions;
    }
    public static List<Question> getQuestionList(int level,int chapter,Subject subject,String type){
        List<Question> tmpQuestionList=new ArrayList<Question>();
        switch (type){
            case "MULTIPLE_CHOICE":
                tmpQuestionList.addAll(ManageQuestion.multipleChoiceQuestionList);
                break;
            case "ESSAY":
                tmpQuestionList.addAll(ManageQuestion.essayQuestionList);
                break;
            default:
                tmpQuestionList.addAll(ManageQuestion.essayQuestionList);
                tmpQuestionList.addAll(ManageQuestion.multipleChoiceQuestionList);
                break;     
        }
        tmpQuestionList=getQuestionListByLevel(tmpQuestionList, level);
        tmpQuestionList=getQuestionListByChapter(tmpQuestionList, chapter);
        tmpQuestionList=getQuestionListBySubject(questionList, subject);
        System.out.println("check tmpQuest"+tmpQuestionList.size());
        return tmpQuestionList;
    }
    public static List<Question> getQuestionListByLevel(List<Question>questionList,int level){
       List<Question> result = new ArrayList<Question>();
       result=questionList.stream().filter( quest -> quest.level==level).collect(Collectors.toList());
       return result;
    }
    public static List<Question> getQuestionListByChapter(List<Question>questionList,int chapter){
       List<Question> result = new ArrayList<Question>();
       result=questionList.stream().filter( quest -> quest.chapter==chapter).collect(Collectors.toList());
       return result;
    }
    public static List<Question> getQuestionListBySubject(List<Question>questionList,Subject subject){
       List<Question> result = new ArrayList<Question>();
       result=questionList.stream().filter( quest -> quest.subject==subject).collect(Collectors.toList());
       return result;
    }
    public void printQuestionList(){
        System.out.println("SubjectList"+this.questionList.size());
        if(questionList.size()>0){
            for(Question question: this.questionList){
                question.printQuestion();
                System.out.println("======");
            }
        }
    }
}
