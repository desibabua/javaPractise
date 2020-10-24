public class GreatestOfThree {

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    int greatest = getGreatestOfThree(num1, num2, num3);

    String msg = "Greatest number is " + greatest;
    System.out.println(msg);
  }

  public static int getGreatestOfThree(int num1, int num2, int num3) {
    return Math.max(Math.max(num1, num2), num3);
  }
}
