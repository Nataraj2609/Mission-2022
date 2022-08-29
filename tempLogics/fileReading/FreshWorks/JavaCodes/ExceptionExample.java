package fileReading.FreshWorks.JavaCodes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExceptionExample {
  public static void main(String[] args) {

    PriorityQueue<String> queue = new PriorityQueue<>();
    queue.add("Jai");
    queue.add("Amit");
    queue.add("Raj");
    queue.add("Vijay");
    System.out.println("iterating the queue elements:");
    Iterator itr = queue.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    queue.remove();
    queue.poll();
    System.out.println("after removing two elements:");
    Iterator<String> itr2 = queue.iterator();
    while (itr2.hasNext()) {
      System.out.println(itr2.next());

    }
  }

  public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int res = 0;
    Map<Integer, Long> freqMap =
      arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    TreeMap<Integer, Long> treeFreqMap = freqMap.entrySet().stream()
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue, TreeMap::new));

    res = treeFreqMap.entrySet().stream().min(Comparator.comparingLong(Map.Entry::getValue)).get().getKey();

    return res;
  }
}
