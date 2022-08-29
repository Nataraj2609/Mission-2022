package Interview.FullForce.DataStructure.codingEverything;

import java.util.ArrayList;

public class StreamFindingAverage {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(13);
    al.add(5);
    al.add(17);

    al.stream().map(i -> i*i*i).filter(total -> total>100).forEach(System.out::println);
//    Original Question's solution - Find Cube of number then filter total > 100 & then find its average
    System.out.println(al.stream().map(i -> i*i*i).filter(total -> total>100).mapToInt(n -> n.intValue()).average());

//    Proof that n number of map - intermediate operations can be done
    System.out.println(al.stream().map(i -> i*i*i).filter(total -> total>100)
      .mapToInt(n -> n).map(i->i/10).filter(i -> i>1).average());



  }
}
