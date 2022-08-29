package study.morgnStanley;

class Parent {
  static String hikeForKalai() {
    return "Parent - 200% Hike";
  }

  String sayHi() {
    return "kalai parent!";
  }
}

public class Child extends Parent {
  static String hikeForKalai() {
    return "Child - Double Hike";
  }

  @Override
  String sayHi() {
    return "Kalai Won't talk! His Child will";
  }

  public static void main(String[] args) {
    //    Child c = new Child();
    //    Parent c = new Child();
    //    List<Integer> l = new ArrayList<>();
    ////    Parent c = new Parent();
    //    System.out.println(c.hikeForKalai());
    //    System.out.println(c.sayHi());


//    String s = new String("Kalai");
//    String s1 = new String("Kalai");
//    System.out.println(s == s1); // Reference + Object value
//    System.out.println(s.equals(s1)); //Immutable refence - Object address same
//    String s2 = "Nataraj";
//    String s3 = "Nataraj";
//    System.out.println(s2 == s3);
//    System.out.println(s2.equals(s3));//Immutable refence - Object address same


    StringBuffer sb = new StringBuffer("Kalai");
    StringBuffer sb1 = new StringBuffer("Kalai");
    System.out.println(sb == sb1);      //
    System.out.println(sb.equals(sb1)); //



  }
}
