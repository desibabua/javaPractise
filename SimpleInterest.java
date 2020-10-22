public class SimpleInterest {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 3) {
      int principal = Integer.parseInt(args[0]);
      int interestRate = Integer.parseInt(args[1]);
      int period = Integer.parseInt(args[2]);
      double simpleInterest = (principal * interestRate * period) / 100.0;
      msg = "Simple interest is " + simpleInterest;
    }
    System.out.println(msg);
  }
}
