package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class JHeap {
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {
        minHeap.add(4);
        maxHeap.add(5);
        maxHeap.add(6);
        maxHeap.add(33);
        minHeap.add
                (33);
        System.out.println(minHeap.poll());
        System.out.println(maxHeap.poll());

    }

}
