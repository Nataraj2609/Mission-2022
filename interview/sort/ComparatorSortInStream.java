package Interview.FullForce.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorSortInStream {
  public static void main(String[] args) {
    Emp e1 = new Emp("Zelensiki", "Cena");
    Emp e4 = new Emp("Yanasaki", "Cena");
    Emp e2 = new Emp("Nataraj", "M");
    Emp e3 = new Emp("kalai", "Selvan");
    //    List<Emp> empList = Stream.of(e3, e1, e2, e4).collect(Collectors.toList());
    //    empList.forEach(e -> System.out.println(e.firstName + " " + e.lastName));

    //    List<Emp> empListSorted = Stream.of(e3, e1, e2, e4).sorted(Comparator.comparing(Emp::getLastName)).collect(Collectors.toList());
    List<Emp> empListSorted = Stream.of(e3, e1, e2, e4)
      .sorted(Comparator.comparing(Emp::getLastName).thenComparing(Emp::getFirstName))
      .collect(Collectors.toList());
    empListSorted.forEach(e -> System.out.println(e.firstName + " " + e.lastName));

    Comparator comparingLastThenFirstName = (o1, o2) -> {
      Emp oo1 = (Emp) o1;
      Emp oo2 = (Emp) o2;
      int res = oo1.getLastName().compareTo(oo2.getLastName());
      if( res != 0)
        return res;
      return oo1.getFirstName().compareTo(oo2.getFirstName());
    };

    List<Emp> empListSorted2 = Stream.of(e3, e1, e2, e4)
      .sorted(Comparator.comparing(Emp::getLastName).reversed())
      .collect(Collectors.toList());
    empListSorted2.forEach(e -> System.out.println(e.firstName + " " + e.lastName));
  }
}


class Emp {
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  String firstName;
  String lastName;

  public Emp(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}