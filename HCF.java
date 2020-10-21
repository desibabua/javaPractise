/*

1, 2 = 1
2, 3 = 1
2, 4 = 2
4, 2 = 2

0, 2 = 2
2, 0 = 2

*/

public class HCF {

  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int remainder = num2;
    while(remainder != 0){
      remainder = num1 % num2;
      num1 = num2;
      num2 = remainder;
    }
    
    System.out.println("HCF of " + args[0] + " and " + args[1] + " is " + num1);
  }
}