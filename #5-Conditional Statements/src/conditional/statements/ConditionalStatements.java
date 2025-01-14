package conditional.statements;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        /*
    !!!NOTES!!!    
    Logical Conditions
    Less than: num1 < num2
    Less than or equal to: num1 <= num2
    Greater than: num1 > num2
    Greater than or equal to: num1 >= num2
    Equal to: num1 == num2
    Not Equal to: num1 !=num2
        
    
    Logical Operators 
    Logical AND
    && - Both statements must be TRUE
    Logical OR
    || - At least one statement is TRUE
    
    !!Syntax on if condition :!! 
    if (condition) {
        
     //blocks of code;
     }
        
     if else conditions
     if (condition) {
        
        //blocks of code;
     }
        else {
        //blocks of code;
     }
        
        //endss//
        
     !!laderise else if condition!! 
     if (condition) {
     //blocks of code;   
        
     }
        
     else if (condition) {
     //blocks of code;   
     }
        
     else if (condition) {
     //blocks of code;   
     }
        
     else {
        //blocks of code;
     }   
     //endss//
        
    !!! END OF NOTES !!!
         */

        Scanner in = new Scanner(System.in);
        // if condition
        // posibility to be true in many parts

        /*
        int grade;
        System.out.println("Enter your grade : ");
        grade = in.nextInt();
        
        if (grade >= 75) {
            System.out.println("You're Passed");
            
        }
        
        if (grade <= 74) {
            System.out.println("Your Failed");
        }
        
        if (grade == 90) {
            System.out.println("Great job! Your Grade is 90");
        }
         
        //if else condition 
        // either true or false
        int grade;
        System.out.print("Enter your grade : ");
        grade = in.nextInt();

        if (grade >= 75) {
            System.out.println("Your passed");
        } else {
            System.out.println("Failed");
        }

        */
        
        int grade;
        System.out.print("Enter grade : ");
        grade = in.nextInt();
        
        if (grade >= 1 && grade <= 10) {
            System.out.println("CICT");
        
        }
        
        else if (grade >=11 && grade <= 20){
            System.out.println("BSIT");
        
        }
        
        else if (grade >= 21 && grade <= 30) {
            System.out.println("HRM");
        
        }
        
        else if (grade >= 31 && grade <= 40) {
            System.out.println("BSCS");
        }
        
        else {
            System.out.println("Invalid Number");
            System.out.println("Please Try Again");
            System.out.println("Input only between 1 - 40");
        }
        
    }

}
