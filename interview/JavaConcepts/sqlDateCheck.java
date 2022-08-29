package Interview.FullForce.JavaConcepts;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import javax.swing.table.TableModel;

public class sqlDateCheck {
  public static void main(String[] args) {
    Date sqlDate = Date.valueOf("2022-04-08");
    Date today = Date.valueOf(LocalDate.of(2022,04,8));
    System.out.println(sqlDate);
    System.out.println(today);

    if (sqlDate.equals(today)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    int ii = sqlDate.compareTo(today);
    System.out.println(ii);

    Time time = Time.valueOf("");
    System.out.println(time);
  }
}
