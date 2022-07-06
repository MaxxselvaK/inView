package Array;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public class minMoves {
    static int solve(int[] arr){
        int ans=0;
        int min=Integer.MAX_VALUE,max=0;
        for(int i : arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        int mid = (min+max)/2;
        for(int i : arr){
            ans+=Math.abs(i-mid);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,10,2,9};
        System.out.println(solve(arr));
    }
}
