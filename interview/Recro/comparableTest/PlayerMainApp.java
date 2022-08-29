package Interview.Recro.comparableTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerMainApp {
  public static void main(String[] args) {
    Player p1 = new Player("Ronaldo", 2, "Portuguese");
    Player p2 = new Player("Messi", 1, "Argentine");
    Player p3 = new Player("Neymar", 3, "Brazil");
    List<Player> playerList = new ArrayList<>();
    playerList.add(p1);
    playerList.add(p2);
    playerList.add(p3);

    playerList.forEach(p -> System.out.println(p.getName()));

    Collections.sort(playerList);
    playerList.forEach(p -> System.out.println(p.getName()));

  }
}
