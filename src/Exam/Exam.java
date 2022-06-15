/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import Question.Choice;
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

    public String name;
    public int level;
    public int chapter;
    public Essay essay;
    public MultipleChoice multipleChoice;
    public List<Question> questionList;
    public Subject subject;

    public Exam(String name) {
        this.name = name;
        this.essay = new Essay();
        this.multipleChoice = new MultipleChoice();
        this.questionList = new ArrayList<Question>();
    }

    public List<Question> createShuffleExam(int total,int level, int chapter, Subject subject,int mulipleChoiceRatio) {
        
        this.level = level;
        this.chapter = chapter;
        this.subject = subject;
        //copy questionList ra 1 cái list khác, không trỏ trực tiếp địa chỉ essayList=ManageQuestion.getQuestionList(level,chapter,subjec,ESSAY) như thế này
        //để tránh trường hợp khi remove câu hỏi trong Exam thì mất question trong ManageQuestion hoặc khi delete question trong  
        List<EssayQuestion> essayList = new ArrayList<EssayQuestion>((List) ManageQuestion.getQuestionList(level, chapter, subject, "ESSAY"));
        List<MultipleChoiceQuestion> multipleChoiceList = new ArrayList<MultipleChoiceQuestion>((List) ManageQuestion.getQuestionList(level, chapter, subject, "MULTIPLE_CHOICE"));
        essayList = ManageQuestion.getShuffleQuestion((List) essayList, total-(total*mulipleChoiceRatio)/100);
        multipleChoiceList = ManageQuestion.getShuffleQuestion((List) multipleChoiceList, (total*mulipleChoiceRatio)/100);
        this.essay.setEssayQuestion(essayList);
        this.multipleChoice.setMultipleChoiceQuestion(multipleChoiceList);
        setQuestionList();
        System.out.println("Exam Size list question: " + this.questionList.size() + " voi essay:" + this.essay.essayQuestion.size() + " va multi " + this.multipleChoice.multipleChoiceQuestion.size());
        return this.questionList;
    }

    public void addEssayQuestion(String question, String hint, int level, int chapter, Subject subject) {
        this.essay.addEssayQuestion(question, hint, level, chapter, subject);
        setQuestionList();
    }

    public void addMultipleChoiceQuestion(String question, List<Choice> choice, List<Choice> answer, int level, int chapter, Subject subject) {
        this.multipleChoice.addMultipleChoiceQuestion(question, choice, answer, level, chapter, subject);
        setQuestionList();
    }

    public void setQuestionList() {
        this.questionList = new ArrayList<Question>();
        this.questionList.addAll(this.essay.essayQuestion);
        this.questionList.addAll(this.multipleChoice.multipleChoiceQuestion);
    }

    public void printExam() {
        System.out.println("exam-name: " + this.name + " level: " + this.level + " chapter: " + this.chapter + " size" + this.questionList.size());
        for (Question quest : this.questionList) {
            quest.printQuestion();
        }
    }

    public void removeQuestion(Question quest) {
//        questionList.remove(quest);
        if (quest instanceof EssayQuestion) {
            System.out.println("remove essay");
        } else if (quest instanceof MultipleChoiceQuestion) {
            System.out.println("remove multiple");
            this.multipleChoice.multipleChoiceQuestion.remove(quest);
        } else {
            this.essay.essayQuestion.remove(quest);
        }
        setQuestionList();
        return;
    }
}
