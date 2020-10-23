public class LCM {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int lcm = getLcm(num1, num2);
    
    String msg = "LCM of " + args[0] + " and " + args[1] + " is " + lcm;
    System.out.println(msg);
  }

  public static int getLcm(int num1, int num2) {
    int product = num1 * num2;

    int remainder = num2;
    while (remainder != 0) {
      remainder = num1 % num2;
      num1 = num2;
      num2 = remainder;
    }

    int hcf = num1;
    return product / hcf;
  }
}
