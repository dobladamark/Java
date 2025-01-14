/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathfunction;


public class MathFunction {

    
    public static void main(String[] args) {
       /*Math Functions
        Math.abs() = absolute value
        Math.max() =  maximum value
        Math.min() =  minimum value
        Math.round()= round off
        Math.sqrt() = square root
        Math.pow()= power
        Math.exp()= exponent
        */
       
       double num0 = 60;
       double num1 = 9;
       //Maximum value Math.max(variableName, variableName);
        System.out.println("The Maximum value is : " + Math.max(num0, num1));
        
        //Minimum value Math.min(variableName, variableName);
        System.out.println("The minimum value is : " + Math.min(num0, num1));
        
       //Square root Math.sqrt(variableName);
        System.out.println("The square root of : " + num1 + " is : "+ Math.sqrt(num1));
        
        double sqrNum = Math.sqrt(num1);
        System.out.println("The square root is : "+ sqrNum);
        
        //Power Math.pow(variableName, variableName);
        System.out.println("The power of num0 and num1 is " + Math.pow(num0, num1));
        
        //Exponent Math.exp(variableName);
        System.out.println("The exponent of " + num0 +" is "+ Math.exp(num0));
        
        
        
       double num2 = 123;
       double num3 = 26;
       
        System.out.println("Maximum value : "+ Math.max(num2, num3));
        System.out.println("Minimum value : "+ Math.min(num2, num3));
        System.out.println("Square root of " + num3 + " is " + Math.sqrt(num3));
        System.out.println("Exponent of " + num3 + " is " +Math.exp(num3));
    }
    
}
