package Interview.Neetcode.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
  public static void main(String[] args) {
    int[] arr = {2,3,4,5,5,6,7};
    containsDuplicate(arr);
  }

  private static void containsDuplicate(int[] arr) {
    HashSet<Integer> hset = new HashSet<>();
    for (int i : arr) {
      if (hset.contains(i)) {
        System.out.println("true");
      }
      hset.add(i);
    }
  }
}
