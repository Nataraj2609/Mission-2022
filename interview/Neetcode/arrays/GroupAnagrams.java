package Interview.Neetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
  public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> res = groupAnagrams(strs);
    for (List<String> eachArrList : res)
      System.out.println(eachArrList.toString());
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();
    if (strs.length == 0)  return res;

    HashMap<String, List<String>> map = new HashMap();
    for (String s : strs) {
      char[] hash = new char[26];
      for (char c : s.toCharArray()) {
        hash[c - 'a']++;
      }
      String str = new String(hash);
      if (map.get(str) == null) {
        map.put(str, new ArrayList<>());
      }
      map.get(str).add(s);
    }
    res.addAll(map.values());
    return res;
  }
}
