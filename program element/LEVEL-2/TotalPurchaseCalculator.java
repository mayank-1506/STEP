import java.util.Scanner;

public class TotalPurchaseCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the unit price and quantity from the user
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", 
                          totalPrice, quantity, unitPrice);

        // Close the scanner
        scanner.close();
    }
}
