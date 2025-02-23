public class TriangleAreaCalculator {

    // Method to convert height from inches to cm, feet, and inches
    public static double[] convertHeight(double heightInInches) {
        double heightInCm = heightInInches * 2.54;  // 1 inch = 2.54 cm
        double heightInFeet = heightInInches / 12;  // 1 foot = 12 inches
        double[] results = { heightInCm, heightInFeet, heightInInches };
        return results;
    }

    // Method to calculate the area of the triangle
    public static double[] calculateTriangleArea(double base, double height) {
        double areaInInches = 0.5 * base * height;  // Area in square inches
        double areaInCm = areaInInches * 6.4516;    // 1 square inch = 6.4516 square cm
        double[] area = { areaInInches, areaInCm };
        return area;
    }

    public static void main(String[] args) {
        // Hardcoded input for base and height of the triangle
        double base = 10.0;  // Example base in inches
        double height = 5.0; // Example height in inches

        // Calculate the area
        double[] area = calculateTriangleArea(base, height);
        double areaInInches = area[0];
        double areaInCm = area[1];

        // Convert height
        double[] heightConversions = convertHeight(height);
        double heightInCm = heightConversions[0];
        double heightInFeet = heightConversions[1];
        double heightInInchesOnly = heightConversions[2];

        // Output the results
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f\n",
                heightInCm, heightInFeet, heightInInchesOnly);
        System.out.printf("The area of the triangle is %.2f square inches or %.2f square centimeters.\n",
                areaInInches, areaInCm);
    }
}
