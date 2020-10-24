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
    int smallerNum = Math.min(num1, num2);
    int largerNum = Math.max(num1, num2);
    int lcm = largerNum;

    while (lcm % smallerNum != 0) {
      lcm += largerNum;
    }

    return lcm;
  }
}
