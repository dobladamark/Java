import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rndm = new Random();

        int randomNum = rndm.nextInt(100) + 1;
        int userGuess = 0;
        int userAttempt = 0;

        while (userGuess != randomNum) {

            System.out.print("Enter guess : ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                userAttempt++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter between 1-100");

                } else if (userGuess < randomNum) {
                    System.out.println("Too low");
                } else if (userGuess > randomNum) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Congrats you've guessed the number");
                }

            } else {
                System.out.println("Please input valid number");
                in.next();

            }

        }
        System.out.println("You attempt " + userAttempt + " times");
        System.out.println("Number : "+randomNum);
    }
}
