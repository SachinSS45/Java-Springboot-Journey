package GuesserGame;

import java.util.Scanner;

public class Guesser {
    int guesserNum;

    public int guessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser Guess your number : ");
        guesserNum = sc.nextInt();
        return guesserNum;
    }

}
