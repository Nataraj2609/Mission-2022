package Interview.FullForce.DataStructure.codingEverything.EducativeJava1.LLAssessment;

public class OverrideCheck {
  public static void main(String args[]) {
    base_class my_instance = new derived_class();
    my_instance.show();
  }
}

class base_class {
  public static void show() {
    System.out.println("Static or class method from the base class");
  }
}

class derived_class extends base_class {
  public static void show() {
    System.out.println("Static or class method from the derived class");
  }
}