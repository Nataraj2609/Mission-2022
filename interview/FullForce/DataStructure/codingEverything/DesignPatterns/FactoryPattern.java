package Interview.FullForce.DataStructure.codingEverything.DesignPatterns;

interface Person {
  void wish(String message);
}

class Male implements Person {
  @Override
  public void wish(String message) {
    System.out.println("Male class" + " " + message);
  }
}

class Female implements Person {
  @Override
  public void wish(String message) {
    System.out.println("Female class" + " " + message);
  }
}

class PersonFactory {
  public static Person create(String message) {
    if (message == "Male")
      return new Male();
    else
      return new Female();
  }
}

class Test {
  public static void main(String[] args) {
    Person p = PersonFactory.create("Male");
    p.wish("Hello!");
  }
}