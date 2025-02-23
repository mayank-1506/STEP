import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the temperature in Celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Output the result
        System.out.printf("The %.2f Celsius is %.2f Fahrenheit.\n", celsius, fahrenheitResult);

        // Close the scanner
        scanner.close();
    }
}
