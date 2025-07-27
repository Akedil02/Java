package Day13;

public class ConcateStrings {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "[";

        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
            if(i != arr.length-1){
                s+= ",";
            }
        }
        s += "]";

        System.out.println(s);

    }
}
