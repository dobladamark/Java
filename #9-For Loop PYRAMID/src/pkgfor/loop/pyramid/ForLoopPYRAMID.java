/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor.loop.pyramid;
import java.util.Scanner;
/**
 *
 * @author Nyabi
 */
public class ForLoopPYRAMID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int row;
        System.out.print("Enter number of rows : ");
        row = input.nextInt();
        
        for (int x = 1; x <= row; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            
            System.out.println(" ");
        }
    }
    
}


