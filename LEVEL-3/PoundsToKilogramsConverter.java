import java.util.Scanner;

public class PoundsToKilogramsConverter {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the weight in pounds from the user
        System.out.print("Enter the weight in pounds: ");
        double pounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double kilograms = pounds * 2.2;

        // Output the result
        System.out.printf("The weight in kilograms is %.2f kg.\n", kilograms);

        // Close the scanner
        scanner.close();
    }
}
