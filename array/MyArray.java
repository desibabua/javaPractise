public class MyArray {

  public static void main(String[] args) {
    printArray(range(1, 5));
  }

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.print(element);
      System.out.print(" ");
    }

    System.out.print('\n');
  }

  public static int[] range(int from, int to) {
    int[] range = new int[to - from];

    for (int index = 0; index < range.length; index++) {
      range[index] = index + from;
    }

    return range;
  }
}
