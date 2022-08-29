package Interview.FullForce.DataStructure.codingEverything.LLArrayString.Others;

public class ValidateIpAddress {
  public static String validateIPv4(String IP) {
    String[] nums = IP.split("\\.");
    for (String x : nums) {
      // Validate integer in range (0, 255):
      // 1. length of chunk is between 1 and 3
      if (x.length() == 0 || x.length() > 3) {
        return "Neither";
      }
      // 2. no extra leading zeros
      if (x.charAt(0) == '0' && x.length() != 1) {
        return "Neither";
      }
      // 3. only digits are allowed
      for (char ch : x.toCharArray()) {
        if (!Character.isDigit(ch)) {
          return "Neither";
        }
      }
      // 4. less than 255
      if (Integer.parseInt(x) > 255) {
        return "Neither";
      }
    }
    return "IPv4";
  }

  public static String validateIPv6(String IP) {
    String[] nums = IP.split(":");
    String hexdigits = "0123456789abcdefABCDEF";
    for (String x : nums) {
      // Validate hexadecimal in range (0, 2**16):
      // 1. at least one and not more than 4 hexdigits in one chunk
      if (x.length() == 0 || x.length() > 4) {
        return "Neither";
      }
      // 2. only hexdigits are allowed: 0-9, a-f, A-F
      for (Character ch : x.toCharArray()) {
        if (hexdigits.indexOf(ch) == -1) {
          return "Neither";
        }
      }
    }
    return "IPv6";
  }

  public static String validIPAddress(String IP) {
    if (IP.chars().filter(ch -> ch == '.').count() == 3) {
      return validateIPv4(IP);
    } else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
      return validateIPv6(IP);
    } else {
      return "Neither";
    }
  }

  public static void main(String[] args) {
    String queryIP1 = "172.16.254.1";
    String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
    String queryIP3 = "256.256.256.256";
    System.out.println(validIPAddress(queryIP1));
    System.out.println(validIPAddress(queryIP));
    System.out.println(validIPAddress(queryIP3));
  }
}