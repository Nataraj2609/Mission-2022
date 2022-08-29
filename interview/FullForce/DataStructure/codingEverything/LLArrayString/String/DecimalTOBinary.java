package Interview.FullForce.DataStructure.codingEverything.LLArrayString.String;

public class DecimalTOBinary {
  public static void main(String[] args) {
    System.out.println(Decimal2Binary(17));
  }

  public static Integer Decimal2Binary(Integer num) {
    int bin = 0;

    int[] rem = new int[1000];
    int i = 0;

    while (num > 0) {
      rem[i++] = num % 2;
      num = num / 2;
    }
    for (int j = i - 1; j >= 0; j--) {
      bin = bin * 10 + rem[j];
    }

    return bin;
  }
}
