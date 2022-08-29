package Interview.Hexaware;

import java.util.ArrayList;

public class RemoveFromALWhileIterating {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(55);
    al.add(1);
    al.add(3);

    for (int i :
      al) {
      if (i == 1)
        al.remove(i);
    }

    al.remove(new Integer(3));
    al.forEach(System.out::println);
  }
}
