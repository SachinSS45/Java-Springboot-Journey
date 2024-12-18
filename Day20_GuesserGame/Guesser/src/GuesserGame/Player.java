package GuesserGame;

import java.util.Scanner;

public class Player {
    int playerNum;

    public int guessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player Guess your number : ");
        playerNum = sc.nextInt();
        return playerNum;
    }
}
