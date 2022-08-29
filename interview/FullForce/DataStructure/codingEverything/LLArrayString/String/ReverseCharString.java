package Interview.FullForce.DataStructure.codingEverything.LLArrayString.String;

import java.util.Arrays;

public class ReverseCharString {
  public static void main(String[] args) {
    char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
    Arrays.asList(s).forEach(System.out::println);
    reverseString(s);
    System.out.println("After");
    Arrays.asList(s).forEach(System.out::println);
  }

  public static void reverseString(char[] s) {
    int mid = s.length  / 2;
    int rev = s.length - 1;;
    for (int i = 0; i < mid; i++) {
      char temp = s[i];
      s[i] = s[rev];
      s[rev--] = temp;
    }

  }
}
