import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get values for a, b, and c from the user
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Perform the double operations considering operator precedence
        double result1 = a + b * c;   // a + (b * c)
        double result2 = a * b + c;   // (a * b) + c
        double result3 = c + a / b;   // c + (a / b)
        double result4 = a % b + c;   // (a % b) + c (Note: % operator works with doubles as well)

        // Output the results
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, and %.2f\n", 
                          result1, result2, result3, result4);

        // Close the scanner
        scanner.close();
    }
}
