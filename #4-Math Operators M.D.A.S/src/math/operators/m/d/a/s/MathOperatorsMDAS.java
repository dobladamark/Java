/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package math.operators.m.d.a.s;

import java.util.Scanner;

public class MathOperatorsMDAS {

    public static void main(String[] args) {
        //Multiplication * Division / Addition + Subtraction -
        
        //ADDITION +
        Scanner in = new Scanner(System.in);
        System.out.printf("ENTER FIRST NUMBER : ");
        int num1 = in.nextInt();
        System.out.printf("ENTER SECOND NUMBER : ");
        int num2 = in.nextInt();
        
        int sum = num1 + num2;
        int mul = num1 * num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        
        System.out.printf("The sum of two numbers is : %d\n", sum );
        System.out.printf("Multiplying of two numbers is : %d\n", mul );
        System.out.printf("Subtracting the two numbers is : %d\n", sub );
        System.out.printf("Dividing the two numbers is : %d\n", div );
        
        
        
        
        
    }

}
