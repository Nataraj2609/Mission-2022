package Interview.Hexaware;

public class CoreCode implements needsRefactoring{
  @Override
  public String doNeedRefactoring() {
    return "Refactor the Code Base";
  }

  public static void main(String[] args) {
    CoreCode c = new CoreCode();
    System.out.println(c.doNeedRefactoring());
    System.out.println(new CoreCode().doNeedRefactoring());

    needsRefactoring obj = () -> {
      return "jsnajdnajsd";
    };
    System.out.println(obj.doNeedRefactoring());
  }
}
