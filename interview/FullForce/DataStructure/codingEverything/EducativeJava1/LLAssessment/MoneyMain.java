package Interview.FullForce.DataStructure.codingEverything.EducativeJava1.LLAssessment;

import java.util.Objects;

public class MoneyMain {
  public static void main(String[] args) {
    Money income = new Money(55,"USD");
    Money expenses = new Money(55,"USD");
    System.out.println(income.equals(expenses));
    System.out.println(income.equals(income));
    System.out.println(income.toString());
    System.out.println(income.hashCode());
    System.out.println(expenses.hashCode());
  }
}

class Money{
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode);
  }

  int amount;
  String currencyCode;

  public Money(int a, String c){
    this.amount = a;
    this.currencyCode = c;
  }
}
