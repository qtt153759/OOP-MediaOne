/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

import Subject.Subject;

/**
 *
 * @author truong
 */
public abstract class Question implements IQuestion {
    public String question;
    public int  level ;
    public int chapter;
    public Subject subject;
    public Question(String question,int level,int chapter,Subject subject){
        this.question=question;
        this.chapter=chapter;
        this.level=level;
        this.subject=subject;
    }
    public abstract String getAnswer();
    @Override
    public void printQuestion(){
        System.out.println("Question "+" : "+"( level: "+ this.level+" ,chapter: "+this.chapter+" ) "+ this.question);
        this.getAnswer();
        System.out.println(this.subject.MaHP);
    };
    public String getQuestion()
    {
        return this.question;
    };
    public int getLevel()
    {
        return this.level;
    };
    public int getChapter()
    {
        return this.chapter;
    };
}
