package TableTopGames;

import java.util.ArrayList;
import java.util.List;

public class Cup {
    Die[] dice;

    public Cup(int diceAmount) {
        this.dice = new Die[diceAmount];
    }

    public void addDice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }
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

    public List<Integer> selections(String diceToRoll) {
        String[] inputArr = diceToRoll.split(" "); // ["1", "2", "5"]
        // String[] -> List<Integer>
        List<Integer> selections = new ArrayList<>();
        for (String number : inputArr) {
            selections.add(Integer.parseInt(number) - 1);
        }

        return selections;
    }
}
