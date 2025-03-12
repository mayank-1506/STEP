import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get the number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets and the remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the results
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d.\n", 
                          chocolatesPerChild, remainingChocolates);

        // Close the scanner
        scanner.close();
    }
}
