package Interview.Recro.Enum;

public class EnumTest {

  enum weeks{
    SUNDAY,
    MONDAY,
    TUESDAY;
  }
  public static void main(String[] args) {
    String day_meeting_to_scheduled = "Monday";
    weeks day_meeting_to_scheduled2 = weeks.MONDAY;

    switch(day_meeting_to_scheduled2){
      case MONDAY:
        System.out.println("Monday it is obviously");
        break;
      default:
        System.out.println("Default");
    }
  }
}
