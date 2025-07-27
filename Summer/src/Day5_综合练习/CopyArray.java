package Day5_综合练习;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] brr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
            System.out.print(brr[i]);
        }


    }
}
