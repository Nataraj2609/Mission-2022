package Interview.FullForce.educativeJava;

class Animal {

  //declare private members here
  private String name;
  private int age;

  void set_data(int a, String b) {
    //initialize members here
    this.age = a;
    this.name = b;
  }

  //implement getters here
  public Animal(){ }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

}

//define derived class named "Zebra" here
class Zebra extends Animal {
  String message_zebra(String str) {
    //define here
    str = "The zebra named "+ super.getName() +" is "+ super.getAge()  +" years old. The zebra comes from Africa";

    //update this when you write your code
    return str;
  }
}

//define derived class named "Dolphin" here

class Dolphin extends Animal {
  private String origin = "New Zealand";
  String message_dolphin(String str) {
    //define here
    str = "No code added yet"; //update this when you write your code
    return str + origin;
  }
}