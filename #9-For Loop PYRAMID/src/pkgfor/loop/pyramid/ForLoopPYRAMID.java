
package pkgfor.loop.pyramid;
import java.util.Scanner;

public class ForLoopPYRAMID {

  
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


