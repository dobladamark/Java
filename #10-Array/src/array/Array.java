
package array;
import java.util.Scanner;
public class Array {


    public static void main(String[] args) {
       /* Array Syntax 
        dataType[] variableName = {element}
        dataType variableName[] = new dataType[index];
        int num[] = new int[5];        
        
       
       int num[] = new int [5];
       num[0] = 50;
       num[1] = 70;
       num[2] = 54;
       num[3] = 32;
       num[4] = 47;
       
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Num[%d] : %d \n", i, num[i] );
        }
        */
       
       Scanner inp = new Scanner(System.in);
       int ind;
        System.out.println("Enter number of inputs : ");
        ind = inp.nextInt();
        
        int num[] = new int[ind];
        
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Enter value for num[%d] : ",i);
            num[i] = inp.nextInt();
        }
        
        for (int a : num) {
            int x = 0;
            System.out.printf("The values are [%d] : %d\n",x, a);
            x++;
        }
        
        
    } 
    
}






