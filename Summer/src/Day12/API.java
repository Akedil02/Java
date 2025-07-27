package Day12;

import java.util.Scanner;

public class API {
    public static void main(String[] args) {
        //little scanner api
        /*Scanner s = new Scanner(System.in);
        float f = s.nextFloat();
        System.out.println(f);*/

        //String api

        //1.
        String s1 = "Hello world";
        String s2 = new String();
        String s3 = new String("Hello world");
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        byte[] bts = {127,99,12,-128};
        String s5 = new String(bts);

        System.out.println(s4);
        System.out.println(s5);


    }
}
