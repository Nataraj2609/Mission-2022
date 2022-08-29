package Interview.FullForce.DataStructure.codingEverything.LLArrayString.String;

public class DoMathInsideStream {
  public static void main(String[] args) {
    String s = "1764526";
    int sum = 0;
    int flag = 0;

    for (int j = s.length() - 1; j >= 0; j--) {
      int number = Integer.parseInt(String.valueOf(s.charAt(j)));
      if (flag == 0) {
        sum += number;
        flag = 1;
      } else {
        sum += number * 2;
        flag = 0;
      }
    }

    System.out.println(sum);
    System.out.println(sum%10 == 0 ? true : false);
  }
}
