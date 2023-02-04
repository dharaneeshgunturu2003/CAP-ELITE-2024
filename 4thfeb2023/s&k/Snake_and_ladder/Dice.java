package Snake_and_ladder;


import java.util.concurrent.ThreadLocalRandom;

// interface rollDice{
//     int diceCount(int i);
// }
// public class Dice implements rollDice{
//     int min = 1;
//     int max = 6;
//     public int diceCount(int i){
//         int sum = 0;
//         while(i != 0){ 
//         int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
//         sum += randomNum;
//         i--;
//         }
//         return sum;
//     }
// }



public class Dice {
    int diceCount;
    int min = 1;
    int max =6;
    public int rollDice(int diceCount){

        int sum=0;
        int diceUsed=0;

        while(diceUsed<diceCount){

            sum += ThreadLocalRandom.current().nextInt(min,max+1);
            diceUsed++;
        }

        return sum;
    }
}
