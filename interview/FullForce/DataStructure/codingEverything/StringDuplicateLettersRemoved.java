package Interview.FullForce.DataStructure.codingEverything;

import java.util.HashSet;

public class StringDuplicateLettersRemoved {
  public static void main(String[] args) {
    String s = "Nataraj";

    HashSet<String> hset = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      hset.add(String.valueOf(s.charAt(i)));
    }

    String res = String.join("", hset);
    System.out.println(res);
  }
}
