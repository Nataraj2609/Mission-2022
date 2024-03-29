package fileReading.FreshWorks.Educative.CyclicSort;


public class CyclicSort {

  public static void main(String[] args) {
    int[] arr = new int[]{3, 1, 5, 4, 2};
    cyclicSort(arr);
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

    arr = new int[]{2, 6, 4, 3, 1, 5};
    cyclicSort(arr);
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

    arr = new int[]{1, 5, 6, 4, 3, 2};
    cyclicSort(arr);
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  private static void cyclicSort(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int j = nums[i] - 1;
      if (nums[i] != nums[j]) {
        swap(nums, i, j);
      } else {
        i++;
      }
    }
  }

  private static void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }
}

