
package pkg11.multi.dimensional.array;

import java.util.Scanner;
public class MultiDimensionalArray {

    
    public static void main(String[] args) {
       /*
       Syntax 2d Array
        dataType[][] arrayName = new dataType[row][col];
        int[][] number = new int[2][3];
        
       // 2d Array
       /*
       int[][] bilang = new int[3][4];
       bilang[0][0] = 84;
       bilang[0][1] = 541;
       bilang[0][2] = 5442;
       bilang[0][3] = 4541;
       bilang[1][0] = 4411;
       bilang[1][1] = 4125;
       bilang[1][2] = 45452;
       bilang[1][3] = 1454444;
       bilang[2][0] = 6967;
       bilang[2][1] = 6968;
       bilang[2][2] = 6969;
       bilang[2][3] = 1458465;
       */
       /*
       int[][] bilang = {{1, 2, 3, 4, 5}, {84, 85, 855, 86, 87}};
       for (int row = 0; row < bilang.length; row++) {
           for (int col = 0; col < bilang[row].length; col++) {
               System.out.printf("Ito ang bilang[%d][%d] = %d\n", row, col, bilang[row][col]);
           }
       }
*/
       
       
       Scanner inp = new Scanner(System.in);
        System.out.println("Enter row value : ");
        int inpRow = inp.nextInt();
        System.out.println("Enter column value : ");
        int inpCol = inp.nextInt();
        
        int[][] number = new int[inpRow][inpCol];
        
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.printf("Enter value for number [%d][%d] : \n", i, j);
                number[i][j] = inp.nextInt();
            }
            
            
        
        }
        
               
       for (int row = 0; row < number.length; row++) {
           for (int col = 0; col < number[row].length; col++) {
               System.out.printf("Ito ang bilang[%d][%d] = %d\n", row, col, number[row][col]);
           }
    }
    
    
    }
    
    
}
