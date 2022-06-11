package Exam;

import Subject.ManageSubject;
import Subject.Subject;
import Exam.Exam;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author truong
 */
public class ManageExam {

    public List<Exam> examList;
    public List<Subject> subjectList;

    public ManageExam() {
        this.examList = new ArrayList<Exam>();
        this.subjectList = ManageSubject.subjectList;
    }
//    public void testAndMock(){
//        this.manageSubject.mockSubjectList();
//        
//    }

    public void createExam(String name, int level, int chapter, Subject subject, boolean isShuffle) {
        Exam exam = new Exam(name);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("create " + name + " " + level + " " + " " + chapter + " " + subject.name + " " + isShuffle);
        if (isShuffle) {
            exam.createShuffleExam(level, chapter, subject);
        }
        examList.add(exam);
        return;
    }

    public Exam getExamByName(String name) {
        Exam result = this.examList.stream().filter(exam -> exam.name == name).findFirst().orElse(null);
        if (result == null) {
        }
        return result;
    }

    public void printExamList() {
        for (Exam exam : examList) {
            System.out.println("**********");
            exam.printExam();
        }
    }

    public void createMockExam(int repeat) {
        for (int i = 0; i < repeat; i++) {
            createExam("Thi giua ky attt", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size())), true);
            createExam("Thi cuoi ky oop", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size())), true);
            createExam("Thi giua ky csdl", 6, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size())), true);
            createExam("Thi cuoi ky soict", 5, 2, ManageSubject.subjectList.get(new Random().nextInt(ManageSubject.subjectList.size())), true);
        }
        return;
    }
}
