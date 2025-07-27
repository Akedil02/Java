package Day14;

import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String s2 = new StringBuilder(s1).reverse().toString();


        System.out.println(s1.equals(s2));
    }
}
