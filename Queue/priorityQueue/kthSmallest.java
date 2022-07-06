package Queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
Input: arr[] = {5, 20, 10, 7, 1}, N = 5, K = 2
Output: 5
Explanation: In the given array, the 2nd smallest element is 5. Therefore, the required output is 5.
 */
public class kthSmallest {
    public static void main(String[] args) {
        int arr[] = {5, 20, 10, 7, 1};
        int n = arr.length,k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int val = o1.compareTo(o2);
//                if(val > 0){
//                    return  -1;
//                }
//                if(val < 0){
//                    return 1;
//                }
                return val;
//                return ~o1.compareTo(o2);
            }
        });
        for (int a : arr){
            pq.offer(a);
            if (pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
