package important_stuffs.RecallDS.String;

public class RemoveSpecialChars{
  public static void main(String[] args) {
    String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";

    // similar to Matcher.replaceAll
    str = str.replaceAll("\\p{Punct}","");

    System.out.println(str);
  }
}
