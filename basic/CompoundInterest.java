public class CompoundInterest {

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int principle = Integer.parseInt(args[0]);
    int interestRate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    double ci = getCi(principle, interestRate, period);

    String msg = "compound interest is " + ci;
    System.out.println(msg);
  }

  public static double getCi(int principle, int interestRate, int period) {
    double rate = interestRate / 100.0;
    return principle * Math.pow((1 + rate), period) - principle;
  }
}
