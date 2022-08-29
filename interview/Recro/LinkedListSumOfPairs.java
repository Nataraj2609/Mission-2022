package Interview.Recro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSumOfPairs {
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    LinkedList<Integer> l2 = new LinkedList<>();
    l1.add(3);
    l1.add(6);
    l1.add(9);
    l1.add(12);
    l2.add(2);
    l2.add(5);
    l2.add(-9);
    int x = 8;
    printSumOfPairs(l1, l2, x);
  }

  private static void printSumOfPairs(LinkedList<Integer> l1, LinkedList<Integer> l2, int x) {
    int count = 0;
    HashSet<Integer> hset = new HashSet<>();
    Iterator<Integer> l1_Iterator = l1.iterator();
    Iterator<Integer> l2_Iterator = l2.iterator();

    while (l1_Iterator.hasNext()) {
      hset.add(l1_Iterator.next());
    }
    while (l2_Iterator.hasNext()) {
      int next = l2_Iterator.next();
      if (!hset.add(x - next)) {
        System.out.printf("Sum of %d is " , x);
        System.out.println(next);
        System.out.println(x-next);
        System.out.println("--------------------------------------------");
        count++;
      }
    }
    System.out.println(count);
  }
}
