package repetition.pkgfor.loop;

import java.util.Scanner;

public class RepetitionForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int inp, num, sum = 0, ave = 0;
        System.out.println("Enter number of inputs : ");
        inp = input.nextInt();
        
        for (int i = 1; i <= inp; i++) {
            System.out.printf("Enter value for num%d", i);
            num = input.nextInt();
            sum = sum + num;
            
        }
        
        ave = sum / inp;
        System.out.println("The sum is : " + sum);
        System.out.printf("The average is : %d\n", ave);
        

    }

}
