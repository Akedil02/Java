package Day13;

import java.util.Scanner;

public class IterateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter a String: ");

        String s = sc.next();

        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int Digits = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= 90 && s.charAt(i) >= 65){ //s.charAt(i) <= 'Z' && s.charAt(i) >= 'A';
                upperCaseLetters++;
            } else if (s.charAt(i) <= 57 && s.charAt(i) >=48) { //s.charAt(i) <= '9' && s.charAt(i) >= '0';
                Digits++;
            } else if (s.charAt(i) <= 122 && s.charAt(i) >= 97) { //s.charAt(i) <= 'z' && s.charAt(i) >= 'a';
                lowerCaseLetters++;
            }
        }

        System.out.println(upperCaseLetters + " uppercase letters.");
        System.out.println(lowerCaseLetters + " lowercase letters.");
        System.out.println(Digits + " digits.");

    }
}
