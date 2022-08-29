package Interview.FullForce.DataStructure.codingEverything;

import java.util.Arrays;
import java.util.Random;

public class RandomNos {
  public static void main(String[] args) {

    Random r = new Random();
    long[] longs = r.longs(1, 1000).distinct().limit(10).toArray();
    Arrays.stream(longs).forEach(System.out::println);
  }
}
