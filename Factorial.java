public class Factorial {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 1) {
      int number = Integer.parseInt(args[0]);
      int factorial = 1;
      for (int i = 1; i <= number; i++) {
        factorial *= i;
      }
      msg = "Factorial is " + factorial;
    }
    System.out.println(msg);
  }
}
