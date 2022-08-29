package Interview.FullForce.DataStructure.codingEverything;

import java.util.HashMap;

public class AnagramsOfTwoStrings {
  public static void main(String[] args) {
    String s1 = "LISTEN";
    String s2 = "SILENT";
    System.out.println(isAnagram(s1, s2));
  }

  private static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    HashMap<Character, Integer> hmap = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      hmap.merge(s1.charAt(i), 1, Integer::sum);
    }

    for (int j = 0; j < s2.length(); j++) {
      if (hmap.containsKey(s2.charAt(j))) {
        hmap.put(s2.charAt(j), hmap.get(s2.charAt(j)) + 1);
      } else {
        return false;
      }
    }
    return true;
  }
}
