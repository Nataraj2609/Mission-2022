package important_stuffs.RecallDS.String;

public class EpamQues {
  public static void main(String[] args) {
    String s = "abc#de$f%h&*";
    System.out.println(reverseStr(s));
  }

  private static String reverseStr(String s) {
    char[] chArray = s.toCharArray();
    int frontRunner = 0;
    int BackRunner = chArray.length - 1;

    while (frontRunner < BackRunner) {
      if (!Character.isLetterOrDigit(chArray[frontRunner])) {
        frontRunner++;
      }
      if (!Character.isLetterOrDigit(chArray[BackRunner])) {
        BackRunner--;
      }
      if (Character.isLetterOrDigit(chArray[frontRunner]) && Character.isLetterOrDigit(chArray[BackRunner])){
        char temp = chArray[frontRunner];
        chArray[frontRunner] = chArray[BackRunner];
        chArray[BackRunner] = temp;
        frontRunner++;
        BackRunner--;
      }
    }
    return String.valueOf(chArray);
  }
}

