public class Factorial {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int number = Integer.parseInt(args[0]);
    String msg = "Factorial of " + number + " is " + getFactorial(number);

    System.out.println(msg);
  }

  public static int getFactorial(int number) {
    if (number <= 1) return 1;
    return number * getFactorial(number - 1);
  }
}
