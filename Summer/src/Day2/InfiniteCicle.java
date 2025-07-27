package Day2;

import java.util.List;

public class InfiniteCicle {

    public static void main(String[] args) {

        int[] arr = {33,5,22,44,55};


        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i = 1; i< arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
}}
