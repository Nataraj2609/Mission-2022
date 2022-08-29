package study.Prog2;

public class ExceptionEg {
  public static void main(String[] args) {
    try{
      int i = 20/0;
    } catch (Exception e){
      System.out.println(e);
      throw new ArithmeticException();
//      System.out.println("Exiting from Catch block");
    }
  }
}
