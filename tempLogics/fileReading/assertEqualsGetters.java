package fileReading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class assertEqualsGetters {
  public static void main(String[] args) {
    String header = "PrimaryCareVisitLinksEntity";
    header = header.substring(0, 1).toLowerCase() + header.substring(1);
    String dbValues = "5,2,98,6,7,8,9,10,999,12,13,1,null,null";
    String str = " private String algUniqueId;\n" +
      "  private Integer dxUniqueId;\n" +
      "  private Integer facility;\n" +
      "  private String fmhUniqueId;\n" +
      "  private String hrsUniqueId;\n" +
      "  private String mdmUniqueId;\n" +
      "  private String mdpUniqueId;\n" +
      "  private String notUniqueId;\n" +
      "  private String patId;\n" +
      "  private String phyUniqueId;\n" +
      "  private String plUniqueId;\n" +
      "  private Integer primaryCareVisitId;\n" +
      "  private String uniqueRowIndex;\n" +
      "  private String typeOfLink;";
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