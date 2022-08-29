package Interview.TCS;

import java.util.ArrayList;
import java.util.List;

public class StreamTester {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.name = "Nat";
    e1.age = 28;
    e1.salary = 14;
    Employee e2 = new Employee();
    e2.name = "Kalai";
    e2.age = 26;
    e2.salary = 18;
    Employee e3 = new Employee();
    e3.name = "Kowshik";
    e3.age = 25;
    e3.salary = 21;
    List<Employee> empList = new ArrayList<>();
    empList.add(e1);
    empList.add(e2);
    empList.add(e3);

    empList.stream().filter(emp -> emp.age > 25).map(emp -> emp.name).forEach(System.out::println);


  }
}
class Employee{
  String name;
  int age;
  int salary;
}
