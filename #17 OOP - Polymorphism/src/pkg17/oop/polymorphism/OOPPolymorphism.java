package pkg17.oop.polymorphism;
import java.util.Scanner;
public class OOPPolymorphism {

    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    Student stud1 = new Student();
    stud1.studentSection();
    
    Bsit bsit1 = new Bsit();
    bsit1.studentSection();
    
    Educ educ1 = new Educ();
    educ1.studentSection();
    
    Student stud2 = new Bsit();
    stud2.studentSection();
    
    Student stud3 = new Educ();
    stud3.studentSection();
    }
    
    

}
