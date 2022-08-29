package important_stuffs.RecallDS.Search;

public class BinarySearch {
  public static void main(String[] args) {
    Double d = 10.0/0.0;
    System.out.println(d.isNaN());
    System.out.println(d.isInfinite());


    int[] arr = {1, 2, 3, 4, 5};
    int searchFor = 5;
    BinarySearch b = new BinarySearch();
    int pos = doBinarySearch(arr, searchFor, 0, arr.length - 1);
    System.out.println(pos);
  }

  private static int doBinarySearch(int[] arr, int searchFor, int start, int end) {

    if (start <= end) {
      int median = start + (end - start) / 2;
      if (arr[median] == searchFor) {
        return median;
      } else if (searchFor < arr[median]) {
        return doBinarySearch(arr, searchFor, start, median - 1);
      } else {
        return doBinarySearch(arr, searchFor, median + 1, end);
      }
    }

    return -1;
  }
}