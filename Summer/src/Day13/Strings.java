package Day13;

import java.util.SplittableRandom;

public class Strings {
    public static void main(String[] args) {
        // String comparisons
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "Abc";

        // use "=="
        System.out.println(s1 == s2); // false, s1 point to stringPool, s2 is an object in heap
        System.out.println(s1 == s3); // true, both s1 and s3 point to stringpool

        // use .equals() or .equalsIgnoreCase()
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s4));//true


    }
}
