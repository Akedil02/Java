package Day16;

import java.util.Random;

public class StrToRandomOrder {
    public static void main(String[] args) {
        String s = "abcdefg";
        Random r = new Random();

        char chrs[] = s.toCharArray();

        for (int i = chrs.length-1; i > 0; i--) {
            int index = r.nextInt(i+1);
            char temp = chrs[i];
            chrs[i] = chrs[index];
            chrs[index] = temp;
        }

        String s1 = new String(chrs);
        System.out.println(s1);
    }
}
