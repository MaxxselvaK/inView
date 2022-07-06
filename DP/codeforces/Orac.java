package DP.codeforces;
// https://codeforces.com/problemset/problem/1350/B

/*
In short given array, find max length of increasing subequence and the jth index should be divisible by ith index and arr[j] > arr[i]
*/

public class Orac {
    public static void main(String[] args) {
        int[] arr = new int[]{1 ,4 ,2 ,3 ,6 ,4 ,9};
        int n = arr.length;
        int[] dp = new int[n];
        int ans = 1;
        dp[0] = 1;
        for(int i=1;i<n;i++){
            for(int j=0; j< i;j++){
                if((i+1)%(j+1) == 0){
                    if(arr[i] > arr[j]){
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(ans);
    }
}
