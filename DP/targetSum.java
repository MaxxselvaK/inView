package DP;

public class targetSum {
    // https://leetcode.com/problems/target-sum/
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        int target = 3;
        solve(arr,target,0,0);
        System.out.println(count);
    }

    private static void solve(int[] arr, int target,int ans,int pos) {
        if(pos == arr.length && target == ans){
            count++;
        }
        if(pos == arr.length  && target!= ans){
            return;
        }
        //recurse
        for(int i=pos;i<arr.length;i++){
            solve(arr,target,ans-arr[i],i+1);
            solve(arr,target,ans+arr[i],i+1);
        }
    }
}
