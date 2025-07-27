package Day6;

import Day0.S;

import java.util.Random;
import java.util.Scanner;

public class 双色球彩票 {
    public static void main(String[] args) {
        int[] jackpot = jackpot();
        int[] user = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.println("!!!JACKPOT!!!");
        for (int i = 0; i < jackpot.length; i++) {
            System.out.print(jackpot[i]+" ");
        }
        System.out.println();
        System.out.println("Enter your bet:");

        for (int i = 0; i < 7; i++) {
            int usersCode = s.nextInt();
            if(i < 6 && usersCode >= 0 && usersCode <= 33 && !contains(user, usersCode)){
                user[i] = usersCode;
            }
            else if(i == 6 && usersCode >= 0 && usersCode <= 16){
                user[i] = usersCode;
            }
            else {
                System.out.println("Your code is unlegal");
            }
        }

        System.out.println("Your Bet:");

        for (int i = 0; i < user.length; i++) {
            System.out.print(user[i] + " ");
        }

        int mached_red_ball = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(jackpot[i] == user[j]){
                    mached_red_ball++;
                    break;
                }
            }
        }

        int mached_blue_ball = 0;
        if(user[6] == jackpot[6]){
            mached_blue_ball = 1;
        }

        System.out.println();
        if(mached_red_ball == 6 && mached_blue_ball == 1){
            System.out.println("Congratulations! Jackpot!");
        } else if (mached_red_ball == 6 && mached_blue_ball == 0) {
            System.out.println("2 prize");
        } else if (mached_red_ball == 5 && mached_blue_ball == 1) {
            System.out.println("3 prize");
        } else if ((mached_red_ball == 5 && mached_blue_ball == 0) || (mached_red_ball == 4 && mached_blue_ball == 1)) {
            System.out.println("4 prize");
        } else if ((mached_red_ball == 4 && mached_blue_ball == 0) || ((mached_red_ball == 3 || mached_red_ball == 2) && mached_blue_ball == 1)){
            System.out.println("5 prize");
        } else if ((mached_red_ball == 1 || mached_red_ball == 0) && mached_blue_ball == 1){
            System.out.println("6 prize");
        } else{
            System.out.println("Thanks for joining");
        }


    }

    public static int[] jackpot(){
        Random r = new Random();

        int[] arr = new int[7];

        for (int i = 0; i < 6;) {
            int red = r.nextInt(33)+1;

            if(!contains(arr, red)){
                arr[i] = red;
                i++;
            }
        }

        int blue = r.nextInt(16)+1;
        arr[6] = blue;

        return arr;
    }

    public static boolean contains(int[] arr, int num){
        for (int i = 0; i < 6; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
