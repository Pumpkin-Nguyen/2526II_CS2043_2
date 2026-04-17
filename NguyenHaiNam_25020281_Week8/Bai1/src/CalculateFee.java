public class CalculateFee {
  public double calculateFee(String type, int hours, double rate, boolean isMember) {
    double baseFee = hours * rate;
    double membershipDiscountRate = 0.9;
    if (isMember)
      baseFee = baseFee * membershipDiscountRate;
    return baseFee;
  }
}