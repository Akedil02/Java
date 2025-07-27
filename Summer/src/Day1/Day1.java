package Day1;

import java.util.Scanner;
import java.lang.String;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String numstr = num + "";

        System.out.println(numstr.charAt(0));
        System.out.println(numstr.charAt(1));
        System.out.println(numstr.charAt(2));


    }
}
