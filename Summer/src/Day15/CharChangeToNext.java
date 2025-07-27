package Day15;

import java.util.Scanner;

public class CharChangeToNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter a string: ");
        String s = sc.next();

        char[] chrs = s.toCharArray();

        int timeCount = 0;
        while (true){

            char first = chrs[0];

            for (int i = 0; i < chrs.length-1; i++) {
                chrs[i] = chrs[i+1];
            }

            chrs[chrs.length-1] = first;
            timeCount ++;

            String currentStr = new String(chrs);
            if(s.equals(currentStr)){
                System.out.println("True");
                System.out.println(timeCount);
                break;
            }

        }


    }
}
