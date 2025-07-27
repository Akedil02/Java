package Day4;

public class MethodTasks {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        interateArray(arr);
        System.out.println();
        System.out.println(returnMax(arr));

        System.out.println(elemSearch(arr,66));
    }

    public static void interateArray(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static int returnMax(int[] arr){

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean elemSearch(int[] arr, int elem){
        for (int i = 0; i < arr.length; i++) {
            if(elem == arr[i]){
                return true;
            }
        }
        return false;
    }


}
