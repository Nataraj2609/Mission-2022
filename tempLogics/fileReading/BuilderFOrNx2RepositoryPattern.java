package fileReading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuilderFOrNx2RepositoryPattern {
  public static void main(String[] args) {
    String str = "private String id;\n" +
      "  private String claimNumber;\n" +
      "  private Long facility;\n" +
      "  private String filenameId;\n" +
      "  private String joinToTxHistory;\n" +
      "  private String patid;\n" +
      "  private String version;\n" +
      "  private Long componentPosition837;\n" +
      "  private String consolidHcfaSort;\n" +
      "  private String dataEntryBy;\n" +
      "  private String dataEntryByOption;\n" +
      "  private LocalDate dataEntryDate;\n" +
      "  private String dataEntryTime;\n" +
      "  private String dataEntryUserId;\n" +
      "  private String dataEntryUserName;\n" +
      "  private String element837ErrorCode;\n" +
      "  private String element837ErrorDesc;\n" +
      "  private String elementBadData;\n" +
      "  private Long elementPosition837;\n" +
      "  private Long errorCounter;\n" +
      "  private Long fileIndex;\n" +
      "  private String fileIndex837;\n" +
      "  private Long fileLineNumber837;\n" +
      "  private Long fileStOffset837;\n" +
      "  private String gsCode;\n" +
      "  private String loop837Desc;\n" +
      "  private String loop837Id;\n" +
      "  private String medicalDiagSort;\n" +
      "  private String segment837Desc;\n" +
      "  private String segment837ErrorCode;\n" +
      "  private String segment837ErrorDesc;\n" +
      "  private String segment837Id;\n" +
      "  private String stCode;\n" +
      "  private String version837;\n" +
      "  private String xxIndex837;";
    printBuilder(str);
  }

  private static void printBuilder(String str) {
    List<String> strlist = new ArrayList<>();
    str = str.replaceAll("\n", ""); // Replacing newline with space
    Pattern p = Pattern.compile("\\w*;"); // Regex for strings ending with ; at last
    for (String word : str.split(" ")) {

      Matcher m = p.matcher(word);
      boolean isFieldName = m.matches();
      if (isFieldName) {
        word = word.replaceAll(";", "");
        String word2 = word;
        //Condition to replace serviceCode to service_code in getString()
        Pattern p2 = Pattern.compile("^(?=.*[A-Z]).+$");
        Matcher m2 = p2.matcher(word);
        boolean DoesContainsUpperCase = m2.matches();
        if(DoesContainsUpperCase) {
          String regex = "([a-z])([A-Z]+)";
          // Replacement string
          String replacement = "$1_$2";
          word2 = word
            .replaceAll(
              regex, replacement)
            .toLowerCase();
        }


        System.out.print("." + word + "(rs.getString(\"" + word2 + "\"))\n");
      }
    }
  }
}
