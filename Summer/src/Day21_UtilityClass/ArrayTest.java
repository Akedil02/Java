package Day21_UtilityClass;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15};

        ArrayUtil.printArr(arr);

        float avg = ArrayUtil.getAverage(arr);
        System.out.println(avg);
    }
}
