/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg16.oop.inheritance;

/**
 *
 * @author Nyabi
 */
public class Educ extends Student{
    
    public Educ(String studName, int studGrade) {
        super(studName, studGrade);
    }
    
    public void displaySection() {
        System.out.println("Your section is educ");
    }
    
}
