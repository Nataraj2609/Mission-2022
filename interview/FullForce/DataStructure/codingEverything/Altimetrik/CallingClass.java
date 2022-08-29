package Interview.FullForce.DataStructure.codingEverything.Altimetrik;

import java.util.ArrayList;
import java.util.List;

public class CallingClass {
  public static void main(String[] args) {
    Demo d = (P, Q, R) -> {
      return true;
    };

    System.out.println(d.demoMethod(1, 2, 3));
    ArrayList<String> al = new ArrayList<>();
    al.add("Hello WOrld");
    getEmployeeName(al, new ArrayList<String>());

    ArrayList<int[]> a = new ArrayList<>();
    getGeneric(a);
    getGeneric(al);

    genericsMethod(12);
  }

  public static<T> void getData(T data){

  }

  public static void getEmployeeName(List<? extends String> list1, List<? super String> list2) {
    System.out.println(list1);
    list2.add("f");
  }

  public static <T> void getGeneric(List<T> genericData){
    System.out.println(genericData.getClass().getName());
  }

  public static <T extends Number> void genericsMethod(T data) {
    System.out.println("Generics Method:");
    System.out.println("Data Passed: " + data);
  }
}
