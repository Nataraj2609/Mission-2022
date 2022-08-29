package Interview.FullForce.DataStructure.codingEverything.LLArrayString.String;

public class ValidPalindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isValidPalindrome(s));
  }

  private static boolean isValidPalindrome(String s) {
    char[] sChar = s.toCharArray();
    int ptr = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetterOrDigit(sChar[i])) {
        sChar[ptr++] = Character.toLowerCase(sChar[i]);
      }
    }
    for(int k =0 ; k < ptr/2 ; k++){
      if(sChar[k] != sChar[ptr-k-1])
        return false;
    }
    return true;
  }
}
