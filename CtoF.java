public class CtoF {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 1) {
      int centigrade = Integer.parseInt(args[0]);
      double fahrenheit = ((centigrade * 9) / 5.0) + 32;

      msg = centigrade + " °C is equal to " + fahrenheit + " °F";
    }
    System.out.println(msg);
  }
}
