/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaone;

import Exam.Exam;
import Exam.ManageExam;
import Question.ManageQuestion;
import Subject.ManageSubject;
import Subject.Subject;

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
        Subject subject = manageSubject.getSubjectByCode("IT3310");
        //tạo list các question
        System.out.println("**********************************************************");
        System.out.println("Test mock question");
        ManageQuestion manageQuestion = new ManageQuestion();
        manageQuestion.mockQuestionList(3);
        manageQuestion.printQuestionList();
        System.out.println("Size list question: "+ManageQuestion.questionList.size()+" voi essay:"+ManageQuestion.essayQuestionList.size()+" va multi "+ManageQuestion.multipleChoiceQuestionList.size());

        //tạo list các bài thi tu dong
        System.out.println("**********************************************************");
        System.out.println("Test mock random exam");
        ManageExam manageExam = new ManageExam();
        manageExam.createMockExam(1);
        //tạo bài thi thủ cong
        System.out.println("**********************************************************");
        System.out.println("Test mock manual exam");
        manageExam.createExam("hanoi", 6, 2, subject, false);
        Exam exam = manageExam.getExamByName("hanoi");
        exam.addEssayQuestion("thu do", "thang long", 3, 2, subject);
        exam.addEssayQuestion("hochiming", "saigoi", 4, 1, subject);
        System.out.println("**********************************************************");
        System.out.println("Check size list");
        System.out.println("Size list subject: "+ManageSubject.subjectList.size());
        System.out.println("Size list question: "+ManageQuestion.questionList.size()+" voi essay:"+ManageQuestion.essayQuestionList.size()+" va multi "+ManageQuestion.multipleChoiceQuestionList.size());
        System.out.println("Size list exam: "+manageExam.examList.size());

    }
}
