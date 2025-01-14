/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fahrenheittocelcius;

import java.util.Scanner;

public class FahrenheitToCelcius {

   
    public static void main(String[] args) {
       float fah, cel;
    
    Scanner obj = new Scanner(System.in);
    
        System.out.printf("Enter fahrenheit value : ");
        fah = obj.nextFloat();
        
        cel = ((fah - 32) * 5) / 9;
        
        System.out.printf("The celcius is : %f\n",cel);        
        
    }
    
}
