import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get birth date input
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter your birth month: ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        // Calculate age
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        scanner.close();
    }
}
