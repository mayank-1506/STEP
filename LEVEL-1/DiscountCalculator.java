public class DiscountCalculator {
  public static void main(String[] args) {
      // Assigning the fee and discount percent
      double fee = 125000;
      double discountPercent = 10;

      // Calculating the discount amount
      double discount = (fee * discountPercent) / 100;

      // Calculating the final fee after applying the discount
      double finalFee = fee - discount;

      // Printing the results
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
  }
}
