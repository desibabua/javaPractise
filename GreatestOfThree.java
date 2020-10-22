public class GreatestOfThree {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 3) {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int num3 = Integer.parseInt(args[2]);

      int GreatestOf2 = num1 > num2 ? num1 : num2;
      int GreatestOf3 = GreatestOf2 > num3 ? GreatestOf2 : num3;
      msg = "Greatest number is " + GreatestOf3;
    }
    System.out.println(msg);
  }
}
