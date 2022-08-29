package fileReading.FreshWorks.Educative.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public static void main(String[] args) {
    List<List<Integer>> result = findSubsets(new int[]{1, 3});
    System.out.println("Here is the list of subsets: " + result);

    result = findSubsets(new int[]{1, 5, 3});
    System.out.println("Here is the list of subsets: " + result);
  }

  private static List<List<Integer>> findSubsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();

    res.add(new ArrayList<>());

    for (int num : nums) {
      //Make sure you grabbed the size of al before entering the next loop, or else results in infinite loop
      int n = res.size();
      for (int i = 0; i < n; i++) {
        List<Integer> newSetList = new ArrayList<>(res.get(i));
        newSetList.add(num);
        res.add(newSetList);
      }
    }
    return res;
  }
}
