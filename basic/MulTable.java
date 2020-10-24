public class MulTable {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int number = Integer.parseInt(args[0]);
    int noOfTerms = Integer.parseInt(args[1]);

    displayMultiplicationTable(number, noOfTerms);
  }

  public static void displayMultiplicationTable(int number, int noOfTerms) {
    for (int term = 1; term <= noOfTerms; term++) {
      System.out.println(number + " * " + term + " = " + (number * term));
    }
  }
}
