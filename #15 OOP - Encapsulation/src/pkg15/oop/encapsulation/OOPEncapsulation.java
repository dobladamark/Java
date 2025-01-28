
package pkg15.oop.encapsulation;

import java.util.Scanner;
public class OOPEncapsulation {

    
    public static void main(String[] args) {
        Student stud1 = new Student("Mark", 90, 2023);
        
        stud1.studentDetails();
        System.out.println("---------------------");
        System.out.println(stud1.getStudentName());
        System.out.println(stud1.getStudentGrade());
        System.out.println(stud1.getStudentYear());
        System.out.println("---------------------");
        stud1.setStudentName("John");
        System.out.println("New student name " + stud1.getStudentName());
        stud1.setStudentGrade(75);
        System.out.println("New student grade "+stud1.getStudentGrade());
        stud1.setStudentYear(1999);
        System.out.println("New student year "+stud1.getStudentYear());
    }
    
}
