import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Swap the two numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped values
        System.out.printf("The swapped numbers are %d and %d\n", number1, number2);

        // Close the scanner
        scanner.close();
    }
}
