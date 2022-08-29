package Interview.FullForce.search;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int searchFor = 2;
    BinarySearch b = new BinarySearch();
    int position = b.binarySearch(arr, searchFor, 0, arr.length - 1);
    System.out.println(position);
  }

  private int binarySearch(int[] arr, int searchFor, int start, int end) {
    if (start <= end) {
      int median = start + (end - start) / 2;

      if (searchFor == arr[median]) {
        return median;
      } else if (searchFor < arr[median]) {
        return binarySearch(arr, searchFor, start, median - 1);
      }
      return binarySearch(arr, searchFor, median + 1, end);
    }
    return -1;
  }  //Time complexity: O(log n)
}
