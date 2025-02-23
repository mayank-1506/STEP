import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the distance in feet from the user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion factors
        double feetInYard = 3;     // 1 yard = 3 feet
        double yardsInMile = 1760; // 1 mile = 1760 yards

        // Calculate the distance in yards and miles
        double distanceInYards = distanceInFeet / feetInYard;
        double distanceInMiles = distanceInYards / yardsInMile;

        // Output the results
        System.out.printf("The distance is %.2f yards or %.2f miles.\n", distanceInYards, distanceInMiles);

        // Close the scanner
        scanner.close();
    }
}
