package Interview.FullForce.DataStructure.codingEverything.EducativeJava1;

import java.util.Random;

/**
 * Demo class
 * @Param string
 */
public class Demo2 {
  public static void main(String[] args) {
    System.out.println(generateRandomPassword(17));
  }
  public static String generateRandomPassword(int len) {
    String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
      +"lmnopqrstuvwxyz!@#$%&";
    Random rnd = new Random();
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; i < len; i++)
      sb.append(chars.charAt(rnd.nextInt(chars.length())));
    return sb.toString();
  }
}
