public class InterestManager {
  double intRate;
  double totalamount;
  public static void main(String[] args) {
      InterestManager calculate = new Interestmanager();
      for (int day = 1; day < 366; day+=10) {
      calculate.getInterestRate(day);
      
      }
    }
    public double getInterestRate(int day) {
      if ( day >= 1 && day <= 90) {
          intRate = 0.5;
      } else if (day >= 91 && day <= 180) {
          intRate = 1;
      } else if (day >= 180 && day <= 364) {
          intRate = 2;
      } else {
          intRate = 5.6;
      }
      System.out.println(1000000*intRate);
      return intRate;
    }
      public double calculateAmount(int day, long amount) {
        InterestManager calculate = new InterestManager();
        calculate.getInterestRate(day);
        totalamount = amount + (amount*intRate);
        return totalamount;
    }
}
