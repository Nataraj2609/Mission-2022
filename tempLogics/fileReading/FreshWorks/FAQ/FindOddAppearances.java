package fileReading.FreshWorks.FAQ;

public class FindOddAppearances {
  public static void main(String[] args) {
    int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
    System.out.println(findOddAppr(arr));
  }

  private static int findOddAppr(int[] arr) {
    int res = 0;
    for(int i: arr)
      res ^= i;
    return res;
  }
}
