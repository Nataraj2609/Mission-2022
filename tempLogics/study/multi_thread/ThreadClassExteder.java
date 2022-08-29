package study.multi_thread;

public class ThreadClassExteder extends Thread{
  @Override
  public void run() {
    System.out.println("Im in");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Im Out");
  }

  public static void main(String[] args) {
    ThreadClassExteder tc = new ThreadClassExteder();
    tc.start();
  }
}
