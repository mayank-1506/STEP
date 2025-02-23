import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output the result
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d\n", 
                          quotient, remainder, number1, number2);

        // Close the scanner
        scanner.close();
    }
}
