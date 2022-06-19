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
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 1", "Câu trả lời tự luận 1", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 2", "Câu trả lời tự luận 2", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 3", "Câu trả lời tự luận 3", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 4", "Câu trả lời tự luận 4", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 5", "Câu trả lời tự luận 5", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 6", "Câu trả lời tự luận 6", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 7", "Câu trả lời tự luận 7", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 8", "Câu trả lời tự luận 8", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 9", "Câu trả lời tự luận 9", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 10", "Câu trả lời tự luận 10", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 11", "Câu trả lời tự luận 11", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 12", "Câu trả lời tự luận 12", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 13", "Câu trả lời tự luận 13", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 14", "Câu trả lời tự luận 14", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));

    }

    public void mockMultipleQuestion() {
        HashMap<List<Choice>,List<Choice>> listOfListChoice = new HashMap<List<Choice>,List<Choice>>();
        listOfListChoice = createMockChoice(listOfListChoice,Arrays.asList("abc","bcd","def","jhi"));
        listOfListChoice=createMockChoice(listOfListChoice,Arrays.asList("xyz", "mnp", "jqk", "tuv"));
        Random rand = new Random();
        List<List<Choice>> keySet =new ArrayList<List<Choice>>(listOfListChoice.keySet());
        List<Choice> key=keySet.get(rand.nextInt(keySet.size()));
        List<Choice> val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 1", key,val, 1, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 2", key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 3", key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 4", key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 5", key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 6", key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 7", key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 8", key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 9", key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 10", key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 11", key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key=keySet.get(rand.nextInt(keySet.size()));
        val=listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 12", key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
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
        System.out.println("Number quest"+numberQuestion);
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
            case "BOTH":
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
