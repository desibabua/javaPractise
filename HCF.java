public class HCF {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int hcf = getHcf(num1, num2);

    String msg = "HCF of " + args[0] + " and " + args[1] + " is " + hcf;
    System.out.println(msg);
  }

  public static int getHcf(int num1, int num2) {
    int hcf = 1;
    int hcfLimit = Math.min(num1, num2);

    for (int probableHcf = hcfLimit; probableHcf > 0; probableHcf--) {
      if (isFactor(num1, probableHcf) && isFactor(num2, probableHcf)) {
        hcf = probableHcf;
        break;
      }
    }

    return hcf;
  }

  public static boolean isFactor(int num1, int num2) {
    return num1 % num2 == 0;
  }
}
