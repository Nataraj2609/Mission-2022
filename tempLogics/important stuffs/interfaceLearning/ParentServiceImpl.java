package important_stuffs.interfaceLearning;

public class ParentServiceImpl extends Object implements ParentService, HumanService{

  public static void main(String[] args) {
    ParentServiceImpl p = new ParentServiceImpl();
    p.fun();
  }

  @Override
  public void fun() {
    System.out.println(sayHello());
  }

  @Override
  public String sayHello() {
    return ParentService.super.sayHello();
  }
}