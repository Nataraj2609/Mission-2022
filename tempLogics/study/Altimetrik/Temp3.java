package study.Altimetrik;

public class Temp3 {
  public static void main(String[] args) {

    String resource1 = "Nataraj";
    String resource2 = "Amreetha";

    Thread t1 = new Thread(() -> {
      synchronized (resource1) {
        System.out.println("Locked the Resource 1 from THREAD 1");
        try {
          Thread.sleep(100);
          synchronized (resource2){
            System.out.println("Locked the Resource 2 from THREAD 1");
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread t2 = new Thread(() -> {
      synchronized (resource2) {
        System.out.println("Locked the Resource 2 from THREAD 2");
        try {
          Thread.sleep(100);
          synchronized (resource1){
            System.out.println("Locked the Resource 1 from THREAD 2");
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    t1.start();
    t2.start();
  }
}
