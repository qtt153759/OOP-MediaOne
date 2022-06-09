package Exam;


import Exam.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author truong
 */
public class ManageSubject {
    List<Subject> subjectList;
    public ManageSubject(){
        subjectList=mockSubjectList();
    }
    public List<Subject> mockSubjectList(){
        List<Subject> subjectList=new ArrayList<Subject>();
        subjectList.add(new Subject("oop","IT3310",10,"cho biet"));
        subjectList.add(new Subject("ktlt","IT2110",10,"khong biet"));
        subjectList.add(new Subject("mmt","IT3550",10,"ai biet"));
        subjectList.add(new Subject("csdl","IT1310",10,"toi biet"));
        return subjectList;
    }
    public void addSubject(String name,String MaHp,int totalChapter,String description){
        subjectList.add(new Subject(name,MaHp,totalChapter,description));
        return;
    }
    public Subject getSubjectByCode(String MaHp){
        Subject result=this.subjectList.stream().filter( subject -> subject.MaHP==MaHp).findFirst().orElse(null);
        System.out.println("Mahp"+result.MaHP);
        return result;
    }
    public List<Subject> getSubjectList(){
        return subjectList;
    }
}
