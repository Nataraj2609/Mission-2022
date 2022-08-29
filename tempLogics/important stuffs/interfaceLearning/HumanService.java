package important_stuffs.interfaceLearning;

public interface HumanService{

  default String sayHello(){
    return "I am a Human";
  }
}
