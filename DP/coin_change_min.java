package DP;
// https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
//https://leetcode.com/problems/coin-change/
public class coin_change_min {
    public static void main(String[] args) {
    int[] coins = new int[]{7,6,3,2};
    int target = 9;
    int[] cache = new int[target+1];
    cache[0] = 0;
    for(int i=1;i<cache.length;i++){
        cache[i] = Integer.MAX_VALUE;
    }
//        System.out.println(FindMin(coins,target,cache) == Integer.MAX_VALUE ? -1 : FindMin(coins,target,cache));


    // bottom up approach
    for(int i=1;i<=target;i++){
        for(int j=0;j<coins.length;j++){
            if(coins[j] <= i){
                cache[i] = Math.min(cache[i],cache[i-coins[j]]);
            }
        }
    }
        System.out.println(cache[target]);
    }

    private static int FindMin(int[] coins, int target,int[] cache){
        if(target == 0){
            return 0;
        }
        int min_ = Integer.MAX_VALUE;
        for(int coin : coins){ // for each coin we should check each and every possible coins
            int value = target - coin;
            if( value >= 0  && cache[value] != Integer.MAX_VALUE){
                return cache[value];
            }
            if(target - coin >= 0 ){
                int sub_min = FindMin(coins,target-coin,cache);
                if( min_ > sub_min && sub_min != -1){
                    min_ = sub_min;
                }
            }
        }
        if(min_ != Integer.MAX_VALUE){
            cache[target] = min_+1;
        }
        return (min_ == Integer.MAX_VALUE) ? -1 :min_+1;
    }

}
