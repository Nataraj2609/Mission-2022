package Interview.FullForce.DataStructure.codingEverything;

/***
 * Question asked in EPAM Anywhere and I failed
 */
public class SwapLettersAndNumbers {
  public static void main(String[] args) {
    String s = "A2B#cv&89)efuh";
    System.out.println(swapAlphaNumeric(s));
  }

  private static String swapAlphaNumeric(String s) {
    char[] ch = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;
    while(i < j){
      if(Character.isLetterOrDigit(ch[i]) && Character.isLetterOrDigit(ch[j])){
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
        i++;
        j--;
      } else if(!Character.isLetterOrDigit(ch[i])){
        i++;
      } else if(!Character.isLetterOrDigit(ch[j])){
        j--;
      }
    }
    return String.valueOf(ch);
  }
}
