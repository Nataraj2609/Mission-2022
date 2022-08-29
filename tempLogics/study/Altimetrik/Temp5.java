package study.Altimetrik;

public class Temp5 {
  public static void main(String[] args) {
    final resource1 a = new resource1();
    final resource2 b = new resource2();

    // Thread-1
    Thread t1 = new Thread(() -> {
      synchronized (b) {
        try {
          /* Adding delay so that both threads can start trying to lock resources */
          System.out.println("Locking B Thread 1");
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        // Thread-1 have resource1 but need resource2 also
        synchronized (a) {
          System.out.println("Locking A Thread 1");

          System.out.println("In block 1");
        }
      }
    });

    // Thread-2
    Thread t2 = new Thread(() -> {
        synchronized (b) {
          System.out.println("Locking B Thread 2");

          // Thread-2 have resource2 but need resource1 also
          synchronized (a) {
            System.out.println("Locking A Thread 2");

            System.out.println("In block 2");
          }
        }
    });


    t1.start();
    t2.start();
  }
}

// resource1
class resource1 {
  private int i = 10;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }
}

// resource2
class resource2 {
  private int i = 20;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }
}