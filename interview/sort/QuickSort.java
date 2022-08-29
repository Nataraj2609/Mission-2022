package Interview.FullForce.sort;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = {44, 6, 7};
    int len = arr.length;
    quickSort(arr, 0, len - 1);
    System.out.println("Sorted Array ");
    for (int i : arr) {
      System.out.print(i + ", ");
    }
  }

  private static void quickSort(int[] arr, int low, int high) {

  }

  /**
   * QuickSort is a Divide and Conquer algorithm.
   * It picks an element as pivot and partitions the given array around the picked pivot.
   *
   * Always pick last element as pivot
   *
   * Average : O(n logn)
   * Worst: O(n^2)
   */
}
