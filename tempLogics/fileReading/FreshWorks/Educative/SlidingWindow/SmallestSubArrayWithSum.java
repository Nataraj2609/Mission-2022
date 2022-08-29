package fileReading.FreshWorks.Educative.SlidingWindow;

public class SmallestSubArrayWithSum {
  public static void main(String[] args) {
    int result = findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2});
    System.out.println("Smallest subarray length: " + result);
    result = findMinSubArray(8, new int[]{3, 4, 1, 1, 6});
    System.out.println("Smallest subarray length: " + result);
    result = findMinSubArray(8, new int[]{2, 1, 5, 2, 3, 2});
    System.out.println("Smallest subarray length: " + result);
  }

  private static int findMinSubArray(int sum, int[] arr) {
    int minSubArray = Integer.MAX_VALUE;
    int windowSum = 0;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      if (windowSum >= sum) {
        minSubArray = Math.min(minSubArray, windowEnd - windowStart +1);
        windowSum -= arr[windowStart++];
      }
    }

    return minSubArray == Integer.MAX_VALUE ? 0: minSubArray;
  }
}
