package study.Altimetrik;

public class Temp2 {
  public static void main(String[] args) {
    try {
      throw new RecordNotFoundException("Not Found");
    } catch (Exception e){
      System.out.println("Caught");
      System.out.println(e.getMessage());
    }
  }
}
