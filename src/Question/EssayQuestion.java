/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

import Subject.Subject;
import java.util.List;

/**
 *
 * @author truong
 */
public class EssayQuestion extends Question {

    public String hint;

    public EssayQuestion(String question, String hint, int level, int chapter, Subject subject) {
        super(question, level, chapter, subject);
        this.hint = hint;

    }

    public String getHint() {
        return this.hint;
    }

    @Override
    public String getAnswer() {
        return this.hint; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAnswer(String hint) {
        this.hint = hint;
    }

}
