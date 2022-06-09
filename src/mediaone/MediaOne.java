/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaone;

import Exam.Exam;
import Exam.Question;
import Exam.Subject;
import java.util.List;

/**
 *
 * @author truong
 */
public class MediaOne {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exam exam=new Exam();
        List<Question> quest=exam.getExam(5, 2, new Subject("oop","IT3110",10,"khong biet"));
        System.out.println("vao");
        for(int i=0;i<quest.size();i++){
            System.out.println("check"+quest.get(i).getQuestion());
        }
        System.out.println("//////");
        List<Question> quest2=exam.getExam(6, 2, new Subject("oop","IT3110",10,"khong biet"));
        System.out.println("vao");
        for(int i=0;i<quest2.size();i++){
            System.out.println("check"+quest2.get(i).getQuestion());
        }
    }
}
