package two_pointers_problems;

import java.util.*;

public class consecutiiveSequence {
    public static void main(String[] args) {
        int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8};
        // find longest consecutive sequence
        // op : [8,9,10,11,12]

//        Arrays.sort(arr); O(nlogn)
//        int start = 0;
//        int end = 0;
//        int max = Integer.MIN_VALUE;
//        int count = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i+1] == arr[i]+1){
//                count++;
//                if(count > max){
//                    max = count;
//                }
//            }else{
//                count=1;
//            }
//        }
//        System.out.println(max);



        // HashMap approach

        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int a : arr){
            if(map.containsKey(a-1) || map.containsKey(a+1)){
                map.put(a,false);
            }else{
                map.put(a,true);
            }
        }
        int mx = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Boolean> entry: map.entrySet()){
            if(entry.getValue()){
                int value = entry.getKey();
                List<Integer> res = new ArrayList<>();
                int cnt = 1;
                while(map.containsKey(value)){
                    res.add(value);
                    value+=1;
                    cnt++;
                }
                if(cnt > mx){
                    mx = cnt;
                    System.out.println(res.toString());
                }
            }
        }
        System.out.println(mx);
    }
}
