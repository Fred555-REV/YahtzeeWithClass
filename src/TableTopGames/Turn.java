package TableTopGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turn {
    public static int turnCounter = 0;
    public static List<Player> players = new ArrayList<>();

    public static int turnMax = 0;

    public static void createPlayers() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to YachtSea");
        System.out.println("How many players will there be?");
        int playerNum = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < playerNum; i++) {

            System.out.println("Enter name");
            String name = scan.next();

            Player player = new Player(name);
            Turn.addPlayer(player);
            player.getCup(5);
            player.cup.addDice();
        }
    }

    public static void addPlayer(Player player) {
        players.add(player);
    }

    public static void setTurns() {
        turnMax = 13 * players.size();
    }

    public static void turnPass() {
        if (turnCounter == players.size() - 1) {
            turnCounter = 0;
        } else {
            turnCounter++;
        }
        turnMax--;
    }

    public static void displayTurn() {
        System.out.println(players.get(turnCounter).name + "'s or ");
    }

    public static void displayTurnsLeft() {
        System.out.println(turnMax + " turns left in game");
    }
}
