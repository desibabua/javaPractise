public class HCF {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 2) {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int remainder = num2;

      while (remainder != 0) {
        remainder = num1 % num2;
        num1 = num2;
        num2 = remainder;
      }

      int hcf = num1;
      msg = "HCF of " + args[0] + " and " + args[1] + " is " + hcf;
    }
    System.out.println(msg);
  }
}
