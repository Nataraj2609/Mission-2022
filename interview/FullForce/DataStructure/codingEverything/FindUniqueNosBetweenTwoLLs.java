package Interview.FullForce.DataStructure.codingEverything;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueNosBetweenTwoLLs {
  public static void main(String[] args) {

    List<Integer> l1 = new ArrayList<>();
    l1.add(21);
    l1.add(450);
    l1.add(4);
    l1.add(5);
    List<Integer> l2 = new ArrayList<>();
    l2.add(21);
    l2.add(45);
    l2.add(5);
    l2.add(6);
    l2.add(7);
    l2.add(8);
    l2.add(5);
    l2.add(6);

    List<Integer> l3 = l1.stream().distinct().collect(Collectors.toList());
    l3.addAll(l2.stream().distinct().filter(n -> !l1.contains(n)).collect(Collectors.toList()));
//    l3.forEach(System.out::println);


    l1.retainAll(l2);
    l1.forEach(System.out::println);
  }
}
