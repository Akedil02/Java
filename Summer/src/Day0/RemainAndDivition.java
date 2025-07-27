package Day0;

import java.util.Scanner;

public class RemainAndDivition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int times = 0;
        while(a > b){
            a = a - b;
            times ++;
        }

        System.out.println(times);
        System.out.println(a);
    }

}
