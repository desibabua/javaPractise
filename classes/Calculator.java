public class Calculator {

  private double evaluate(double operand1, double operand2, char operator) {
    switch (operator) {
      case '+':
        return operand1 + operand2;
      case '-':
        return operand1 - operand2;
      case 'x':
        return operand1 * operand2;
      case '/':
        return operand1 / operand2;
      default:
        return 0;
    }
  }

  public static char getOperator(String operator) {
    // if (!operator.matches("^[+-x/]$")) {
    //   throw error "$operator Operator is not available in calculator"
    // }
    return operator.charAt(0);
  }

  public static void main(String[] args) {
    double operand1 = Double.parseDouble(args[0]);
    double operand2 = Double.parseDouble(args[1]);
    char operator = getOperator(args[2]);

    Calculator calc = new Calculator();
    double result = calc.evaluate(operand1, operand2, operator);

    System.out.println(result);
  }
}
