package Question;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author truong
 */
public class Choice {

    int order;
    String answer;

    public Choice(int order, String answer) {
        this.order = order;
        this.answer = answer;
    }

    public String getChoice() {
        //dịch chuyển chữ A theo bộ mã ascii 
        char alphabet = 'A';
        alphabet += order;
        return alphabet + ": " + answer + " ... ";
    }
}
