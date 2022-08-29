package study.Altimetrik;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Temp {
  public static void main(String[] args) {
    List<Integer> myList = Arrays.asList(10,15,8,49,25,98,64,98,32,15,72);

    HashSet<Integer> hset = new HashSet<>();
    myList.stream().filter(a -> !hset.add(a)).forEach(System.out::println);


  }
}
