package TableTopGames;

import java.util.List;

public class Cup {
    Die[] dice;

    public Cup(int diceAmount) {
        this.dice = new Die[diceAmount];
    }

    public static void addDice(Cup cup, Die die, int index) {
        cup.dice[index] = die;
    }

    public static void roll(Cup cup, List<Integer> diceToRoll) {
        for (int i = 0; i < cup.dice.length; i++) {

            for (int j = 0; j < diceToRoll.size(); j++) {

                if (i == diceToRoll.get(j)) {
                    cup.dice[j].value = (int) Math.floor(Math.random() * cup.dice[j].numberOfSides) + 1;
                }
            }
        }
    }
}
