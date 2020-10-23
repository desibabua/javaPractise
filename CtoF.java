public class CtoF {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int centigrade = Integer.parseInt(args[0]);
    double fahrenheit = convertToFahrenheit(centigrade);

    String msg = centigrade + " °C is equal to " + fahrenheit + " °F";
    System.out.println(msg);
  }

  public static double convertToFahrenheit(int centigrade) {
    return ((centigrade * 9) / 5.0) + 32;
  }
}
