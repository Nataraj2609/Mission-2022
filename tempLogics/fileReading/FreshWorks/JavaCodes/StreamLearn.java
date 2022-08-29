package fileReading.FreshWorks.JavaCodes;

import java.util.ArrayList;

public class StreamLearn {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(8);
    al.add(98);
    al.add(22);
    al.add(80);

    al.stream().map(a -> a);

//    IntStream randomNumbersStream = Random::ints;
//    Stream.generate(Math::random).limit(10).mapToInt(a-> (int) (a*100)).collect(Collectors.toMap(Function.identity(), Function.identity()));

  }
}
