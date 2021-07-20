package TableTopGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        // write your code here
        Yahtzee game = new Yahtzee();
        Turn.createPlayers();
        Turn.setTurns();
        while (Turn.turnMax != 0) {
            Turn.displayTurn();
            Turn.displayTurnsLeft();
            game.play(Turn.players.get(Turn.turnCounter));
        }
    }
}
/*
    List<Integer> diceToRoll = new ArrayList<>();
        diceToRoll.add(1);
                diceToRoll.add(3);
                Cup.roll(cup, diceToRoll);*/
