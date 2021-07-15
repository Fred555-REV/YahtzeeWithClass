package TableTopGames;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void main(String[] args) {
        // write your code here
        Die die = new Die();
        Cup cup = new Cup(5);
        for (int i = 0; i < 5; i++) {
            Cup.addDice(cup, new Die(), i);
        }

    }
}
/*
    List<Integer> diceToRoll = new ArrayList<>();
        diceToRoll.add(1);
                diceToRoll.add(3);
                Cup.roll(cup, diceToRoll);*/
