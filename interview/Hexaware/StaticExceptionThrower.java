package Interview.Hexaware;

public class StaticExceptionThrower {
  static {
    System.out.println("Static called");
    //Static block cannot throw checked exceptions directly, you need a try/catch
    try {
      throw new ArrayIndexOutOfBoundsException();
    }catch (Exception e){
      System.out.println(e);
    }
  }
  public static void main(String[] args) {
    throw new ArrayIndexOutOfBoundsException();
  }
}
