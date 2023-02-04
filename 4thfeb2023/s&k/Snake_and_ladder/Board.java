package Snake_and_ladder;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class Board {
    Deque<Player> playersList = new LinkedList<>();
    Player winner = null;
    Dice dice = new Dice();
    Scanner in = new Scanner(System.in);
    Snakeandladder g = new Snakeandladder();
    void noOfPlayers(int count){
        for(int i = 0;i<count;i++){
            System.out.println("enter player name");
            String name = in.next();
            Player play = new Player(name,0); 
            playersList.add(play);   
        }
        this.startGame();
    }
    private Player findPlayerTurn() {

        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }
    public void startGame(){
        System.out.println(g.grid);

        while(winner == null) {

            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.Name + " current position is: " + playerTurn.currentPosition);

            //roll the dice
            int diceNumbers = dice.rollDice(3);

            //get the new position
            int playerNewPosition = playerTurn.currentPosition + diceNumbers;
            Snakeandladder sn = new Snakeandladder();
            sn.advanced(playerTurn, playerNewPosition);

            System.out.println("player turn is:" + playerTurn.Name + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= g.grid){

                winner = playerTurn;
            }
            

        }

        System.out.println("WINNER IS:" + winner.Name);
    }
    
}
