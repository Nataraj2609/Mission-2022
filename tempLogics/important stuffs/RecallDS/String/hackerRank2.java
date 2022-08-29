package important_stuffs.RecallDS.String;

public class hackerRank2 {
  public static void main(String[] args) {
    System.out.println(viralAdvertising(5));
  }

  public static int viralAdvertising(int day) {
    int people = 5;
    int sum = 0;

    for(int i = 0; i < day; i++){
      people = (int) Math.floor(people/2);
      sum += people;
      people *= 3;
    }
    return sum;
  }
}
