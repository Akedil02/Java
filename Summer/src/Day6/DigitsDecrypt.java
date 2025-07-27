package Day6;

import Day0.S;

import java.util.Scanner;

public class DigitsDecrypt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;

        int length = 0;
        while(temp > 0){
            temp /= 10;
            length++;
        }

        int[] numArray = new int[length];

        int index = length-1;
        while (num > 0){
            numArray[index] = num%10;
            num /= 10;
            index--;
        }

        for(int i = 0, j = length-1; i < j; i++, j--){
            int tempo = numArray[i];
            numArray[i] = numArray[j];
            numArray[j] = tempo;
        }

        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] < 5){
                numArray[i] += 10;
            }
        }

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] -= 5;
        }


        for(int i : numArray){
            System.out.println(i);
        }

    }
}
