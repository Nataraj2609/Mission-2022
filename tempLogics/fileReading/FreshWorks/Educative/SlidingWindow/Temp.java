package fileReading.FreshWorks.Educative.SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;

public class Temp {
  public static void main(String[] args) {

    ArrayList<Character> al = new ArrayList<>();
    al.add('c');
    al.add('c');
    al.add('c');
    al.add('c');
    al.add('c');
    al.add('a');
    int i = Collections.frequency(al, 'c');
    System.out.println(i);
  }
}