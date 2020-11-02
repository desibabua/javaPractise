public class Strings {

  public static int countChars(String string) {
    int count = 0;
    for (int index = 0; index < string.length(); index++) {
      if (string.charAt(index) != ' ') count++;
    }
    return count;
  }

  public static int countPunctuations(String string) {
    int count = 0;
    for (int index = 0; index < string.length(); index++) {
      if (",;.".indexOf(string.charAt(index)) >= 0) count++;
    }
    return count;
  }

  public static void printArray(String[] strings) {
    for (String string : strings) {
      System.out.println(string);
    }
  }
  public static void printArray(char[] chars) {
    for (char character : chars) {
      System.out.println(character);
    }
  }

  public static void main(String[] args) {
    /*
    String a = "hello world,";
    String b = new String("hello...");

    System.out.println(countChars(a));
    System.out.println(countChars(b));

    String c = String.format("hello this is a number %d",32);
    System.out.println(c);

    System.out.println(countPunctuations(b));

    System.out.println(new String("new string").substring(5));
    System.out.println(new String("new string").equals(new String("new string")));
    System.out.println(new String("new string").equals("new string"));
    System.out.println("new string".equals("new string"));
    System.out.println("new STRING".equalsIgnoreCase("new string"));
    */

    // printArray("new STRING".split("-"));
    // printArray("new STRING Str String SSt".split("S", 3));
    // char[] chars = new char[50];
    // printArray(chars);
    // "new STRING Str String SSt".getChars(0,20,chars,0);
    // System.out.println("-------");
    // printArray(chars);
    

    // System.out.println("new STRING Str String SSt".codePointAt(0));
    // System.out.println("new STRING Str String SSt".codePointBefore(1));

    // System.out.println("new STRING Str String SSt".contains("String"));
    // System.out.println("Strings".contentEquals("String"));

    // System.out.println(String.valueOf("123"));
    System.out.println("this world is beautiful".substring(5));
    System.out.println("this world is beautiful".indexOf("his"));
    String str = new String("his");
    System.out.println("this world is beautiful".contains(str));
  }
}

// doubts
// where to go for docs
// methods like contains or replace takes charsequence so why its taking string here
