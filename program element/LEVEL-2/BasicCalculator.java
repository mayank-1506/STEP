public class BasicCalculator {
    public static void main(String[] args) {
        // Predefined floating-point numbers (you can modify these values)
        double number1 = 10.5; // First number
        double number2 = 5.0;  // Second number

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0.0;

        // Check for division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Printing the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is: ");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + (number2 != 0 ? division : "undefined"));
    }
}
