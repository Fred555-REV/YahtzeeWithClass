
package TableTopGames;

import java.util.ArrayList;
import java.util.List;

public class Display {
    public static List<Player> players = new ArrayList<>();

    public static void players() {
        for (Player player : players) {
            System.out.println(player.name);
        }
    }

    public static void dice(Cup cup) {

        String output = "";
        for (Die die : cup.dice) {
            output += die.value + " ";
        }
        System.out.println(output.trim());

    }

    public static void score(Player player) {
        System.out.println(player.score);
    }

    public static void turn() {
        System.out.println(Turn.players.get(Turn.turnCounter).name + "'s turn");
    }

    public static void turnsLeft() {
        System.out.println(Turn.turnMax + " turns left in game");
    }
}
