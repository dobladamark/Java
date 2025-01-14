
package repetition.pkgwhile.and.pkgdo.pkgwhile.loop;

import java.util.Scanner;
public class RepetitionWhileAndDoWhileLoop {

    
    public static void main(String[] args) {
       //While Loop
       //Repetitive instruction
       //Create a program that will print value from 1 -> 10
       
       //LOOPING
       //-Counter
       //-Condition 
       //Increment or decrement -- incre++ 1 2 3 4 5
       //                          decre-- 5 4 3 2 1
       /* Syntax
       
       //**WHILE**
       counter;
       while(condition) {
       increment/decrement;
       statements;
       
       
       //DO WHILE
       
       counter;
       do {
       incre/decre;
       statements;
       
       }while(condition);
       }
       
       */
      
       /*
       int counter = 15;
       while (counter < 10) {
           counter++; //count = count + 
           System.out.println(counter);
           
       }
       
        System.out.println("DO WHILE");
       int counter2 = 15;
        do {
            counter2++; //count = count + 
           System.out.println(counter2);
        } while (counter2 <= 30);
      */
       
       //While
       Scanner in = new Scanner(System.in);
       int num, input, sum = 0;
       int counter = 1;
       
        System.out.printf("Enter number of inputs : ");
        input = in.nextInt();
        
        while (counter <= input) {
            System.out.print("Enter value for num " + counter + " : ");
            num = in.nextInt();
            sum = sum + num;
            counter++;
        }
        
        System.out.println("The sum of integers is  " + sum);
        
    }
    
    
    
}
