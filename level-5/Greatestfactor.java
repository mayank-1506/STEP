import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;

        // Loop from number - 1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Break at the first (largest) factor found
            }
        }

        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        scanner.close();
    }
}