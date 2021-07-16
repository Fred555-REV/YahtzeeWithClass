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

        System.out.println("die " + die.value);
        die.roll();
        System.out.println("die " + die.value);

        cup.rollAll();

        for (int i = 0; i < 5; i++) {
            System.out.println("cup die " + (i + 1) + " = " + cup.dice[i].value);
        }

        List<Integer> diceToRoll = new ArrayList<>();
        diceToRoll.add(1);
        diceToRoll.add(3);


        Cup.rollSome(cup, diceToRoll);

        System.out.println("\nRolling second and fourth dice\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("cup die " + (i + 1) + " = " + cup.dice[i].value);
        }

    }
}
/*
    List<Integer> diceToRoll = new ArrayList<>();
        diceToRoll.add(1);
                diceToRoll.add(3);
                Cup.roll(cup, diceToRoll);*/
