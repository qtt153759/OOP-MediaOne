package Exam;


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
    ManageSubject manageSubject;
    public ManageExam(){
        this.examList=new ArrayList<Exam>();
        this.manageSubject=new ManageSubject();   
    }
    public void testAndMock(){
        this.manageSubject.mockSubjectList();
    }
}
