/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author truong
 */
public class EssayQuestion extends Question {
    String hint;
    public EssayQuestion(String question,String hint,int level,int chapter,Subject subject){
        super(question,level,chapter,subject);
        this.hint=hint;
       
    }
    
}
