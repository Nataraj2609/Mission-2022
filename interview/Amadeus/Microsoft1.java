package Interview.Amadeus;

import java.util.Arrays;

public class Microsoft1 {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 1, 3, 4, 2, 3};
    int K = 4;

    long[] res = new long[arr.length - K + 1];
    int skip = 0;

    for (int set_no = 0; set_no < res.length; set_no++) {
      res[set_no] = Arrays.asList(arr).stream().skip(skip++).limit(K).distinct().count();
    }

    for (long j : res) {
      System.out.println(j);
    }
  }
}
