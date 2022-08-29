package Interview.Neetcode.BinarySearch;


import java.util.Arrays;

public class BinarySearchInJava {
  public static void main(String[] args) {
    BinarySearchInJava b = new BinarySearchInJava();
    int[] arr = {2, 34, 4, 5, 7, 9, 3, 66};
    System.out.println(b.search(arr, 1));
    for (int i : arr) {
      System.out.print(i + " ,");
    }
    System.out.println();
    System.out.println(b.search(arr, 2));
    for (int i : arr) {
      System.out.print(i + " ,");
    }
    System.out.println();
    System.out.println(b.search(arr, 34));
    for (int i : arr) {
      System.out.print(i + " ,");
    }
    System.out.println();
    System.out.println(b.search(arr, 7));
    for (int i : arr) {
      System.out.print(i + " ,");
    }
    System.out.println();
    System.out.println(b.search(arr, 9));
    int[] arr2 = new int[0];
    System.out.println(b.search(arr2, 4));
    for (int i : arr) {
      System.out.print(i + " ,");
    }
    System.out.println();
  }

  public int search(int[] nums, int target) {
    Arrays.sort(nums);

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (target == nums[mid]) return mid;
       else if (target < nums[mid]) right = mid - 1;
       else     left = mid + 1;
    }
    return -1;
  }
}
