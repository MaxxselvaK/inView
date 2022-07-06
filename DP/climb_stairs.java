package DP;

public class climb_stairs {
    // https://leetcode.com/problems/climbing-stairs/
    static int[] dp = new int[5+1];
    public static void main(String[] args) {
        int no_of_steps = 5;
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(findUniqueWaysItr(no_of_steps));
    }
    // bottom up approach (iterative)
    private static int findUniqueWaysItr(int no_of_steps) {
        for(int i=2;i<=no_of_steps;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[no_of_steps];
    }
    // top down approach (recursive)
    private static int findUniqueWays(int no_of_steps) {
        if(dp[no_of_steps] != 0){
            return dp[no_of_steps];
        }
        if(no_of_steps > 1){
            dp[no_of_steps] = findUniqueWays(no_of_steps - 1) + findUniqueWays(no_of_steps - 2);
        }
        return dp[no_of_steps];
    }
}
