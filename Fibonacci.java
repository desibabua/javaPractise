public class Fibonacci {

  public static void main(String[] args) {
    if (args.length == 1) {
      int fibTerms = Integer.parseInt((args[0]));
      int num1 = -1;
      int num2 = 1;
      int currentFib;

      while (fibTerms > 0) {
        currentFib = num1 + num2;
        num1 = num2;
        num2 = currentFib;
        fibTerms--;

        System.out.println(currentFib);
      }
    } else {
      System.out.println("Arguments length not matched");
    }
  }
}
