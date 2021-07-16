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

    public void rollAll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public void rollSome(List<Integer> diceToRoll) {
        for (int i = 0; i < dice.length; i++) {

            for (int j = 0; j < diceToRoll.size(); j++) {

                if (i == diceToRoll.get(j)) {
                    dice[diceToRoll.get(j)].roll();
                }
            }
        }
    }
}
