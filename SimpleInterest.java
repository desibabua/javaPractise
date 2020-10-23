public class SimpleInterest {

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int principal = Integer.parseInt(args[0]);
    int interestRate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    double simpleInterest = getSI(principal, interestRate, period);

    String msg = "Simple interest is " + simpleInterest;
    System.out.println(msg);
  }

  public static double getSI(int principal, int interestRate, int period) {
    return (principal * interestRate * period) / 100.0;
  }
}
