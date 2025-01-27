
package pkg14.oop.constructor;

import java.util.Scanner;
public class OOPConstructor {
/*Constructor
- Method inside class
- Method with the same name of class
- Method that has no return type
- Method is use to initialize the value of the private member of class
    
    */
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = inp.next();
        System.out.println("Enter grade : ");
        int grade = inp.nextInt();
        Student stud1 = new Student(name, grade);
        
         stud1.displayName();
         stud1.displayGrade();
        
    }
    
}
