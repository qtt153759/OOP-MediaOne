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
        System.out.println("Khởi tạo Manage Subject");

    }

    public void mockQuestionList(int repeat) {
        for (int i = 0; i < repeat; i++) {
            mockEssayQuestion(i);
            mockMultipleQuestion(i);
            setQuestionList();
        }
        System.out.println("Size list question: " + ManageQuestion.questionList.size() + " voi essay:" + ManageQuestion.essayQuestionList.size() + " va multi " + ManageQuestion.multipleChoiceQuestionList.size());
        return;
    }

    public void mockEssayQuestion(int i) {
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 1-" + i, "Câu trả lời tự luận 1", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 2-" + i, "Câu trả lời tự luận 2", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 3-" + i, "Câu trả lời tự luận 3", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 4-" + i, "Câu trả lời tự luận 4", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 5-" + i, "Câu trả lời tự luận 5", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 6-" + i, "Câu trả lời tự luận 6", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 7-" + i, "Câu trả lời tự luận 7", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 8-" + i, "Câu trả lời tự luận 8", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 9-" + i, "Câu trả lời tự luận 9", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 10-" + i, "Câu trả lời tự luận 10", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 11-" + i, "Câu trả lời tự luận 11", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 12-" + i, "Câu trả lời tự luận 12", 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 13-" + i, "Câu trả lời tự luận 13", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        this.essayQuestionList.add(new EssayQuestion("Câu tự luân 14-" + i, "Câu trả lời tự luận 14", 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));

    }

    public void mockMultipleQuestion(int i) {
        HashMap<List<Choice>, List<Choice>> listOfListChoice = new HashMap<List<Choice>, List<Choice>>();
        listOfListChoice = createMockChoice(listOfListChoice, Arrays.asList("Option 1", "Option 2", "Option 3", "Option 4"));
        listOfListChoice = createMockChoice(listOfListChoice, Arrays.asList("Option 5", "Option 6", "Option 7", "Option 8"));
        Random rand = new Random();
        List<List<Choice>> keySet = new ArrayList<List<Choice>>(listOfListChoice.keySet());
        List<Choice> key = keySet.get(rand.nextInt(keySet.size()));
        List<Choice> val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 1-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 2-" + i, key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 3-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 4-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 5-" + i, key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 6-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 7-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 8-" + i, key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 9-" + i, key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 10-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 11-" + i, key, val, 1, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        this.multipleChoiceQuestionList.add(new MultipleChoiceQuestion("Câu trắc nghiệm 12-" + i, key, val, 2, 3, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size()))));
        key = keySet.get(rand.nextInt(keySet.size()));
        val = listOfListChoice.get(key);
        return;
    }

    public HashMap<List<Choice>, List<Choice>> createMockChoice(HashMap<List<Choice>, List<Choice>> listOfListChoice, List<String> listOfChoice) {
        List<Choice> choice = new ArrayList<Choice>();
        List<Choice> answer = new ArrayList<Choice>();
        Random rand = new Random();
        List<String> listChoiceSample = new ArrayList<String>(listOfChoice);
        for (int i = 0; i < listOfChoice.size(); i++) {
            String ans = listChoiceSample.get(rand.nextInt(listChoiceSample.size()));
            Choice ch = new Choice(i, ans);
            choice.add(ch);
            //random answer
            int int_random = rand.nextInt(100) + 1;
            if (int_random % 2 == 0) {
                answer.add(ch);
            }
            listChoiceSample.remove(ans);
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
            case "BOTH":
                tmpQuestionList.addAll(ManageQuestion.essayQuestionList);
                tmpQuestionList.addAll(ManageQuestion.multipleChoiceQuestionList);
                break;
        }
        System.out.println("**************");
        System.out.println("step 1: question size after filter type " + type + " : " + tmpQuestionList.size());
        tmpQuestionList = getQuestionListByLevel(tmpQuestionList, level);
        System.out.println("step 2: question size after filter level " + level + " : " + tmpQuestionList.size());
        tmpQuestionList = getQuestionListByChapter(tmpQuestionList, chapter);
        System.out.println("step 3: question size after filter chapter " + chapter + " : " + tmpQuestionList.size());
        tmpQuestionList = getQuestionListBySubject(tmpQuestionList, subject);
        System.out.println("step 4: question size after filter subject " + subject.MaHP + " : " + tmpQuestionList.size());
        
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
        System.out.println("Size list question: " + this.questionList.size() + " voi essay:" + this.essayQuestionList.size() + " va multi " + this.multipleChoiceQuestionList.size());

    }

    public static void deleteQuestion(Question quest) {
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

    public static void addEssayQuestion(String question, String hint, int level, int chapter, Subject subject) {
        ManageQuestion.essayQuestionList.add(new EssayQuestion(question, hint, level, chapter, subject));
        setQuestionList();
        return;
    }

    public static void addMultipleChoiceQuestion(String question, List<Choice> choice, List<Choice> answer, int level, int chapter, Subject subject) {
        ManageQuestion.multipleChoiceQuestionList.add(new MultipleChoiceQuestion(question, choice, answer, level, chapter, subject));
        setQuestionList();
        return;
    }

    public Question getQuestionById(int id) {
        Question result = questionList.stream().filter(quest -> quest.id == id).findFirst().orElse(null);
        if (result != null) {
            System.out.println("delet");
        }
        return result;
    }
}
