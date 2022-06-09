/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author truong
 */
public abstract class Question implements IAnswer {
    String question;
    int  level ;
    int chapter;
    Subject subject;
    public Question(String question,int level,int chapter,Subject subject){
        this.question=question;
        this.chapter=chapter;
        this.level=level;
        this.subject=subject;
    }
    public abstract String getAnswer();
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
