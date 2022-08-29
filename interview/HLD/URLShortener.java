package Interview.FullForce.HLD;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class URLShortener {
  public static void main(String[] args) {

    String URL = "https://www.educative.io/courses/grokking-the-system-design-interview/m2ygV4E81AR#a.-Encoding-actual-URL";
    String user_name = "nat";

    URL += "_" + user_name;

    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] result = md.digest(URL.getBytes(StandardCharsets.UTF_8));
      String res = bytesToHex(result);
      System.out.println(res.substring(0,8));
      System.out.println("https://tinyurl.com/"+res.substring(0,8));

    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }

  }
  private static String bytesToHex(byte[] bytes) {
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
      sb.append(String.format("%02x", b));
    }
    return sb.toString();
  }
}
