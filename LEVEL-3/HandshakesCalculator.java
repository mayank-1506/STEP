import java.util.Scanner;

public class HandshakesCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result
        System.out.printf("The maximum number of handshakes among %d students is %d.\n", numberOfStudents, handshakes);

        // Close the scanner
        scanner.close();
    }
}
