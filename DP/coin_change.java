package DP;
//https://www.geeksforgeeks.org/coin-change-dp-7/
public class coin_change {
    //recursive approach without dp
//    static int no_of_coins = 0;
    // no of ways we can generate the target
    static  int makeChange(int[] coins,int money,int pos){
        if(money == 0){
            return 1;
        }
        if(money < 0){
            return 0;
        }
        if(pos >=  coins.length && money >= 1){
            return 0;
        }
        return   coin_change.makeChange(coins,money-coins[pos],pos) +
         coin_change.makeChange(coins,money,pos+1);
    }
    public static void main(String[] args) {
        int[] coins = new int[]{7,2,1};
        int target =11;
        System.out.println(makeChange(coins,target,0));
    }
}
