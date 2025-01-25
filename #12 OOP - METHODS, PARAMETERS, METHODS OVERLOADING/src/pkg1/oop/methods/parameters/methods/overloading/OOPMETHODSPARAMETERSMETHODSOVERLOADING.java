package pkg1.oop.methods.parameters.methods.overloading;

import java.util.Scanner;

public class OOPMETHODSPARAMETERSMETHODSOVERLOADING {

    /*
        ''Methods'' 
        - Reuse the code
        ''Syntax''
        - inside the class yet outside the other methods
         accessModifier returnType methodName(parameter"optional") {
    
    }
    
    access modifier
    - public, private, protected, none access
    
    return type
    - data types "int, double, string, void"
    
    methods
    - same rule of naming a variable
    
    parameter
    - to pass a value from one methods to another
    
    methods overloading
    - methods with same name but with different parameter
     */
    
    
    
    //displayName();
    //displayName();
    //displayGrade();
    
    
    /*PARAMETERS EXAMPLE
    int temp;
    Scanner inp = new Scanner(System.in);
     System.out.println("Enter temperature : ");
     temp = inp.nextInt();
     temperature(temp);
    }
    
    
    
    public static void temperature(int temp) {
        System.out.println("temp is " + temp);
    }    
    //PARAMETER EXAMPLE ENDS HERE
       
    
    
    public static void displayName(){
        System.out.println("Enter your name : ");
        Scanner inp = new Scanner(System.in);
        String name = inp.next();
        System.out.println("Your inputed name is "+name);
}
    
    public static void displayGrade(){
       Scanner inp = new Scanner(System.in);
        System.out.println("Enter your grade : ");
        int grade = inp.nextInt();
        System.out.println("Your grade is : "+ grade);
    }

    */
 //METHODS OVERLOADING EXAMPLE   
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
    System.out.println("Input car name : ");
String name = inp.next();    
    System.out.println("Input car color : ");
    String color = inp.next();
    System.out.println("Enter price");
    int price = inp.nextInt();
carDetails(price);

}

public static void carDetails(String name, String color) {
    System.out.println("The name of the car is "+ name);
    System.out.println("Color of car is : " + color);
}

public static void carDetails(String name) {
    System.out.println("The name of the car is "+ name);
    
}

public static void carDetails(int price) {
    System.out.println("Price is "+ price);
    
}

}
