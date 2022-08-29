package Interview.Recro.ComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2Example {
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
    System.out.println("----------------------------------------------------------------");

    System.out.println("Sorted base on Ranking");
    playerList.stream().sorted(Comparator.comparingInt(Player::getRanking)).map(o -> o.getName()).forEach(System.out::println);

    System.out.println("----------------------------------------------------------------");

    System.out.println("Sorted base on age, then Ranking");
    playerList.stream().sorted(Comparator.comparingInt(Player::getAge).thenComparingInt(Player::getRanking)).map(o -> o.getName()).forEach(System.out::println);



  }
}
