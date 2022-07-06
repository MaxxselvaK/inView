package DP.knapsack;
import java.util.*;
/*
Suppose we have a knapsack which can hold int w = 10 weight units. 
We have a total of int n = 4 items to choose from, whose values are 
represented by an array int[] val = {10, 50, 40, 30} and weights
represented by an array int[] wt = {5, 4, 3, 6}.
*/
class knapsack_recursive{
    static int max_val_obtained;
//    int max_val_obtained = 0;
   static List<Integer> list = new ArrayList<>();
    static void solve(int[] val,int[] wt,int no_of_items,int max_weight,int curr_wt,int curr_val,int pos){

        if(curr_wt > max_weight){
            return;
        }

        if(curr_val > max_val_obtained){
            max_val_obtained = curr_val;
        }


        if(pos == no_of_items){
            return;
        }

            solve(val,wt,no_of_items,max_weight,curr_wt+wt[pos],curr_val+val[pos],pos+1);
            solve(val,wt,no_of_items,max_weight,curr_wt,curr_val,pos+1);
    }
    public static void main(String[] args){
        int[] val = {10,40,30,50};
        int[] wt = {5,4,6,3};
        int n = 4, max_weight = 10;
        solve(val,wt,n,max_weight,0,0,0);
        System.out.println("Max value we can obtain is "+max_val_obtained);
    }
}