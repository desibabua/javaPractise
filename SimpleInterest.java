public class SimpleInterest {
  public static void main(String[] args) {
    int principal = Integer.parseInt(args[0]);
    int interestRate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    
    double simpleInterest = (principal * interestRate * period) / 100.0;

    System.out.println("Simple interest is " + simpleInterest);
  }
}
