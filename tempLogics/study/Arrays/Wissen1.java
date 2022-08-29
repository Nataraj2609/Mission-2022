package study.Arrays;

import java.util.Arrays;

public class Wissen1 {
  public static void main(String[] args) {
    int[] arr = {1, 2, -5, 6, 7, -9, -1};

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > 0) {
        continue;
      } else {
        int t = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = t;
      }
    }

    Arrays.stream(arr).forEach(i -> System.out.print(i + ","));
  }
}
