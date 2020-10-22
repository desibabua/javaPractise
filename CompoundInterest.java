public class CompoundInterest {
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    double r = Integer.parseInt(args[1]) / 100.0;
    int t = Integer.parseInt(args[2]);

    double finalAmount = p;

    while(t > 0) {
      finalAmount *= ( 1+ r);
      t--;
    }
    
    double ci = finalAmount - p;
    System.out.println(ci);
  }
}
