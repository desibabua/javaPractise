public class CharArray {

  public static boolean areEqual(char[] charArr1, char[] charArr2) {
    if (charArr1.length != charArr2.length) return false;

    for (int index = 0; index < charArr1.length; index++) {
      if (charArr1[index] != charArr2[index]) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    char[] chars1 = { 'a', 'b', 'c', 'd' };
    char[] chars2 = { 'a', 'b', 'c', 'd' };
    char[] chars3 = { 'a', 'b' };
    char[] chars4 = { 'a', 'b', 'c', 'e' };

    System.out.println(areEqual(chars1, chars2));
    System.out.println(areEqual(chars1, chars3));
    System.out.println(areEqual(chars1, chars4));
  }
}
