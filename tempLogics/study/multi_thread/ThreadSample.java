package study.multi_thread;

public class ThreadSample extends Thread {
  public static void main(String[] args) {
    ThreadSample t1 = new ThreadSample();
    t1.run();
  }

  @Override
  public void run() {
    super.run();
    System.out.println("Hello World");
  }
}
