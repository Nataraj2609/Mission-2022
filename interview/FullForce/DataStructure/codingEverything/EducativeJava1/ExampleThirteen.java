package Interview.FullForce.DataStructure.codingEverything.EducativeJava1;
class PrimitiveType {
  byte age;
  byte height;
  void printState() {
    System.out.println("The age of the object is: " + age + ". The height is : " + height);
  }
}

class WrapperClassExample {
  Byte numberOne;
  Byte numberTwo;
  void printingState() {
    System.out.println("The number one is : " + numberOne + ". The number two is : " + numberTwo);
  }
}

class AnotherClass {
  String anotherName = "Alina";
}

class ReferenceType {
  String nameOne = "John";
  String nameTwo;
  AnotherClass anotherClass;

  void givingOutput() {
    System.out.println("The first name is : " + nameOne + ". The second name is : " + nameTwo + ". " +
      "Here is another class object: " + anotherClass);
  }
}

public class ExampleThirteen {

  public static void main(String[] args){
    byte firstNumber;
    byte secondNumber = 1;
    firstNumber = secondNumber;
    System.out.println("The value of first number : " + firstNumber);
    System.out.println("The value of second number : " + secondNumber);
    secondNumber = 2;
    System.out.println("The value of first number : " + firstNumber);
    System.out.println("The value of second number : " + secondNumber);

    PrimitiveType objectOne = new PrimitiveType();
    objectOne.height = objectOne.age;
    objectOne.printState();;
    objectOne.height = 2;
    objectOne.printState();

    WrapperClassExample objectTwo = new WrapperClassExample();
    objectTwo.printingState();
    objectTwo.numberOne = 1;
    objectTwo.numberTwo = objectTwo.numberOne;
    objectTwo.printingState();
    objectTwo.numberOne = 2;
    objectTwo.printingState();

    ReferenceType objOne = new ReferenceType();
    AnotherClass objThree = new AnotherClass();
    objOne.givingOutput();
    objOne.nameTwo = objOne.nameOne;
    objOne.givingOutput();
    objOne.nameOne = "SS";
    objOne.givingOutput();
    objThree.anotherName = objOne.nameOne;
    System.out.println(objThree.anotherName);
    objThree.anotherName = "AA";
    objOne.givingOutput();
  }
}