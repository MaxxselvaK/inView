package Recursion;

import java.util.Arrays;

public class InvertArray {
    static void invert(int[] arr, int index){
        if(index < arr.length/2){
            int temp = arr[index];
            arr[index] = arr[arr.length-index-1];
            arr[arr.length-index-1] = temp;
            invert(arr,index+1);
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        invert(arr,0);

        System.out.println(Arrays.toString(arr));
    }
}
