package Snake_and_ladder;
import java.util.HashMap;
import java.util.Map;

public class Snakeandladder {
    public int grid;
    Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer, Integer> ladder = new HashMap<>();
    int winingPositon;

    public void addSnake(int head, int tail) {
        snake.put(head, tail);
    }

    public void addLadder(int start, int end) {
        ladder.put(start, end);
    }

    void setWiningPositon(int positon) {
        winingPositon = positon;
    }

    void setGrid(int size) {
        grid = size;
    }

    public Snakeandladder() {
        grid = 100;
        winingPositon = 100;
    }

    public void advanced(Player user, int value) {
        if (user.currentPosition + value > grid) {
            return;
        }
        user.currentPosition += value;
        if (snake.get(user.currentPosition) != null) {
            System.out.println(" " + user.Name + " Ahhhhh snake!!!!!");
            user.currentPosition = snake.get(user.currentPosition);
        }
        if (ladder.get(user.currentPosition) != null) {
            System.out.println(" " + user.Name + " Hurrayyyy Ladder!!");
            user.currentPosition = ladder.get(user.currentPosition);
        }
    }

}
