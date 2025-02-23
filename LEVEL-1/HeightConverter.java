public class HeightConverter {
    public static void main(String[] args) {
        // Define the height in centimeters
        double heightInCm = 175; // Example height in cm, you can change it

        // Conversion constants
        double cmPerInch = 2.54; // 1 inch = 2.54 cm
        int inchesPerFoot = 12; // 1 foot = 12 inches

        // Convert height in cm to inches
        double heightInInches = heightInCm / cmPerInch;

        // Convert height in inches to feet and inches
        int feet = (int) (heightInInches / inchesPerFoot);
        int inches = (int) (heightInInches % inchesPerFoot);

        // Printing the results
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
