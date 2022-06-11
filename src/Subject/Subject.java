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
    String description;

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
}
