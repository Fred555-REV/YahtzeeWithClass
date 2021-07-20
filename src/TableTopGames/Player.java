package TableTopGames;

public class Player {
    Cup cup;
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void getCup(int diceAmount) {
        this.cup = new Cup(diceAmount);
    }
}
