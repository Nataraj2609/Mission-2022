package fileReading.FreshWorks.Educative.TwoPointers;

public class TargetSum {
  public static void main(String[] args) {
    int[] result = targetSearch(new int[]{1, 2, 3, 4, 6}, 6);
    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    result = targetSearch(new int[]{2, 5, 9, 11}, 11);
    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
  }

  private static int[] targetSearch(int[] arr, int sum) {
    int x = 0;
    int y = arr.length - 1;

    while (x < y) {
      int elem1 = arr[x];
      int elem2 = arr[y];
      if(elem1 + elem2 == sum)
        return new int[] {x, y};
      else if(elem1 + elem2 > sum)
        y--;
      else
        x++;
    }


    return new int[]{};
  }
}
