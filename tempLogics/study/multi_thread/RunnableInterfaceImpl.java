package study.multi_thread;

import java.io.FileNotFoundException;

public class RunnableInterfaceImpl implements Runnable {

  @Override
  public void run() {
    System.out.println("Run() started :)");
    try {
      Thread.sleep(3000);
      throw new FileNotFoundException();
    } catch (InterruptedException | FileNotFoundException e) {
      e.printStackTrace();
      System.out.println(e);
    }
    System.out.println("Run() completed :)");
  }

  public static void main(String[] args) {
    RunnableInterfaceImpl r = new RunnableInterfaceImpl();
    Thread t = new Thread(r);
    t.start();
  }
}
