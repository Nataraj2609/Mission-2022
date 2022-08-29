package study.Prog2;

public class MyCounter {
  int counter;

  MyCounter(int counter) {
    if (counter != 0) {
      System.out.println("Creating object with: " + (counter - 1)); //4 3 2 1
      new MyCounter(--counter);
      this.counter = counter;
    } else {
      System.out.println("Stopped Object Creation: " + counter);
    }
  }

  public static void main(String[] args) {
    MyCounter m = new MyCounter(5);
    System.out.println(m.counter);
  }
}
