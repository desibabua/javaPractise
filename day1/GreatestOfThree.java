public class GreatestOfThree {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    int Greatest = num1 > num2 ? num1 : num2;
    Greatest = Greatest > num3 ? Greatest : num3;

    System.out.println("Greatest number is " + Greatest);
  }
}
