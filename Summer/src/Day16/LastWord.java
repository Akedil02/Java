package Day16;

public class LastWord {
    public static void main(String[] args) {
        String s = "Hello my world";
        String[] srr = s.split(" ");

        for (int i = 0; i < srr.length; i++) {
            System.out.println(srr[i]);
        }

        System.out.println(srr[srr.length-1]);
    }
}
