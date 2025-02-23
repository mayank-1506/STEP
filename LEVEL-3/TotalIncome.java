import java.util.Scanner;

public class TotalIncome {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the salary from the user
        System.out.print("Enter salary (INR): ");
        double salary = scanner.nextDouble();

        // Get the bonus from the user
        System.out.print("Enter bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Output the results
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f\n", 
                          salary, bonus, totalIncome);

        // Close the scanner
        scanner.close();
    }
}
