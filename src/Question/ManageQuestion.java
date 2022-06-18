/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

import Subject.ManageSubject;
import Subject.Subject;
import static Subject.ManageSubject.subjectList;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author truong
 */
public class ManageQuestion {

    public static List<Question> questionList;
    public static List<MultipleChoiceQuestion> multipleChoiceQuestionList;
    public static List<EssayQuestion> essayQuestionList;
    public ManageQuestion() {
        this.questionList = new ArrayList<Question>();
        this.essayQuestionList = new ArrayList<EssayQuestion>();
        this.multipleChoiceQuestionList = new ArrayList<MultipleChoiceQuestion>();
    }

    public void mockQuestionList(int repeat) {
        for (int i = 0; i < repeat; i++) {
            mockEssayQuestion();
            mockMultipleQuestion();
            setQuestionList();
            System.out.println("Size check " + i);
            System.out.println("Size list question: " + ManageQuestion.questionList.size() + " voi essay:" + ManageQuestion.essayQuestionList.size() + " va multi " + ManageQuestion.multipleChoiceQuestionList.size());

        }
        return;
    }

    public void mockEssayQuestion() {
        this.essayQuestionList.add(new EssayQuestion("how old are you", "i'm fine, thanks", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Bye Bye", "i'm eight", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("What is your name", "i'm truong", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("How are you", "i'm fine, thanks", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Nothing gonna change my love for you", "i'm chirstan", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Good morning", "moring good", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Good afternoon", "afternoon good", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("God bless you", "Dear sir", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Hello fron the out the side", "Hello everyone", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Everyday i love you", "nothing at all", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Avenger", "Caption america", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("What do you want", "i want more", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("This is a table", "thatle", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("how do you do", "i'm police", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));

    }

    public void mockMultipleQuestion() {
        HashMap<List<Choice>,List<Choice>> listOfListChoice = new HashMap<List<Choice>,List<Choice>>();
        listOfListChoice = createMockChoice(listOfListChoice,Arrays.asList("abc","bcd","def","jhi"));
        listOfListChoice=createMockChoice(listOfListChoice,Arrays.asList("xyz", "mnp", "jqk", "tuv"));
        Random rand = new Random();
        List<List<Choice>> keySet =new ArrayList<List<Choice>>(listOfListChoice.keySet());
        List<Choice> key=keySet.get(rand.nextInt(keySet.size()));
        List<Choice> val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("how old are you", key,val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("What time is it", key, val, 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Do you have launch", key, val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Hello from the out the side", key, val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("how old are you", key, val, 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("how do you like that", key, val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("let her go", key, val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Photography", key, val, 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Among us", key, val, 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Landmark", key, val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("international company", key, val, 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("solution architect", key, val, 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        return;
    }

    public HashMap<List<Choice>,List<Choice>> createMockChoice(HashMap<List<Choice>,List<Choice>> listOfListChoice,List<String> listOfChoice) {
        List<Choice> choice = new ArrayList<Choice>();
        List<Choice> answer = new ArrayList<Choice>();
        Random rand = new Random();
        List<String> listChoiceSample=new ArrayList<String>(listOfChoice);
        for(int i=0;i<listOfChoice.size();i++){
            System.out.println("checkk before size"+i+" laf "+listChoiceSample.size());
            String ans=listChoiceSample.get(rand.nextInt(listChoiceSample.size()));
            Choice ch=new Choice(i,ans);
            choice.add(ch);
            //random answer
            int int_random = rand.nextInt(100)+1; 
            if(int_random%2==0){
                answer.add(ch);
            }
            listChoiceSample.remove(ans);
            for(int j=0;j<listChoiceSample.size();j++){
                System.out.println("string"+listChoiceSample.get(j));
            }
            System.out.println("checkk before after"+i+" la "+listChoiceSample.size());

        }
        listOfListChoice.put(choice, answer);
        return listOfListChoice;
    }
//leve=5,chapter=4,subject 10000=>500 50
    public static List<Question> getShuffleQuestion(List<Question> questionList, int numberQuestion) {
        //nếu số câu hỏi mà lớn hơn tổng số questionList thì numberQuestion=questionList;
        numberQuestion = questionList.size() < numberQuestion ? questionList.size() : numberQuestion;
        List<Question> tmpQuestions = new ArrayList<Question>(questionList);
        List<Question> shuffleQuestions = new ArrayList<Question>();
        for (int i = 0; i < numberQuestion; i++) {
            int v = new Random().nextInt(tmpQuestions.size());
            shuffleQuestions.add(tmpQuestions.get(v));
            tmpQuestions.remove(tmpQuestions.get(v));
        }
        return shuffleQuestions;
    }

    public static void setQuestionList() {
        ManageQuestion.questionList = new ArrayList<Question>();
        ManageQuestion.questionList.addAll(ManageQuestion.essayQuestionList);
        ManageQuestion.questionList.addAll(ManageQuestion.multipleChoiceQuestionList);
        return;
    }

    ;

    public static List<Question> getQuestionList(int level, int chapter, Subject subject, String type) {
        List<Question> tmpQuestionList = new ArrayList<Question>();
        switch (type) {
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
        System.out.println("step1: question size after filter type "+type+ " : " + tmpQuestionList.size());
        tmpQuestionList = getQuestionListByLevel(tmpQuestionList, level);
        System.out.println("step2:  question size after filter level "+level+ " : "  + tmpQuestionList.size());

        tmpQuestionList = getQuestionListByChapter(tmpQuestionList, chapter);
        System.out.println("step3: question size after filter chapter "+chapter+ " : "  + tmpQuestionList.size());
        tmpQuestionList = getQuestionListBySubject(tmpQuestionList, subject);
        System.out.println("step4 question size after filter subject "+subject.MaHP+ " : "  + tmpQuestionList.size());
        return tmpQuestionList;
    }

    public static List<Question> getQuestionListByLevel(List<Question> questionList, int level) {
        List<Question> result = new ArrayList<Question>();
        result = questionList.stream().filter(quest -> quest.level == level).collect(Collectors.toList());
        return result;
    }

    public static List<Question> getQuestionListByChapter(List<Question> questionList, int chapter) {
        List<Question> result = new ArrayList<Question>();
        result = questionList.stream().filter(quest -> quest.chapter == chapter).collect(Collectors.toList());
        return result;
    }

    public static List<Question> getQuestionListBySubject(List<Question> questionList, Subject subject) {
        List<Question> result = new ArrayList<Question>();
        result = questionList.stream().filter(quest -> quest.subject == subject).collect(Collectors.toList());
        return result;
    }

    public void printQuestionList() {
        System.out.println("SubjectList" + this.questionList.size());
        if (questionList.size() > 0) {
            for (Question question : this.questionList) {
                question.printQuestion();
                System.out.println("======");
            }
        }
    }   
    public static void deleteQuestion(Question quest){
        if (quest instanceof EssayQuestion) {
            System.out.println("remove essay");
            ManageQuestion.essayQuestionList.remove(quest);
        } else if (quest instanceof MultipleChoiceQuestion) {
            System.out.println("remove multiple");
            ManageQuestion.multipleChoiceQuestionList.remove(quest);
        } else {
        }
        setQuestionList();
        return;
    }
    
    public static void addEssayQuestion(String question, String hint, int level, int chapter, Subject subject){
        ManageQuestion.essayQuestionList.add(new EssayQuestion(question, hint, level, chapter, subject));
        setQuestionList();
        return;
    }
    
    public static void addMultipleChoiceQuestion(String question, List<Choice> choice,  List<Choice> answer, int level, int chapter, Subject subject){
        ManageQuestion.multipleChoiceQuestionList.add(new MultipleChoiceQuestion(question, choice, answer, level, chapter, subject));
        setQuestionList();
        return;
    }
    
    public Question getQuestionById(int id){
        Question result =questionList.stream().filter(quest -> quest.id == id).findFirst().orElse(null);
        if(result!=null){
            System.out.println("delet");
        }
        return result;
    }
}
