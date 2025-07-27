package Day2;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        //Dinamic array of length 10
        int[] arr = new int[10];
        //New Random object
        Random R = new Random();

        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            int r = R.nextInt(100) + 1;
            arr[i] = r;
            sum += arr[i];
        }

        int avg = sum / arr.length;

        int numOfElemsLessThanAvg = 0;
        for(int i : arr){
            if(i < avg){
                numOfElemsLessThanAvg ++;
            }
        }


        for(int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(numOfElemsLessThanAvg);

    }
}
