package Interview.Recro.ComparatorTest;

public class Player {
  String name;
  int ranking;
  String teamName;
  int age;

  public Player(String name, int ranking, String teamName, int age) {
    this.name = name;
    this.ranking = ranking;
    this.teamName = teamName;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}
