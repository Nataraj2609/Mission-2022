package Interview.Recro.ComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerMainApp {
  public static void main(String[] args) {
    Player p1 = new Player("Ronaldo", 2, "Portuguese", 37);
    Player p2 = new Player("Messi", 1, "Argentine", 34);
    Player p3 = new Player("Neymar", 3, "Brazil", 30);
    Player p4 = new Player("Senior Neymar", 4, "Brazil", 30);
    List<Player> playerList = new ArrayList<>();
    playerList.add(p1);
    playerList.add(p2);
    playerList.add(p3);
    playerList.add(p4);

    playerList.forEach(p -> System.out.println(p.getName()));
    Collections.sort(playerList, new PlayerComparatorByRanking());
    playerList.forEach(p -> System.out.println(p.getName()));

    System.out.println("----------------------------------------------------------------");

    Comparator<Player> byAge = Comparator.comparingInt(Player::getAge);
    Collections.sort(playerList, byAge);
    playerList.forEach(p -> System.out.println(p.getName()));
    System.out.println("----------------------------------------------------------------");

    Collections.sort(playerList, Comparator.comparing(Player::getName));
    playerList.forEach(p -> System.out.println(p.getName()));
    System.out.println("----------------------------------------------------------------");

    playerList.stream().sorted(Comparator.comparing(Player::getTeamName).reversed()).forEach(p -> System.out.println(p.getName()));
//    playerList.stream().sorted(Collections.reverseOrder()).forEach(p -> System.out.println(p.getName()));

    System.out.println("----------------------------------------------------------------");
    playerList.stream().sorted((pp1, pp2) -> {
      if (pp1.getAge() == pp2.getAge()) {
        return pp1.getName().compareTo(pp2.getName());
      } else if (pp1.getAge() > pp2.getAge()) {
        return 1;
      } else {
        return -1;
      }
    }).forEach(p -> System.out.println(p.getName()));

    System.out.println("----------------------------------------------------------------");
    playerList.stream().sorted(Comparator.comparing(Player::getAge)
      .thenComparing(Player::getRanking)
      .thenComparing(Player::getTeamName)).forEach(p -> System.out.println(p.getName()));
  }
}
