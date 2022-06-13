package Subject;

import Subject.Subject;
import java.lang.reflect.Array;
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

    public static List<Subject> subjectList;

    public ManageSubject() {
        this.subjectList = new ArrayList<Subject>();
    }

    public void mockSubjectList(int repeat) {
        for (int i = 0; i < repeat; i++) {
            this.subjectList.add(new Subject("oop", "IT3310", 10, "cho biet"));
            this.subjectList.add(new Subject("ktlt", "IT2110", 10, "khong biet"));
            this.subjectList.add(new Subject("mmt", "IT3550", 10, "ai biet"));
            this.subjectList.add(new Subject("csdl", "IT1310", 10, "toi biet"));
        }
        return;
    }

    public static void addSubject(String name, String MaHp, int totalChapter, String description) {
        ManageSubject.subjectList.add(new Subject(name, MaHp, totalChapter, description));
        return;
    }
    public static void deleteSubject(Subject subject) {
        ManageSubject.subjectList.remove(subject);
        return;
    }

    public static Subject getSubjectByCode(String MaHp) {
        Subject result = ManageSubject.subjectList.stream().filter(subject -> subject.MaHP == MaHp).findFirst().orElse(null);
        System.out.println("get subjectByCode Mahp" + result.MaHP);
        return result;
    }

    public List<Subject> getSubjectList() {
        return this.subjectList;
    }

    public void printSubjectList() {
        System.out.println("SubjectList" + this.subjectList.size());
        if (subjectList.size() > 0) {
            for (Subject subject : this.subjectList) {
                subject.printSubject();
                System.out.println("======");
            }
        }
    }
}
