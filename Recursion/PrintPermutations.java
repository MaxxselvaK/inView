package Recursion;

import java.util.Arrays;
// Time Complexity O(n*n!)
public class PrintPermutations {
    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   static void printAllPerm(char[] chars,int length){

        if(length == 1){
            System.out.println(Arrays.toString(chars));
            return;
        }

        for(int i=0;i<length;i++){
            // do
            swap(chars,i,length-1);
            // recurse
            printAllPerm(chars,length-1);
            // backtrack
            swap(chars,i,length-1);

        }

    }
    public static void main(String[] args) {
        printAllPerm("abc".toCharArray(),3);
    }
}
