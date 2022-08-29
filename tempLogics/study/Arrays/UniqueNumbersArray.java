package study.Arrays;

import java.util.Arrays;

public class UniqueNumbersArray {
  public static void main(String[] args) {
    int[] arr = {9, 1, 2, 9, 4, 5, 6, 7, 8, 0};
    isValid(arr);
  }

  private static void isValid(int[] arr) {
    int[] expectedArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Arrays.sort(arr);
    if (arr.length != expectedArr.length) {
      System.out.println("False");
      return;
    }
    for (int i = 0; i < expectedArr.length; i++) {
      if (arr[i] != expectedArr[i]) {
        System.out.println("False");
        return;
      }
    }
    System.out.println("True");
  }
}
