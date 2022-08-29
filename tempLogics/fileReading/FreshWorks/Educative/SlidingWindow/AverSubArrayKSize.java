package fileReading.FreshWorks.Educative.SlidingWindow;

import java.util.Arrays;

public class AverSubArrayKSize {
  public static void main(String[] args) {
    double[] result = findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
    System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
  }

  private static double[] findAverages(int k, int[] arr) {
    double[] result = new double[arr.length - k + 1];

    double windowSum = 0;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];

      if (windowEnd >= k - 1) {
        result[windowStart] = windowSum / k;
        windowSum -= arr[windowStart];
        windowStart++;
      }
    }

    return result;
  }
}
