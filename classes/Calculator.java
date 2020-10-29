public class Calculator {
  private double result;

  public Calculator(double initialResult) {
    this.result = initialResult;
  }

  public double evaluate(double operand, char operator) {
    switch (operator) {
      case '+':
        this.result += operand;
        break;
      case '-':
        this.result -= operand;
        break;
      case 'x':
        this.result *= operand;
        break;
      case '/':
        this.result /= operand;
        break;
    }
    return this.result;
  }

  public double getCurrentResult() {
    return this.result;
  }

  public static char parseOperator(String operator) {
    // if (!operator.matches("^[+-x/]$")) {
    //   throw error "$operator Operator is not available in calculator"
    // }
    return operator.charAt(0);
  }

  public static void main(String[] args) {
    double initialResult = args.length > 0 ? Double.parseDouble(args[0]) : 0;
    Calculator calc = new Calculator(initialResult);

    for (int index = 1; index < args.length; index += 2) {
      char operator = parseOperator(args[index]);
      double operand = Double.parseDouble(args[index + 1]);

      calc.evaluate(operand, operator);
    }

    System.out.println(calc.getCurrentResult());
  }
}
