public class CompoundInterest {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 3) {
      int p = Integer.parseInt(args[0]);
      double r = Integer.parseInt(args[1]) / 100.0;
      int t = Integer.parseInt(args[2]);
      double finalAmount = p;

      while (t > 0) {
        finalAmount *= (1 + r);
        t--;
      }

      double ci = finalAmount - p;
      msg = "compound interest is " + ci;
    }
    System.out.println(msg);
  }
}
