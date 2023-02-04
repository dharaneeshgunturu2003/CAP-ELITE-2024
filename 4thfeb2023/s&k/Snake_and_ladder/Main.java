package Snake_and_ladder;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("let's get Started");
        Board b = new Board();
        System.out.println("Enter No of Players");
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        b.noOfPlayers(count);
        Snakeandladder sandk = new Snakeandladder();
        sandk.addSnake(32,10);
        sandk.addSnake(34,6);
        sandk.addSnake(48,26);
        sandk.addSnake(62,18);
        sandk.addSnake(88,24);
        sandk.addSnake(95,56);
        sandk.addSnake(97,78);
        sandk.addLadder(1, 23);
        sandk.addLadder(4, 14);
        sandk.addLadder(8, 30);
        sandk.addLadder(28, 76);
        sandk.addLadder(21, 42);
        sandk.addLadder(50, 67);
        sandk.addLadder(71, 92);
        sandk.addLadder(88, 99);

    }

}
