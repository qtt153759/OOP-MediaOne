/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

import Subject.Subject;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author truong
 */
public abstract class Question implements IQuestion {
    // cách get Id tự tăng 

    private static final AtomicInteger counter = new AtomicInteger();
    public int id;
    public String question;
    public int level;
    public int chapter;
    public Subject subject;

    public Question(String question, int level, int chapter, Subject subject) {
        this.question = question;
        this.chapter = chapter;
        this.level = level;
        this.subject = subject;
        this.id = counter.incrementAndGet();
    }

    public void setAnswer() {

    }

    ;
    @Override
    public void printQuestion() {
        System.out.println("(id: "+id +",level: " + this.level + " ,chapter: " + this.chapter + " ,subject: " + this.subject.MaHP + " ) " + this.question);
        System.out.println(this.getAnswer());
    }

    ;
    public String getQuestion() {
        return this.question;
    }

    ;
    public int getLevel() {
        return this.level;
    }

    ;
    public int getChapter() {
        return this.chapter;
    }
;
}
