import java.util.Scanner; // Take user input
import java.time.LocalDate; // Represent date (year, month, day)
import java.time.Period; // Calculate the difference between two dates
import java.time.temporal.ChronoUnit; // Calculate differences in specific units

public class App {
    public static void main(String[] args) {
        ageCalc(); 
    }

    public static void ageCalc() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthDate = null;
        LocalDate today = LocalDate.now();

        while (birthDate == null) { // loop until user enter valid input
            try {
                System.out.print("Enter your birthdate (YYYY-MM-DD): ");
                String input = scanner.nextLine();
                birthDate = LocalDate.parse(input);

                // If birth date is in the future
                if (birthDate.isAfter(today)) {
                    System.out.println("Error: Birthdate cannot be in the future. Please try again.");
                    birthDate = null; // Reset to keep loop running
                }
            } catch (Exception e) {
                System.out.println("Invalid format! Please enter date in YYYY-MM-DD format.");
            }
        }

        // calculate age and display
        Period age = Period.between(birthDate, today);
        System.out.println("\nYou are " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days old.");

        // calculating next birthday
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("Days left until your next birthday: " + daysUntilBirthday);

        scanner.close();
    }
}
