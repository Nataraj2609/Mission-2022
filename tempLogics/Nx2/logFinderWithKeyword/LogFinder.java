package Nx2.logFinderWithKeyword;

import java.io.File;
import java.util.Scanner;

public class LogFinder extends Thread {
  public void run() {
    String keyword = "GetJobStorage";
    String basePath = "C:\\ntst\\new\\2\\logs\\archived\\spring-boot-logger-2022-02-09.";

    System.out.println("Program started at " + System.currentTimeMillis());

    for (int i = 0; i < 898; i++) {
      try {
        System.out.println("Accessing file: " + basePath + i + ".log");
        File file = new File(basePath + i + ".log");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
          String word = input.next();
          if (keyword.equalsIgnoreCase(word)) {
            System.out.println("Found Match at File " + basePath + i + ".log");
            System.out.println(word);
          }
        }
      } catch (Exception e) {
        System.out.println(e.getStackTrace());
      }
    }
    System.out.println("Program ended at " + System.currentTimeMillis());
  }

  public static void main(String[] args) {
    LogFinder l = new LogFinder();
    l.start();
  }
}
