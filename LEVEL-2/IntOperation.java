import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get values for a, b, and c from the user
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform the integer operations considering operator precedence
        int result1 = a + b * c;   // a + (b * c)
        int result2 = a * b + c;   // (a * b) + c
        int result3 = c + a / b;   // c + (a / b)
        int result4 = a % b + c;   // (a % b) + c

        // Output the results
        System.out.printf("The results of Int Operations are: %d, %d, %d, and %d\n", 
                          result1, result2, result3, result4);

        // Close the scanner
        scanner.close();
    }
}
