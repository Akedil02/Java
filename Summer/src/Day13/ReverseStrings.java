package Day13;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter a test String: ");
        String testStr = sc.next();

        String newStr = reverseString(testStr);
        System.out.println(newStr);

    }

    public static String reverseString(String s){
        String s2 = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            s2 += s.charAt(i);
        }
        return s2;
    }


}
