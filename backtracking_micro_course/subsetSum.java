package backtracking_micro_course;

import java.util.ArrayList;
import java.util.List;

public class subsetSum {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,7,2,11,1,2};
        int target = 9;
        printSubsetSum(arr,9);
    }

    private static void printSubsetSum(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        findSum(arr,list,0,0,target);
    }
    private static void findSum(int[] arr, List<Integer> list, int pos, int cur_sum,int target){
        if(cur_sum == target){
            list.stream().forEach(s->System.out.print(s+" "));
            System.out.println();
            return;
        }
        if(cur_sum > target){
            return;
        }
        for(;pos<arr.length;pos++){
            // do
            cur_sum = cur_sum + arr[pos];
            list.add(arr[pos]);
            // recurse
            findSum(arr,list,pos+1,cur_sum,target);
            // backtrack
            list.remove(list.size()-1);
            cur_sum -= arr[pos];
        }

    }
}
