package TableTopGames;

import java.util.Scanner;

public class Yahtzee {
    public void play(Player player) {
        Scanner scan = new Scanner(System.in);
        String diceToRoll;

        player.cup.addDice();
        player.cup.rollAll();
        Display.dice(player.cup);
        System.out.println("select dice you want to re-roll (1-5)");
        diceToRoll = scan.nextLine(); // "1 2 5"
        player.cup.rollSome(player.cup.selections(diceToRoll));
        Display.dice(player.cup);
        System.out.println("select dice you want to re-roll (1-5)");
        diceToRoll = scan.nextLine(); // "1 2 5"
        player.cup.rollSome(player.cup.selections(diceToRoll));
        Display.dice(player.cup);
        Turn.turnPass();
    }
}
