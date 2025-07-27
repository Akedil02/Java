package Day6;

import java.util.Random;

public class lottery {
    public static void main(String[] args) {
        int[] prizes = {2, 588, 889, 1000, 10000};
        Random r = new Random();
        for(int i = prizes.length-1; i> 0; i--){
            int j = r.nextInt(i+1);
            int temp = prizes[i];
            prizes[i] = prizes[j];
            prizes[j] = temp;
        }

        for(int i : prizes){
            System.out.println(i);
        }
    }
}
