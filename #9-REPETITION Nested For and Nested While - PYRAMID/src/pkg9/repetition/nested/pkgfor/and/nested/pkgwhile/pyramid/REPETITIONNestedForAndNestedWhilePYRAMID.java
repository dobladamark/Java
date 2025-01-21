package pkg9.repetition.nested.pkgfor.and.nested.pkgwhile.pyramid;

import java.util.Scanner;

public class REPETITIONNestedForAndNestedWhilePYRAMID {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        /* FOR PYRAMID
    int row;
        System.out.print("Enter row:");
        row = inp.nextInt();
        
        for (int x = 1; x <= row; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
         */
        /*
        //WHILE PYRAMID 
        int row;
        System.out.println("Enter rows : ");
        row = inp.nextInt();
        
        int x = 1;
        while (x <= row) {
            int i = 1;
            
            
            while (i <= x) {
                System.out.print(i + " ");
                i++;
                
            }
            
            System.out.println(" ");
            x++;
        }*/
        //WHILE PYRAMID ENDS//
        /*
        int row, number = 1;
        System.out.println("Enter row : ");
        row = inp.nextInt();
        for (int x = 1; x <= row; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println("");
        }
*/
         
         // LETTERS PYRAMID       
         for (char i = 'A'; i <= 'E'; i++) {
            
             
            for (int j = 1; j <= i - 'A' + 1; j++) {
                System.out.print(i + " ");
            }
           
            System.out.println();
        }
         
         
        
    }
}

