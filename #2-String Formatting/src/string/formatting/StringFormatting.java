/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.formatting;

public class StringFormatting {

    
    public static void main(String[] args) {
        //Display string value %s
        String fname = "MARK";
        String lname = "DOBLADA";
        System.out.printf("Last Name: %s \nFirst Name: %s", lname, fname);
        
        //Display integer value %d
        int grade = 100;
        System.out.printf("\nThe grade is: %d\n",grade);
        //Display Decimal value %f
        float number = 10.451212f;
        System.out.printf("The decimal value is %f\n", number);
        //display formatting with width %.4f
        System.out.printf("Formatting via width %.4f\n", number);  
        //display via precision %.2f
        System.out.printf("Formatting via precision %.2f\n", number);
        //Display from right with 20 characters space %20.4f
        System.out.printf("Format via right : %20.4f", number);
    }
           
    
}
