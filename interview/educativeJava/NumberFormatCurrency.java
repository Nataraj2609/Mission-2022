package Interview.FullForce.educativeJava;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatCurrency {
  public static void main(String[] args) {

    BigDecimal inr_amount = new BigDecimal("5800000.09");

    Locale ind_locale = new Locale("en", "in");
    NumberFormat inr_format = NumberFormat.getCurrencyInstance(ind_locale);
    System.out.println(inr_format.format(inr_amount));


  }
}
