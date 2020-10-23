public class Calculator {

  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    String symbol = args[2];

    performOps(num1, num2, symbol);
  }

  public static void performOps(double num1, double num2, String symbol) {
    double result = 0 ;
    switch (symbol) {
      case "+":
        result = getSum(num1, num2);
        break;
      case "-":
        result = getSub(num1, num2);
        break;
      case "*":
        result = getMultiplication(num1, num2);
        break;
      case "/":
        result = getQuotient(num1, num2);
        break;
      case "%":
        result = getRemainder(num1, num2);
        break;
    }

    System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
  }

  public static double getSum(double num1, double num2) {
    return num1 + num2;
  }

  public static double getSub(double num1, double num2) {
    return num1 - num2;
  }

  public static double getMultiplication(double num1, double num2) {
    return num1 * num2;
  }

  public static double getQuotient(double num1, double num2) {
    return num1 / num2;
  }

  public static double getRemainder(double num1, double num2) {
    return num1 % num2;
  }
}
