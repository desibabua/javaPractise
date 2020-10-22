public class MulTable {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);

    int product;
    for(int i = 1; i <= n; i++ ) {
      product = m * i;
      System.out.println(m + " * " + i + " = " + product);
    }
  }
}
