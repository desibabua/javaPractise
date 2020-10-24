public class MyArray {

  public static void main(String[] args) {
    printArray(range(1, 5));
    printArray(range(1, 10, 2));
    printArray(range(5, 1, -1));

    printArray(repeat(5, 4));
    printArray(repeat(3, 6));

    System.out.println(getHighest(range(1,5)));
    System.out.println(getHighest(range(10,5,-1)));
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

  public static int[] range(int from, int to, int step) {
    int arrSize = (int) Math.ceil((to - from) / (double) step);
    int[] range = new int[arrSize];

    for (int index = 0; index < range.length; index++) {
      range[index] = from + step * index;
    }

    return range;
  }

  public static int[] repeat(int number, int times) {
    int[] newArray = new int[times];

    for (int index = 0; index < times; index++) {
      newArray[index] = number;
    }

    return newArray;
  }

  public static int getHighest(int[] array) {
    int highest = array[0];
    for (int index = 0; index < array.length; index++) {
      if (highest < array[index]) {
        highest = array[index];
      }
    }

    return highest;
  }
}
