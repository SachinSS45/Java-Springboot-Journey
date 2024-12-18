package GuesserGame;

public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("***************Start The Game****************");
        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayers();
        umpire.compare();
        System.out.println("***************End Of Game********************");
    }
}
