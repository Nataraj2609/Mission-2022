package important_stuffs.RecallDS.String;

import java.util.ArrayList;
import java.util.List;

public class JavaMcq {
  public static void main(String[] args) {
    List<? super A> l1 = new ArrayList<>();
    List<? extends B> l2 = new ArrayList<>();
//    l1 = l2; //Required type: List <? super A>   Provided:   List <capture of ? extends B>
//    l2 = l1; //Required type: List <? extends B>    Provided:  List <capture of ? super A>
//    l1.add(new A());
//    l2.add(new B()); // Produces Error - Required type: capture of ? extends B    Provided: B
//    l1.add(l2.get(0));
//    l2.add(l1.get(0)); // Error - Required type: capture of ? extends B   Provided: capture of ? super A
  }
}

class A {
}

class B extends A {
}