package important_stuffs.fileReading;

import java.io.IOException;
import java.util.Scanner;

public class Reader {
  public static void main(String[] args) throws IOException {
    //     String str = " India is Mine";
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    char[] arr = s.toCharArray();
    StringBuffer buffer = new StringBuffer();
    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] != ' ') && (arr[i] != '\t')) {
        buffer.append(arr[i]);
      }
    }
    String noSpaceStr2 = buffer.toString();
    System.out.println(noSpaceStr2);

  }
}
