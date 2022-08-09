package UC6;

import java.util.Random;

public class SnakeAndLadder {
    static void exactWin() {
        int winningPosition = 100;
        int playerPosition = 0;
        int moves = 0;
        Random random = new Random();

        while (playerPosition != winningPosition) {
            moves++;

            int rollTheDice = random.nextInt(6)+1;
            System.out.println("After rolling the dice : "+rollTheDice);

            int optionCheck = random.nextInt(3);

            if (optionCheck == 0) {
                System.out.println("No play : "+playerPosition);
            }
            else if (optionCheck == 1) {
                if (playerPosition+rollTheDice > winningPosition) {
                    playerPosition -= rollTheDice;
                    System.out.println("Ladder : "+playerPosition);
                } else {
                    playerPosition += rollTheDice;
                    System.out.println("Ladder : "+playerPosition);
                }
            }
            else {
                playerPosition -= rollTheDice;
                if (playerPosition < 0)
                    playerPosition = 0;
                System.out.println("Snake : "+playerPosition);
            }
        }
        System.out.println("Number Of Total Moves : "+moves);
    }
    public static void main(String[] args) {
        exactWin();
    }

}