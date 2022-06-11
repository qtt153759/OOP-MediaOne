package Exam;


import Subject.ManageSubject;
import Subject.Subject;
import Exam.Exam;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author truong
 */
public class ManageExam {
    List<Exam> examList;
    List<Subject>subjectList;
    public ManageExam(){
        this.examList=new ArrayList<Exam>();
        this.subjectList=ManageSubject.subjectList;   
    }
//    public void testAndMock(){
//        this.manageSubject.mockSubjectList();
//        
//    }
    public void createExam(String name,int level,int chapter,Subject subject,boolean isShuffle){
        Exam exam=new Exam(name);
        if(isShuffle){
            exam.createShuffleExam(level, chapter,subject);
        }
        examList.add(exam);
        return;
    }
    public Exam getExamByName(String name){
        Exam result=this.examList.stream().filter( exam -> exam.name==name).findFirst().orElse(null);
        if(result==null){
            
        }
        return result;
    }
    public void printExamList(){
        for(Exam exam:examList){
            System.out.println("**********");
            exam.printExam();
        }
    }
}
