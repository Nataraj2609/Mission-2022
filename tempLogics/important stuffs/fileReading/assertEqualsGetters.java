package important_stuffs.fileReading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class assertEqualsGetters {
  public static void main(String[] args) {
    String header = "ResultsHeaderEntity";
    header = header.substring(0, 1).toLowerCase() + header.substring(1);
    String dbValues = "\"\",\"\",Unknown,,\"\",\"\",1";
    String str = "private String visitId;\n" +
      "  private String voidedBy;\n" +
      "  private String voidedByUserName;\n" +
      "  private java.sql.Date voidedDate;\n" +
      "  private String voidedTime;\n" +
      "  private String voidNote;\n" +
      "  private long id;";
    prepareGetters(header, str, dbValues);
  }

  private static void prepareGetters(String header, String str, String dbValues) {
    ArrayList<String> resultSet = new ArrayList<>();
    List<String> strlist = new ArrayList<>();
    str = str.replaceAll("\n", ""); // Replacing newline with space
    Pattern p = Pattern.compile("\\w*;"); // Regex for strings ending with ; at last
    for (String word : str.split(" ")) {

      Matcher m = p.matcher(word);
      boolean isFieldName = m.matches();

      if (isFieldName) {
        word = word.replaceAll(";", "");
        //        System.out.println(header + "." + "get" + word.substring(0, 1).toUpperCase() + word.substring(1) + "();");
        resultSet.add(header + "." + "get" + word.substring(0, 1).toUpperCase() + word.substring(1) + "()");
      }
    }
    prepareAssertions(resultSet, dbValues);
  }

  private static void prepareAssertions(ArrayList<String> resultSet, String dbValues) {
//    System.out.println(resultSet.toString());
    dbValues = dbValues.trim();
    String[] dbValuess = dbValues.split(",");
    int arrListIter = 0;

    for (String w : dbValuess) {
      if(!w.startsWith("\""))
        w = "\"" + w + "\"";
      System.out.println("assertEquals("+w+" ,"+resultSet.get(arrListIter++) + ");");

    }
  }
}