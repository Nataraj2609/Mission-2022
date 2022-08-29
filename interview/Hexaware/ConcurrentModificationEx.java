package Interview.Hexaware;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationEx {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(55);
    al.add(1);
    al.add(3);

    Iterator<Integer> iter = al.iterator();
    while(iter.hasNext()){
      al.remove(iter.next());
      System.out.println(iter.next());
    }
  }
}
