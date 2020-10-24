public class MyArray {

  public static void printArray(int[] numbers) {
    for (int element : numbers) {
      System.out.print(element);
      System.out.print(" ");
    }

    System.out.print('\n');
  }

  public static int[] range(int from, int to, int step) {
    int arrSize = (int) Math.ceil((to - from) / (double) step);
    int[] range = new int[arrSize];

    for (int index = 0; index < range.length; index++) {
      range[index] = from + step * index;
    }

    return range;
  }

  public static int[] range(int from, int to) {
    return range(from, to, 1);
  }

  public static int[] repeat(int number, int times) {
    int[] newArray = new int[times];

    for (int index = 0; index < times; index++) {
      newArray[index] = number;
    }

    return newArray;
  }

  public static int getHighest(int[] numbers) {
    int highest = numbers[0];
    for (int index = 0; index < numbers.length; index++) {
      if (highest < numbers[index]) {
        highest = numbers[index];
      }
    }

    return highest;
  }

  public static double getAverage(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum / (double) numbers.length;
  }

  public static boolean isAscending(int[] numbers) {
    for (int index = 0; index < numbers.length - 1; index++) {
      if (numbers[index] >= numbers[index + 1]) return false;
    }
    return true;
  }

  public static boolean areEqual(char[] charArr1, char[] charArr2) {
    if (charArr1.length != charArr2.length) return false;

    for (int index = 0; index < charArr1.length; index++) {
      if (charArr1[index] != charArr2[index]) return false;
    }

    return true;
  }

  public static int[] concat(int[] numbers, int[] additionalNumbers) {
    int[] allNumbers = new int[numbers.length + additionalNumbers.length];

    for (int index = 0; index < allNumbers.length; index++) {
      allNumbers[index] =
        index < numbers.length
          ? numbers[index]
          : additionalNumbers[index - numbers.length];
    }

    return allNumbers;
  }

  public static int[] removeZeroes(int[] numbers) {
    int[] newList = new int[countNonZero(numbers)];

    int count = 0;
    for (int number : numbers) {
      if (number > 0) {
        newList[count] = number;
        count++;
      }
    }

    return newList;
  }

  public static int countNonZero(int[] numbers) {
    int count = 0;
    for (int number : numbers) {
      if (number > 0) count += 1;
    }

    return count;
  }

  public static void main(String[] args) {
    printArray(range(1, 5));
    printArray(range(1, 10, 2));
    printArray(range(5, 1, -1));

    printArray(repeat(5, 4));
    printArray(repeat(3, 6));

    System.out.println(getHighest(range(1, 5)));
    System.out.println(getHighest(range(10, 5, -1)));

    System.out.println(getAverage(range(1, 5))); // 2.5
    System.out.println(getAverage(range(1, 10, 2))); // 5

    int[] numbers = { 1, 1, 3 };
    System.out.println(isAscending(numbers));
    System.out.println(isAscending(range(1, 5)));

    char[] chars1 = { 'a', 'b', 'c', 'd' };
    char[] chars2 = { 'a', 'b', 'c', 'd' };
    char[] chars3 = { 'a', 'b' };
    char[] chars4 = { 'a', 'b', 'c', 'e' };

    System.out.println(areEqual(chars1, chars2));
    System.out.println(areEqual(chars1, chars3));
    System.out.println(areEqual(chars1, chars4));

    printArray(concat(range(1, 5), range(5, 0, -1)));

    int[] array = { 1, 2, 0, 2, 3, 0, 0, 2 };
    printArray(removeZeroes(array));
  }
}
