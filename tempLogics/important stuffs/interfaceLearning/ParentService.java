package important_stuffs.interfaceLearning;

public interface ParentService {

  void fun();
  default String sayHello(){
    return "Hello World";
  }
}
