package Day5_综合练习;

import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        Random r = new Random();

        char[] crr = new char[5];

        for(int i = 0; i< 4; i++){
            if(r.nextBoolean()){
                crr[i] = (char)(65/*'A'*/ + r.nextInt(26));
            }
            else{
                crr[i] = (char)('a'/*97*/ + r.nextInt(26));
            }
            //(char) method is necessary cause  In Java, char + int = int

        }
        crr[4] = (char)('0' + r.nextInt(10));




        for(int i = crr.length-1; i > 0; i--){
            int j = r.nextInt(i+1); // Only change with elems before it and itself
            char temp = crr[i];
            crr[i] = crr[j];
            crr[j] = temp;
        }

        for(char c : crr){
            System.out.print(c);
        }




    }
}
