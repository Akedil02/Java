package Day5_综合练习;

import java.util.Random;
import java.util.Scanner;

public class JudgesScrolling {
    public static void main(String[] args) {
        Random r = new Random();

        int[] scores = new int[6];

        for (int i = 0; i < scores.length; i++) {
            int score = r.nextInt(101);
            scores[i] = score;
        }

        int result = 0;
        for(int i = 1; i < scores.length-1; i ++){
            result += scores[i];
        }

        System.out.println(result);


    }


}
