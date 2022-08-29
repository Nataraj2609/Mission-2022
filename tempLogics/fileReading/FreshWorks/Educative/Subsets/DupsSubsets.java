package fileReading.FreshWorks.Educative.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupsSubsets {
  public static void main(String[] args) {
    List<List<Integer>> result = findSubsets(new int[] { 1, 3, 3 });
    System.out.println("Here is the list of subsets: " + result);

    result = findSubsets(new int[] { 1, 5, 3, 3 });
    System.out.println("Here is the list of subsets: " + result);
  }

  private static List<List<Integer>> findSubsets(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> res = new ArrayList<>();
    res.add(new ArrayList<>());





    return res;
  }
}
