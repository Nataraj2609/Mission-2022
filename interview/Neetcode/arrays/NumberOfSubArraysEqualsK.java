package Interview.Neetcode.arrays;

import java.util.HashMap;

public class NumberOfSubArraysEqualsK {
  public static void main(String[] args) {
    int arr[] = {10, 2, -2, -20, 10}, k = -10;
    System.out.println(numberOfSubArraysEqualsK(arr, k));
  }

  private static int numberOfSubArraysEqualsK(int[] arr, int k) {
    int n = arr.length;
    int sum = 0, count = 0;
    HashMap<Integer, Integer> hmap = new HashMap<>();

    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (k == sum)
        count++;
      if(hmap.containsKey(sum - k))
        count += hmap.get(sum - k);

      hmap.merge(sum, 1, Integer::sum);
    }
    return count;
  }
}
