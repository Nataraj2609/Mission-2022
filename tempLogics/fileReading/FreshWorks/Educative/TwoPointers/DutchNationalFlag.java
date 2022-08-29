package fileReading.FreshWorks.Educative.TwoPointers;

import java.util.Arrays;

public class DutchNationalFlag {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 0, 2, 1, 0};
    sortFlag(arr);
    System.out.print(Arrays.toString(arr));
    System.out.println();
    arr = new int[]{2, 2, 0, 1, 2, 0};
    sortFlag(arr);
    System.out.print(Arrays.toString(arr));

  }

  private static void sortFlag(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    for (int i = 0; i <= high; ) {
      if (arr[i] == 0) {
        swap(arr, i, low);
        i++;
        low++;
      } else if (arr[i] == 1) {
        i++;
      } else {
        swap(arr, i, high);
        high--;
      }
    }
  }

  private static void swap(int[] arr, int first, int second) {
    int t = arr[first];
    arr[first] = arr[second];
    arr[second] = t;
  }
}
