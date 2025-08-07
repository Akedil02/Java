package Day21_UtilityClass;

public class ArrayUtil {
    private ArrayUtil(){}

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static float getAverage(int[] arr){
        int avr = 0;
        for (int i : arr) {
            avr += i;
        }

        return (float) avr / arr.length;


    }
}
