import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the principal value from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Get the rate of interest from the user
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Get the time period from the user
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f years.\n", 
                          simpleInterest, principal, rate, time);

        // Close the scanner
        scanner.close();
    }
}
