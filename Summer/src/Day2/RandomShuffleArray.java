package Day2;

import java.util.Random;

public class RandomShuffleArray {
    public static void main(String[] args) {

        int [] arr =new int[5];
        Random r = new Random();

        for(int i = 0; i< arr.length; i++){
            arr[i] = r.nextInt(100)+1;
        }

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+ " ");

        }

        System.out.println(System.lineSeparator());

        for(int i = 0;i< arr.length; i++){
            int j = r.nextInt(i,arr.length);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+ " ");
        }




    }
}
