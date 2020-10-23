public class FtoC {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int fahrenheit = Integer.parseInt(args[0]);
    double centigrade = convertToCentigrade(fahrenheit);

    String msg = fahrenheit + " °F is equal to " + centigrade + " °C";
    System.out.println(msg);
  }

  public static double convertToCentigrade(int fahrenheit){
    return ((fahrenheit - 32) * 5) / 9.0;
  }
}
