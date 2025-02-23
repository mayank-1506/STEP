import java.util.Scanner;

public class RoundsInTriangularPark {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the lengths of the sides of the triangle from the user
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to be covered (5 kilometers or 5000 meters)
        double totalDistance = 5000;  // 5 km in meters

        // Calculate the number of rounds
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.\n", rounds);

        // Close the scanner
        scanner.close();
    }
}
