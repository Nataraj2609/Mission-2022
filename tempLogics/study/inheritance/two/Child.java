package study.inheritance.two;

class Parent {
  void m1()
  {
    System.out.println("From parent m1()");
  }

  void m2()
  {
    System.out.println("From parent  m2()");
  }
}

class Child extends Parent {
  @Override
    // no issue while throwing unchecked exception
  void m1() throws ArithmeticException
  {
    System.out.println("From child m1()");
  }

  @Override
    // compile-time error
    // issue while throwin checked exception
  void m2()
  {
    System.out.println("From child m2");
  }
}