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
        ManageSubject manageSubject=new ManageSubject();
        manageSubject.mockSubjectList();
        manageSubject.printSubjectList();
        Subject subject=manageSubject.getSubjectByCode("IT3310");
        ManageQuestion manageQuestion=new ManageQuestion();
        manageQuestion.mockQuestionList();
        manageQuestion.printQuestionList();
        ManageExam manageExam=new ManageExam();
        manageExam.createExam("hanoi", 5, 2,subject, true);
        Exam exam=manageExam.getExamByName("hanoi");
        if(exam!=null){
        exam.printExam();
        }else{
            System.out.println("null");
        }
        
    }
}
