public class ArrayMethods {

  public static void printArray(int[] numbers) {
    for (int element : numbers) {
      System.out.print(element);
      System.out.print(" ");
    }

    System.out.print("-\n");
  }

  public static int[] clone(int[] numbers) {
    int[] newList = new int[numbers.length];
    System.arraycopy(numbers, 0, newList, 0, numbers.length);
    return newList;
  }

  public static boolean isIncluded(int[] list, int number) {
    for (int element : list) {
      if (number == element) return true;
    }
    return false;
  }

  public static int getFrequency(int[] numbers, int element) {
    int count = 0;
    for (int number : numbers) {
      if (element == number) count += 1;
    }

    return count;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 4, 4 };
    int[] cloned = clone(numbers);

    numbers[0]++;
    printArray(numbers);
    printArray(cloned);

    System.out.println(isIncluded(numbers, 3));
    System.out.println(isIncluded(numbers, 9));
    System.out.println(getFrequency(numbers, 4));
  }
}
