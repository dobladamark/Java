package pkg16.oop.inheritance;
import java.util.Scanner;
public class OOPInheritance {

    

    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String studName = inp.next();
        
        System.out.print("Enter student grade : ");
        int studGrade = inp.nextInt();
        
        Bsit bsit1 = new Bsit(studName, studGrade);
        bsit1.displayStudName();
        bsit1.displayStudGrade();
        
        Educ educ1 = new Educ(studName, studGrade);
        educ1.displayStudName();
        educ1.displayStudGrade();
        bsit1.displaySection();
        educ1.displaySection();
        
        
    }
}
