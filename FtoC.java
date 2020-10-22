public class FtoC {

  public static void main(String[] args) {
    String msg = "Arguments length not matched";
    if (args.length == 1) {
      int fahrenheit = Integer.parseInt(args[0]);
      double centigrade = ((fahrenheit - 32) * 5) / 9.0;
      
      msg = fahrenheit + " °F is equal to " + centigrade + " °C";
    }
    System.out.println(msg);
  }
}
