package UC3;

import java.util.Random;

public class SnakeAndLadder {
    static void optionsCheck() {
        int playerPosition = 0;

        Random random = new Random();
        int rollTheDice = random.nextInt(6)+1;
        System.out.println("After rolling the dice : "+rollTheDice);

        int optionCheck = random.nextInt(3);

        if (optionCheck == 0) {
            System.out.println("No play : "+playerPosition);
        }
        else if (optionCheck == 1) {
            playerPosition += rollTheDice;
            System.out.println("Ladder : "+playerPosition);
        }
        else {
            playerPosition -=rollTheDice;
            System.out.println("Snake : "+playerPosition);
        }
    }
    public static void main(String[] args) {
        optionsCheck();
    }
}