package Interview.FullForce.JavaConcepts;

import java.util.Optional;

public class OptionalLearning {
  public static void main(String[] args) {
    String str = null;
    Optional<String> s = Optional.of(Optional.ofNullable(str).orElse("John"));
    if (s.isPresent()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    s.ifPresent(n -> System.out.println(n));
    /**
     * isPresent() isEmpty()
     * ofNullable()
     * of() - will throw NPE if it is null and accessed
     * ifPresent() -> functional interface
     * orElse()
     * orElseGet() -> supplier interface "always use this one rather orElse
     */
  }
}
