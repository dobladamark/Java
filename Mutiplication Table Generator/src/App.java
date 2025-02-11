import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");

        if (in.hasNextInt()) {
        int num = in.nextInt();
        System.out.println("Multiplication for "+num + ":");
        
        int i = 1;

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;


        }while(i <= 10);

        
        









        }else {
            System.out.println("Please input valid number");
        }



    }
}
