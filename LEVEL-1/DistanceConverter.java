import java.util.Scanner;

public class DistanceConverter {

    // Method to convert kilometers to miles
    public static void convertKilometersToMiles(double km) {
        // Conversion factor: 1 mile = 1.6 kilometers
        double miles = km / 1.6;
        
        // Display the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Input: distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Call the method to convert kilometers to miles and display the result
        convertKilometersToMiles(km);
        
        // Close the scanner
        input.close();
    }
}
