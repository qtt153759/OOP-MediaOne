/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subject;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author truong
 */
public class Subject {

    private static final AtomicInteger counter = new AtomicInteger();
    public int id;
    public String name;
    public String MaHP;
    public int totalChapter;
    public String description;

    public Subject(String name, String MaHP, int totalChapter, String description) {
        this.name = name;
        this.MaHP = MaHP;
        this.totalChapter = totalChapter;
        this.description = description;
        this.id = counter.incrementAndGet();

    }

    public void printSubject() {
        System.out.println("Subject " + this.id + ": " + this.name + " - " + this.MaHP + " - " + this.totalChapter + " - " + this.description);
    }

    public void setMaHP(String MaHP) throws Exception {
        this.MaHP = MaHP;
    }

    public void setName(String name) throws Exception {
        this.name = name;
    }

    public void setDescription(String description) throws Exception {
        this.description = description;
    }

    public void setTotalChapter(int totalChapter) throws Exception {
        this.totalChapter = totalChapter;
    }

    public void updateSubject(String name, String MaHP, int totalChapter, String description) throws Exception {
        try {
            System.out.println(name + MaHP + totalChapter + description);
            if (name == "" || name.length() <= 4) {
                throw new Exception("Subject name should has at least 4 character");
            }
            if (MaHP == "" || MaHP.length() <= 4) {
                throw new Exception("Subject subject's code should has at least 4 character");
            }
            if (totalChapter <= 1) {
                throw new Exception("Subject totalChapter should more than 1");
            }
            if (description == "" || description.length() <= 4) {
                throw new Exception("Subject description should has at least 4 character");
            }
            this.setName(name);
            this.setDescription(description);
            this.setMaHP(MaHP);
            this.setTotalChapter(totalChapter);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
