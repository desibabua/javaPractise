public class Fibonacci {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int noOfTerms = Integer.parseInt((args[0]));
    for (int term = 0; term < noOfTerms; term++) {
      System.out.println(getFibonacci(term));
    }
  }

  public static int getFibonacci(int term) {
    if (term <= 1) return 1;
    return getFibonacci(term - 1) + getFibonacci(term - 2);
  }
}
