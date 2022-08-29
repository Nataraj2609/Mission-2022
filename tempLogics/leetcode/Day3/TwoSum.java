package leetcode.Day3;

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int arr[] = {21, 7, 11, 2};
    int target = 9;
    int[] res = twoSum(arr, target);
    for (int i : res) {
      System.out.println(i);
    }
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      if (hmap.containsKey(target - nums[i])) {
        return new int[]{hmap.get(target - nums[i]), i};
      } else {
        hmap.put(nums[i], i);
      }
    }
    return new int[]{};
  }
}
