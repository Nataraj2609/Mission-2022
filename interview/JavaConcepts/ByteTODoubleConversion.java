package Interview.FullForce.JavaConcepts;

public class ByteTODoubleConversion {
  int ClassOneVariable = 99;

  public static void main(String[] args) {
    Byte a = 3;
    //    Double d = (Double) a;
    Double x = a.doubleValue();

    byte bytewq = 9;
    byte $d = 0;
    byte _d = 0;

    double dou = bytewq;
    System.out.println(dou);

    ByteTODoubleConversion c = new ByteTODoubleConversion();
    ByteTODoubleConversion.Child childClass = c.new Child();
    childClass.childClassVariable = 0;

  }

  class Child {
    int childClassVariable = 999;
  }
}
