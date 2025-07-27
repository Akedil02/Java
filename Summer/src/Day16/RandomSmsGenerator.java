package Day16;

import java.util.Random;

public class RandomSmsGenerator {
    public static void main(String[] args) {
        char[] chrs = new char[5];
        Random r = new Random();

        int RamdomDigitIndex = r.nextInt(5);

        for (int i = 0; i < chrs.length; i++) {
            if(i == RamdomDigitIndex){
                chrs[i] = (char)('0' + r.nextInt(10));
            }else {
                boolean b = r.nextBoolean();
                if(b){
                    chrs[i] = (char)('a' + r.nextInt(26));
                }else {
                    chrs[i] = (char)('A' + r.nextInt(26));
                }
            }

        }

        String s = new String(chrs);
        System.out.println(s);




    }
}
