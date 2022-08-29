package important_stuffs.fileReading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuilderFOrNx2RepositoryPattern {
  public static void main(String[] args) {
    String str = "private String id;\n" +
      "  private String facility;\n" +
      "  private String amCareplanUniqueId;\n" +
      "  private long episodeNumber;\n" +
      "  private String externalPatid;\n" +
      "  private String interfaceVendorId;\n" +
      "  private String interfaceVendorName;\n" +
      "  private String interfaceVendorType;\n" +
      "  private String joinResultHeader;\n" +
      "  private String joinResultHeaderDetail;\n" +
      "  private String joinResultHeaderNote;\n" +
      "  private String oeOrderUniqueId;\n" +
      "  private String patid;\n" +
      "  private String additives;\n" +
      "  private String agencyAddr1;\n" +
      "  private String agencyAddr2;\n" +
      "  private String agencyCity;\n" +
      "  private String agencyName;\n" +
      "  private String agencyState;\n" +
      "  private String agencyZip;\n" +
      "  private String bodySiteCode;\n" +
      "  private String bodySiteValue;\n" +
      "  private String callBackAltEmail;\n" +
      "  private String callBackAltPhone;\n" +
      "  private String callBackAltPhoneAll;\n" +
      "  private String callBackEmail;\n" +
      "  private String callBackPhoneAll;\n" +
      "  private String callBackPhoneNumber;\n" +
      "  private String collectionVolume;\n" +
      "  private String collectorsComment;\n" +
      "  private String componentDelimiter;\n" +
      "  private String cptCode;\n" +
      "  private String dataEntryBy;\n" +
      "  private String dataEntryByOption;\n" +
      "  private java.sql.Date dataEntryDate;\n" +
      "  private String dataEntryOffset;\n" +
      "  private String dataEntrySource;\n" +
      "  private String dataEntryTime;\n" +
      "  private java.sql.Time dataEntryTimeJ;\n" +
      "  private String dataEntryTimezoneInfoAll;\n" +
      "  private String dataEntryTimezoneShort;\n" +
      "  private String dataEntryUserId;\n" +
      "  private String dataEntryUserName;\n" +
      "  private java.sql.Timestamp dataEntryUtc;\n" +
      "  private java.sql.Date dateOfTransaction;\n" +
      "  private String diagnosticServiceCode;\n" +
      "  private String diagnosticServiceValue;\n" +
      "  private long displayTypeCode;\n" +
      "  private String displayTypeValue;\n" +
      "  private java.sql.Date endDate;\n" +
      "  private String endTime;\n" +
      "  private String fieldDelimiter;\n" +
      "  private String fillerField1;\n" +
      "  private String fillerOrderNumber;\n" +
      "  private String fillerOrderNumberAll;\n" +
      "  private String handlingAltCode;\n" +
      "  private String handlingAltCodeTyp;\n" +
      "  private String handlingAltCodeVer;\n" +
      "  private String handlingAltValue;\n" +
      "  private String handlingCode;\n" +
      "  private String handlingCodeTyp;\n" +
      "  private String handlingCodeVer;\n" +
      "  private String handlingOrigText;\n" +
      "  private String handlingValue;\n" +
      "  private String labName;\n" +
      "  private String laboratoryAssignedId;\n" +
      "  private String lastModifiedDatetime;\n" +
      "  private String manualEntryFlag;\n" +
      "  private String nextOfKinInfo;\n" +
      "  private java.sql.Date observationEndDate;\n" +
      "  private String observationEndTime;\n" +
      "  private java.sql.Date orderDate;\n" +
      "  private String orderingFacAddrType;\n" +
      "  private String orderingFacAltEmail;\n" +
      "  private String orderingFacAltPhonAll;\n" +
      "  private String orderingFacAltPhone;\n" +
      "  private String orderingFacCity;\n" +
      "  private String orderingFacCountry;\n" +
      "  private String orderingFacCounty;\n" +
      "  private String orderingFacEmail;\n" +
      "  private String orderingFacilityName;\n" +
      "  private String orderingFacNameAll;\n" +
      "  private String orderingFacPhone;\n" +
      "  private String orderingFacPhoneAll;\n" +
      "  private String orderingFacState;\n" +
      "  private String orderingFacStreet;\n" +
      "  private String orderingFacStreet2;\n" +
      "  private String orderingFacZip;\n" +
      "  private String orderingProvAddrType;\n" +
      "  private String orderingProvCity;\n" +
      "  private String orderingProvCountry;\n" +
      "  private String orderingProvCounty;\n" +
      "  private String orderingProvider;\n" +
      "  private String orderingProviderAll;\n" +
      "  private String orderingProviderName;\n" +
      "  private String orderingProvState;\n" +
      "  private String orderingProvStreet;\n" +
      "  private String orderingProvStreet2;\n" +
      "  private String orderingProvZip;\n" +
      "  private String orderingPrvNotEnrolled;\n" +
      "  private String parentFillerNumber;\n" +
      "  private String parentFillerNumberAll;\n" +
      "  private String parentObservIdAll;\n" +
      "  private String parentObservIdCode;\n" +
      "  private String parentObservSubId;\n" +
      "  private String parentPlacerNumber;\n" +
      "  private String parentPlacerNumberAll;\n" +
      "  private String patientAccountNumber;\n" +
      "  private String patientId;\n" +
      "  private String patientInfo;\n" +
      "  private String payor;\n" +
      "  private String placerField1;\n" +
      "  private String placerGroupNumber;\n" +
      "  private String placerGroupNumberAll;\n" +
      "  private String placerNumberOut;\n" +
      "  private String placerOrderNumber;\n" +
      "  private String placerOrderNumberAll;\n" +
      "  private String programCode;\n" +
      "  private String programValue;\n" +
      "  private String reasonAltCode;\n" +
      "  private String reasonAltCodeType;\n" +
      "  private String reasonAltCodeVer;\n" +
      "  private String reasonAltValue;\n" +
      "  private String reasonCodeVer;\n" +
      "  private String reasonForTestCode;\n" +
      "  private String reasonForTestCodeType;\n" +
      "  private String reasonForTestValue;\n" +
      "  private String reasonOrigText;\n" +
      "  private java.sql.Date receivedDate;\n" +
      "  private String receivedFromApplication;\n" +
      "  private String receivedFromFacility;\n" +
      "  private String receivedTime;\n" +
      "  private String reflexTestCode;\n" +
      "  private String reflexTestValue;\n" +
      "  private String relevantClinicalInfo;\n" +
      "  private String relevantInfoAltCode;\n" +
      "  private String relevantInfoAltCodeTyp;\n" +
      "  private String relevantInfoAltCodeVer;\n" +
      "  private String relevantInfoAltValue;\n" +
      "  private String relevantInfoCodeTyp;\n" +
      "  private String relevantInfoCodeVer;\n" +
      "  private String relevantInfoOrigText;\n" +
      "  private String relevantInfoValue;\n" +
      "  private String repeatDelimiter;\n" +
      "  private String resultInterpreterAll;\n" +
      "  private String resultInterpreterName;\n" +
      "  private java.sql.Date resultRptChangeDate;\n" +
      "  private String resultRptChangeTime;\n" +
      "  private String resultsCopiedTo;\n" +
      "  private String resultsCopiedToAll;\n" +
      "  private String resultsEnteredBy;\n" +
      "  private String resultStatusCode;\n" +
      "  private String resultStatusValue;\n" +
      "  private String resultType;\n" +
      "  private String setId;\n" +
      "  private String specimenActionCode;\n" +
      "  private String specimenActionValue;\n" +
      "  private java.sql.Date specimenCollectionDate;\n" +
      "  private String specimenCollectionTime;\n" +
      "  private String specimenFreeText;\n" +
      "  private java.sql.Date specimenReceivedDate;\n" +
      "  private String specimenReceivedTime;\n" +
      "  private String specimenSourceCode;\n" +
      "  private String specimenSourceValue;\n" +
      "  private String specimenSrcDictCode;\n" +
      "  private String specimenSrcDictValue;\n" +
      "  private java.sql.Date startDate;\n" +
      "  private String startTime;\n" +
      "  private String subcomponentDelimiter;\n" +
      "  private String timeOfTransaction;\n" +
      "  private String universalSvcIdCode;\n" +
      "  private String universalSvcIdCodeAlt;\n" +
      "  private String universalSvcIdCodeTyp;\n" +
      "  private String universalSvcIdTypeAlt;\n" +
      "  private String universalSvcIdValAlt;\n" +
      "  private String universalSvcIdValue;\n" +
      "  private String univerSvcIdOrigText;\n" +
      "  private String univerSvcIdVer;\n" +
      "  private String univerSvcIdVerAlt;\n" +
      "  private long userRowAccessCode;\n" +
      "  private String vClientName;\n" +
      "  private String visitId;\n" +
      "  private String voidedBy;\n" +
      "  private String voidedByUserName;\n" +
      "  private java.sql.Date voidedDate;\n" +
      "  private String voidedTime;\n" +
      "  private String voidNote;";
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
