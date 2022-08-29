package important_stuffs.RecallDS.String;

import java.util.ArrayList;
import java.util.HashSet;

//https://www.geeksforgeeks.org/maximize-length-of-the-string-by-concatenating-characters-from-an-array-of-strings/
public class MaxStrLengthFromDifferentArrays {

  static boolean check(String s) {
    HashSet<Character> a = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      if (a.contains(s.charAt(i))) {
        return false;
      }
      a.add(s.charAt(i));
    }
    return true;
  }

  static ArrayList<String> helper(ArrayList<String> arr, int ind) {

    // Base case
    if (ind == arr.size()) {
      ArrayList<String> fin = new ArrayList<>();
      fin.add("");
      return fin;
    }

    ArrayList<String> tmp = helper(arr, ind + 1);
    ArrayList<String> ret = new ArrayList<>(tmp);

    // Add current string to result of other strings and check if characters are unique or not
    for (int i = 0; i < tmp.size(); i++) {
      String test = tmp.get(i) + arr.get(ind);

      if (check(test)) {
        ret.add(test);
      }
    }
    return ret;
  }

  static int maxLength(ArrayList<String> arr) {
    ArrayList<String> tmp = helper(arr, 0);
    int len = 0;
    for (int i = 0; i < tmp.size(); i++) {
      len = Math.max(len, tmp.get(i).length());
    }
    return len;
  }

  public static void main(String[] args) {
    ArrayList<String> s = new ArrayList<>();
    s.add("abcd");
    s.add("efghi");
    s.add("efgh");
    System.out.println(maxLength(s));
  }
}
