package interview_problems;

import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(hm.containsKey(arr[i])){
                System.out.println(hm.get(arr[i])+" , "+i);
            }else {
                hm.put(diff,i);
            }
        }
    }
}
