package Interview.FullForce.DataStructure.codingEverything.abstractClasses;

public interface BaseInterfaceRepo {
  int a = 10;
  void printRepo();

  default void hasId() {
    System.out.println("BaseInterfaceRepo #9999");
  }
}
