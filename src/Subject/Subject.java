/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subject;

/**
 *
 * @author truong
 */
public class Subject {
    public String name;
    public String MaHP;
    public int totalChapter;
    String description;
    public Subject(String name,String MaHP, int totalChapter,String description){
        this.name=name;
        this.MaHP=MaHP;
        this.totalChapter=totalChapter;
        this.description=description;
    }
    public void printSubject(){
        System.out.println("Subject: "+this.name+" - "+this.MaHP+" - "+this.totalChapter+" - "+this.description);
    }
}
