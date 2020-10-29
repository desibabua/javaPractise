public class Calculator {

  private double sum(int operand1, int operand2) {
    return (operand1 + operand2);
  }

  private double evaluate(int operand1, int operand2, String operator) {
    switch (operator) {
      case "+":
        return sum(operand1, operand2);
      default:
        return 0;
    }
  }

  public static void main(String[] args) {
    int operand1 = Integer.parseInt(args[0]);
    int operand2 = Integer.parseInt(args[1]);
    String operator = args[2];

    Calculator calc = new Calculator();
    double result = calc.evaluate(operand1, operand2, operator);
    System.out.println(result);
  }
}
