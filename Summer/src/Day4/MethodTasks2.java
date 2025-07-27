package Day4;

public class MethodTasks2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88 , 99};
        int[] brr = copyArray(arr, 4,8);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+ "  ");
        }
    }

    public static int[] copyArray(int[] arr, int from, int to){

        int[] brr = new int[to-from];
        for(int i = from; i < to; i++){
            brr[i-from] = arr[i];
        }
        return brr;
    }


}
