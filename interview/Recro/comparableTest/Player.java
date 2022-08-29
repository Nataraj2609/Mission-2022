package Interview.Recro.comparableTest;

public class Player implements Comparable<Player>{
  String name;
  int ranking;
  String teamName;

  @Override
  public int compareTo(Player anotherPlayer) {
    return Integer.compare(getRanking(), anotherPlayer.getRanking());
  }

  public Player(String name, int ranking, String teamName) {
    this.name = name;
    this.ranking = ranking;
    this.teamName = teamName;
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
