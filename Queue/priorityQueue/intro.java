package Queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class intro {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.intValue() > o2.intValue()){
                    return -1;
                }else if(o1.intValue() < o2.intValue()){
                    return 1;
                }
                return 0;
            }
        });
        pq.add(44);
        pq.add(3);
        pq.add(2);pq.add(5);
        // addition follows natural order by default
        System.out.println(pq.poll());
    }
}
