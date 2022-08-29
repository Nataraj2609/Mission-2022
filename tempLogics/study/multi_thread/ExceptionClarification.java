package study.multi_thread;

import java.io.FileNotFoundException;

public class ExceptionClarification {
  public static void main(String[] args) {
    try {
      Thread.sleep(3000);
      throw new FileNotFoundException();
    } catch (InterruptedException | FileNotFoundException e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }
}
