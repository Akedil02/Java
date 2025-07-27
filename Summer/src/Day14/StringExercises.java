package Day14;

public class StringExercises {
    public static void main(String[] args) {
        //Substring

        String phoneNumber = "87713159717";

        String firstFour = phoneNumber.substring(0,4);
        String lastFour = phoneNumber.substring(7);

        String shieldNumber = firstFour + "***" + lastFour;

        System.out.println(shieldNumber);
    }
}
