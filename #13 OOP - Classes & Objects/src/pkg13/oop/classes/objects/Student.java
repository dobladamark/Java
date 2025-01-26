
package pkg13.oop.classes.objects;

import java.util.Scanner;
public class Student {
    // object and members
    public void displayName() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = inp.next();
        System.out.println("Your name is "+ name );
       
    }
    
    public void displayGrade() {
        System.out.println("Your grade is 99");
    
    }
}
