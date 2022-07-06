package Sorting_and_Searching_Problems;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting2D {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1},{1,3},{1,2}};
        Arrays.sort(arr, 0, arr[0].length+1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]<=o2[1] == true ? 1 : -1;
            }
        });
        System.out.println(arr);

        for(int[] a: arr){
            for(int i: a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
