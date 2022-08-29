package fileReading.FreshWorks.Educative.SlidingWindow;

public class MaxSumOfSubArrayKSize {
  public static void main(String[] args) {
    int[] arr = {2, 1, 5, 1, 3, 2};
    int k = 3;
    System.out.println(findMaxSumOfSubarrayKsize(arr, k));
  }

  private static int findMaxSumOfSubarrayKsize(int[] arr, int k) {
    int MaxSum = 0;
    int windowSum = 0;
    int windowStart = 0;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      if (windowEnd >= k - 1) {
        MaxSum = Math.max(windowSum, MaxSum);
        windowSum -= arr[windowStart++];
      }
    }
    return MaxSum;
  }


}
