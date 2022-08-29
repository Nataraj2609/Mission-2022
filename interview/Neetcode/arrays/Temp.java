package Interview.Neetcode.arrays;

import java.util.Arrays;

public class Temp {
  public static void main(String args[]) {
    String s = "pbbcggttciiippooaais";
    int k = 2;
//    removeDuplicates(s, k);

    removeDuplicates("pbbcggttciiippooaais" , 2);

//    removeDuplicates("deeedbbcccbdaa" , 3);
  }

  private static void removeDuplicates(String s, int k) {
    String res = "";
    char[] ch = s.toCharArray();
    Arrays.sort(ch);
    System.out.print(ch);
    System.out.println();

    int[] hash = new int[26];
    for (char c : ch)
      hash[c - 'a']++;


    for (int i = 0; i < 26; i++) {
      System.out.print(hash[i]);
    }
    System.out.println();

    for (int i = 0; i < 26; i++) {
      if (hash[i] % k != 0) {
        System.out.print(hash[i]);
        System.out.print((char)(i + 97));
        System.out.println();

        for(int p = 0; p < hash[i]/k;p++ ){
          res += (char)(i + 97);
        }
      }
    }


  }
}


