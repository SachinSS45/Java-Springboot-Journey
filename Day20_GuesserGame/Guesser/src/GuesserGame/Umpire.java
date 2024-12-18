package GuesserGame;

public class Umpire {

    int guesserNum;
    int playerNum1;
    int playerNum2;
    int playerNum3;

    public void collectNumFromGuesser(){
        Guesser g = new Guesser();
        guesserNum = g.guessNum();
    }

    public void collectNumFromPlayers(){

        Player p1 = new Player();
        playerNum1 = p1.guessNum();

        Player p2 = new Player();
        playerNum2 = p2.guessNum();

        Player p3 = new Player();
        playerNum3 = p3.guessNum();
    }

    void compare(){
        if(guesserNum == playerNum1){
            if(guesserNum == playerNum2 && guesserNum == playerNum3){
                System.out.println("All the players won the game");
            }else if(guesserNum == playerNum2){
                System.out.println("Player1 and Player2 won the game");
            }else if(guesserNum == playerNum3){
                System.out.println("Player1 and Player3 won the game");
            }else{
                System.out.println("Only Player1 won the game");
            }
        }else if(guesserNum == playerNum2) {
            if (guesserNum == playerNum3) {
                System.out.println("Player2 and Player3 won the game");
            } else {
                System.out.println("Only Player2 won the match");
            }
        }else if(guesserNum == playerNum3){
            System.out.println("Only Player3 won the game");
        }else{
            System.out.println("All player lost the game!!");
        }
    }
}
