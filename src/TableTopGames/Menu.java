package TableTopGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        // write your code here
        Cup cup = new Cup(5);
        Scanner scan = new Scanner(System.in);
        String diceToRoll;

        cup.addDice();
        cup.rollAll();
        Display.dice(cup);
        System.out.println("select dice you want to re-roll (1-5)");
        diceToRoll = scan.nextLine(); // "1 2 5"
        cup.rollSome(cup.selections(diceToRoll));
        Display.dice(cup);
        System.out.println("select dice you want to re-roll (1-5)");
        diceToRoll = scan.nextLine(); // "1 2 5"
        cup.rollSome(cup.selections(diceToRoll));
        Display.dice(cup);

    }
}
/*
    List<Integer> diceToRoll = new ArrayList<>();
        diceToRoll.add(1);
                diceToRoll.add(3);
                Cup.roll(cup, diceToRoll);*/
