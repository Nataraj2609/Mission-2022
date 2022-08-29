package Interview.FullForce.DataStructure.codingEverything.LLArrayString.String;

import java.util.LinkedHashMap;

public class FirstUniqueCharacter {
  public static void main(String[] args) {
    String s = "leetcode";
    System.out.println(firstUnique(s));
  }

  private static int firstUnique(String s) {
    char[] ch = s.toCharArray();
    LinkedHashMap<Character, Integer> Lhmap = new LinkedHashMap<>();
    for (char c : ch) {
      Lhmap.merge(c, 1, Integer::sum);
    }
    if (Lhmap.containsValue(1)) {
      Character unique = Lhmap.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue()==1).findFirst().get().getKey();
       for (int i = 0; i < ch.length; i++) {
        if (ch[i] == unique)
          return i;
      }
    }
    return -1;
  }
}
