public class FeeDiscountCalculator {
  public static void main(String[] args) {
      // Predefined fee and discount percentage
      double fee = 125000; // Fee for the course
      double discountPercent = 10; // Discount percentage offered

      // Calculating the discount amount
      double discount = (fee * discountPercent) / 100;

      // Calculating the final fee after applying the discount
      double finalFee = fee - discount;

      // Printing the results
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
  }
}
