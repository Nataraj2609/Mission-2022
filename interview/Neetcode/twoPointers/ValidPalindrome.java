package Interview.Neetcode.twoPointers;

import java.util.Locale;

public class ValidPalindrome {
  public static void main(String[] args) {
    String s  = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }

  private static boolean isPalindrome(String s) {

    if(s.length() == 1) return true;

    StringBuilder content = new StringBuilder();
    for(int i =0; i < s.length(); i++){
      if(Character.isLetterOrDigit(s.charAt(i)))
        content.append(s.charAt(i));
    }
    String res = content.toString();
    res = res.replaceAll(" ", "").toLowerCase();
    return res.equals(content.reverse().toString().toLowerCase());
  }
}
