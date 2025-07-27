package Day6;



import java.util.Scanner;

public class DigitsEncrypt {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int password = s.nextInt();
        int temp = password;
        int length = 0;
        while (password> 0){
            password /= 10;
            length++;
        }
        int[] passwordArr = new int[length];

        int index = passwordArr.length-1;
        while (temp > 0){
            passwordArr[index] = (temp % 10);
            temp /= 10;
            index--;
        }

        for (int i = 0; i < passwordArr.length; i++) {
            System.out.println(passwordArr[i]);
        }

        for (int i = 0; i < passwordArr.length; i++) {
            passwordArr[i] += 5;
            passwordArr[i] %= 10;
        }

        for (int i = 0, j = passwordArr.length-1; i < j; i++, j--) {
            int tempo = passwordArr[i];
            passwordArr[i] = passwordArr[j];
            passwordArr[j] = tempo;
        }

        int result = 0;
        for(int i : passwordArr){
            result = result *10 +i;
        }

        System.out.println(result);
    }
}
