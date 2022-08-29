package study.multi_thread;

class ThreadJoin extends Thread {
  public ThreadJoin(String name){
    super(name);
  }
  public void run() {
    for (int j = 0; j < 2; j++) {
      try {
        Thread.sleep(900);
        System.out.println("The current thread name is: " + Thread.currentThread().getName());
      }
      catch (Exception e) {
        System.out.println("The exception has been caught: " + e);
      }
      System.out.println("Value of j is "+ j  +" " + Thread.currentThread().getName());
    }
  }
}

class ThreadJoinExample {
  public static void main(String argvs[]) {
    ThreadJoin th1 = new ThreadJoin("Thread One");
    ThreadJoin th2 = new ThreadJoin("Thread TWO");
    ThreadJoin th3 = new ThreadJoin("Thread 3");

    th1.start();

    // starting the second thread after when
    // the first thread th1 has ended or died.
    try {
      System.out.println("The current thread name is: " + Thread.currentThread().getName());
      // invoking the join() method
      th1.join();
    } catch (Exception e) {
      System.out.println("The exception has been caught " + e);
    }

    th2.start();

    // starting the th3 thread after when the thread th2 has ended or died.
    try {
      System.out.println("The current thread name is: " + Thread.currentThread().getName());
      th2.join();
    } catch (Exception e) {
      System.out.println("The exception has been caught " + e);
    }

    th3.start();
  }
}
