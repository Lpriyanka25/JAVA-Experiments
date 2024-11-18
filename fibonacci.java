import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + terms + " terms:");

            // Initialize first two terms
            int first = 0, second = 1;

            for (int i = 1; i <= terms; i++) {
                System.out.print(first + " ");

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
