import java.util.Scanner;

public class TravelDetails {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get user inputs for the travel details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the name of your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the name of your via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the name of your final destination city: ");
        String toCity = scanner.nextLine();

        // Get user inputs for distances in miles
        System.out.print("Enter the distance in miles from " + fromCity + " to " + viaCity + ": ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance in miles from " + viaCity + " to " + toCity + ": ");
        double viaToFinalCity = scanner.nextDouble();

        // Get user input for time taken (in hours)
        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Output the results
        System.out.printf("Traveler: %s\n", name);
        System.out.printf("Traveling from: %s to %s via %s\n", fromCity, toCity, viaCity);
        System.out.printf("Total distance traveled: %.2f miles\n", totalDistance);
        System.out.printf("Average speed: %.2f miles per hour\n", averageSpeed);

        // Close the scanner
        scanner.close();
    }
}
