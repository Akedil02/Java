package Day3;

public class OverLoad {
    public static void main(String[] args) {
        compare(2,3);
    }

    public static void compare(byte b1, byte b2){
        System.out.println(b1 == b2);
    }
    public static void compare(int i1, int i2){
        System.out.println(i1 == i2);
    }
    public static void compare(short s1, byte s2){
        System.out.println(s1 == s2);
    }
    public static void compare(long l1, long l2){
        System.out.println(l1 == l2);
    }
}
