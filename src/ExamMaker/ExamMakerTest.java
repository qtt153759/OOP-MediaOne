/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExamMaker;

import Exam.Exam;
import Exam.ManageExam;
import Question.Choice;
import Question.ManageQuestion;
import Question.Question;
import Subject.ManageSubject;
import static Subject.ManageSubject.getSubjectByCode;
import Subject.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author truong
 */
public class ExamMakerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***********************************************************");
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

        //tạo list các bài thi 
        System.out.println("**********************************************************");
        System.out.println("Test mock random exam");
        ManageExam manageExam = new ManageExam();
        //test bài thi random 
        testRandom(manageExam, manageSubject, manageQuestion);
//        //test bài thi thủ cong
        testManual(manageExam,manageSubject,manageQuestion);

    }

    public static void testRandom(ManageExam manageExam, ManageSubject manageSubject, ManageQuestion manageQuestion) {
        System.out.println("**********************************************************");
        System.out.println("test Tạo bài thi random ");
        manageExam.createMockExam(1);
        System.out.println("**********");
        System.out.println("test get exam thi cuoi ky soict");
        Exam exam = manageExam.getExamByName("Thi cuoi ky soict");
        exam.printExam();
        System.out.println("**********&&&&&&&&&&&&&&&&&&&*********************");

        System.out.println("test remove in manage question");
        manageQuestion.deleteQuestion(exam.questionList.get(2));
        exam.printExam();
    }

    public static void testManual(ManageExam manageExam, ManageSubject manageSubject, ManageQuestion manageQuestion) {
        System.out.println("**********************************************************");
        System.out.println("Test mock manual exam");
        
        Subject subject = manageSubject.getSubjectByCode("IT1310");
        subject.printSubject();
        //create mock choic
        HashMap<List<Choice>, List<Choice>> listOfListChoice = new HashMap<List<Choice>, List<Choice>>();
        listOfListChoice = manageQuestion.createMockChoice(listOfListChoice,Arrays.asList("abc", "bcd", "def", "jhi"));
        listOfListChoice = manageQuestion.createMockChoice(listOfListChoice,Arrays.asList("xyz", "mnp", "jqk", "tuv"));
        Random rand = new Random();
        List<List<Choice>> keySet = new ArrayList<List<Choice>>(listOfListChoice.keySet());
        List<Choice> key = keySet.get(rand.nextInt(keySet.size()));
        List<Choice> val = listOfListChoice.get(key);

        manageExam.createExam("ky thi thpt quoc gia", 2, 3, subject, false);
        Exam exam = manageExam.getExamByName("ky thi thpt quoc gia");
        exam.addEssayQuestion("Câu hỏi tự luận kỳ thi thpt qg1", "Gợi ý tự luận kỳ thi thpt qg1", 1, 3, subject);
        exam.addEssayQuestion("Câu hỏi tự luận kỳ thi thpt qg2", "Gợi ý tự luận kỳ thi thpt qg2", 2, 3, subject);

        exam.addMultipleChoiceQuestion("Cau hoi trac nghiem ky thi thpt qg1", key, val, 2, 3, subject);
        System.out.println("**********************************************************");
        System.out.println("Check size list");
        System.out.println("Size list exam: " + manageExam.examList.size());
        System.out.println("**********************************************************");
        exam.printExam();
        System.out.println("**********************************************************");
        System.out.println("Test remove question in exam");
        Question removeQuest = exam.questionList.get(1);
        exam.removeQuestion(removeQuest);
        exam.printExam();
        System.out.println("**********************************************************");
        System.out.println("Test remove  exam in manage exam");
        System.out.println("Exam list size before delete "+ manageExam.examList.size());
        manageExam.deleteExam(exam);
        System.out.println("Exam list size after delete "+ manageExam.examList.size());

        System.out.println("**********************************************************");
        Exam thptqg=manageExam.getExamByName("ky thi thpt quoc gia");
        if(thptqg==null){
            System.out.println("is deleted");
        }
    }
}
