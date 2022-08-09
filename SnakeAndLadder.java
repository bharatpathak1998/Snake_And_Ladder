package UC7;

import java.util.Random;

public class SnakeAndLadder {
    static void playerWin() {
        int winningPosition = 100;
        int playerPosition1 = 0;
        int playerPosition2 = 0;
        int moves = 0;
        Random random = new Random();

        while ((playerPosition1 != winningPosition) && (playerPosition2 != winningPosition)) {
            moves++;

            int rollTheDice1 = random.nextInt(6) + 1;
            int rollTheDice2 = random.nextInt(6) + 1;
            System.out.println("Player1 after rolling the dice : " + rollTheDice1);
            System.out.println("Player2 after rolling the dice : " + rollTheDice2);

            int optionCheck1 = random.nextInt(3);
            int optionCheck2 = random.nextInt(3);
            //Condition for first player
            if (optionCheck1 == 0) {
                System.out.println("Player1 No play : " + playerPosition1);
            } else if (optionCheck1 == 1) {
                if (playerPosition1 + rollTheDice1 > winningPosition) {
                    playerPosition1 -= rollTheDice1;
                    System.out.println("Player1 Ladder : " + playerPosition1);
                } else {
                    playerPosition1 += rollTheDice1;
                    System.out.println("Player1 Ladder : " + playerPosition1);
                }
            } else {
                playerPosition1 -= rollTheDice1;
                if (playerPosition1 < 0)
                    playerPosition1 = 0;
                System.out.println("Player1 Snake : " + playerPosition1);
            }
            //Condition for second player
            if (optionCheck2 == 0) {
                System.out.println("Player2 No play : " + playerPosition2);
            } else if (optionCheck2 == 1) {
                if (playerPosition2 + rollTheDice2 > winningPosition) {
                    playerPosition2 -= rollTheDice2;
                    System.out.println("Player2 Ladder : " + playerPosition2);
                } else {
                    playerPosition2 += rollTheDice2;
                    System.out.println("Player2 Ladder : " + playerPosition2);
                }
            } else {
                playerPosition2 -= rollTheDice2;
                if (playerPosition2 < 0)
                    playerPosition2 = 0;
                System.out.println("Player2 Snake : " + playerPosition2);
            }
        }
        System.out.println("Final position of player1 : " + playerPosition1);
        System.out.println("Final position of player2 : " + playerPosition2);
        System.out.println("Number Of Total Moves : "+moves);

        if(playerPosition1 > playerPosition2) {
            System.out.println("Player1 Win The Game");
        } else {
            System.out.println("Player2 Win The Game");
        }
    }
    public static void main(String[] args) {
        playerWin();
    }
}
