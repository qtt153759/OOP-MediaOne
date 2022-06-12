/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaone;

import Exam.Exam;
import Exam.ManageExam;
import Question.Choice;
import Question.ManageQuestion;
import Question.Question;
import Subject.ManageSubject;
import Subject.Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author truong
 */
public class MediaOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tạo list các subject
        System.out.println("Test mock subject");
        ManageSubject manageSubject = new ManageSubject();
        manageSubject.mockSubjectList(1);
        manageSubject.printSubjectList();
        //tạo list các question
        System.out.println("**********************************************************");
        System.out.println("Test mock question");
        ManageQuestion manageQuestion = new ManageQuestion();
        manageQuestion.mockQuestionList(3);
        manageQuestion.printQuestionList();
        System.out.println("Size list question: " + ManageQuestion.questionList.size() + " voi essay:" + ManageQuestion.essayQuestionList.size() + " va multi " + ManageQuestion.multipleChoiceQuestionList.size());

        //tạo list các bài thi tu dong
        System.out.println("**********************************************************");
        System.out.println("Test mock random exam");
        ManageExam manageExam = new ManageExam();
        //test bài thi random 
        testRandom(manageExam, manageSubject, manageQuestion);
        //test bài thi thủ cong
//        testManual(manageExam,manageSubject,manageQuestion);

    }

    public static void testRandom(ManageExam manageExam, ManageSubject manageSubject, ManageQuestion manageQuestion) {
        System.out.println("**********************************************************");
        System.out.println("test random");
        manageExam.createMockExam(1);
        System.out.println("****145924350723510579213***********************");
        System.out.println("check single exam");
        Exam exam = manageExam.getExamByName("Thi cuoi ky soict");
        exam.printExam();
                System.out.println("**********&&&&&&&&&&&&&&&&&&&*********************");

        System.out.println("test remove");
        manageQuestion.deleteQuestion(exam.questionList.get(5));
        exam.printExam();
    }

    public static void testManual(ManageExam manageExam, ManageSubject manageSubject, ManageQuestion manageQuestion) {
        System.out.println("**********************************************************");
        System.out.println("Test mock manual exam");
        Subject subject = manageSubject.getSubjectByCode("IT3310");
        //create mock choic
        HashMap<List<Choice>, List<Choice>> listOfListChoice = new HashMap<List<Choice>, List<Choice>>();
        listOfListChoice = manageQuestion.createMockChoice(listOfListChoice, "abc", "bcd", "def", "jhi");
        listOfListChoice = manageQuestion.createMockChoice(listOfListChoice, "xyz", "mnp", "jqk", "tuv");
        Random rand = new Random();
        List<List<Choice>> keySet = new ArrayList<List<Choice>>(listOfListChoice.keySet());
        List<Choice> key = keySet.get(rand.nextInt(keySet.size()));
        List<Choice> val = listOfListChoice.get(key);

        manageExam.createExam("hanoi", 6, 2, subject, false);
        Exam exam = manageExam.getExamByName("hanoi");
        exam.addEssayQuestion("thu do", "thang long", 3, 2, subject);
        exam.addEssayQuestion("hochiming", "saigoi", 4, 1, subject);

        exam.addMultipleChoiceQuestion("danang", key, val, 0, 0, subject);
        System.out.println("**********************************************************");
        System.out.println("Check size list");
        System.out.println("Size list subject: " + ManageSubject.subjectList.size());
        System.out.println("Size list question: " + ManageQuestion.questionList.size() + " voi essay:" + ManageQuestion.essayQuestionList.size() + " va multi " + ManageQuestion.multipleChoiceQuestionList.size());
        System.out.println("Size list exam: " + manageExam.examList.size());
        System.out.println("**********************************************************");
        System.out.println("exam");
        exam.printExam();
        System.out.println(")))))))))))))))))))))))))");
        Exam deletedExam = manageExam.getExamByName("hanoi");
        manageExam.deleteExam(deletedExam);
        Question removeQuest = exam.questionList.get(2);
        exam.removeQuestion(removeQuest);
        exam.printExam();
//        System.out.println("(((((((((((((((((");
//        Exam hanoi=manageExam.getExamByName("hanoi");
//        if(hanoi==null){
//            System.out.println("is deleted");
//        }
    }
}
