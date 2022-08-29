package Interview.FullForce.ProblemSet;

import java.util.Arrays;

/***
 * This is an important question - Minimum Number of Platforms Required for a Railway/Bus Station
 *
 * Interval Problem - Similar one: Max Number of Population if birth & death year of individuals are given
 *
 *  Sort two arrays - O(N log N)
 *  compare if array1 is higher +1 else -1 - traversal - O(n)
 *
 *  Time complexity : O(N log N)
 */
public class NumberOfTrainsPlatforms {

  /**
   * Efficient Approach: Store the arrival time and departure time and sort them based on arrival time then
   * check if the departure time of the next train is smaller than the departure time of the previous train
   * if it is smaller then increment the number of the platforms needed otherwise not.
   */
  public static void main(String[] args) {
    int arr[] = {900, 940, 950, 1100, 1500, 1800};
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
    int n = arr.length;
    System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
  }

  private static int findPlatform(int[] arr, int[] dep, int n) {
    // Sort arrival and departure arrays
    Arrays.sort(arr);
    Arrays.sort(dep);

    // plat_needed indicates number of platforms needed at a time
    int plat_needed = 1, Max_Platform_needed = 1;
    int i = 1, j = 0;

    while (i < n && j < n) {
      // If next event in sorted order is arrival,
      // increment count of platforms needed
      if (arr[i] <= dep[j]) {
        plat_needed++;
        i++;
      }

      // Else decrement count of platforms needed
      else if (arr[i] > dep[j]) {
        plat_needed--;
        j++;
      }

      // Update Max_Platform_needed if needed
      Max_Platform_needed = Math.max(plat_needed, Max_Platform_needed);
    }

    return Max_Platform_needed;
  }
}
