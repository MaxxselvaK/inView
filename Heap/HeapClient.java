package Heap;

public class HeapClient {
    public static void main(String[] args) {
        Heap max_heap = new Heap();
        max_heap.push_heap(4);
        max_heap.push_heap(5);
        max_heap.push_heap(9);
//        max_heap.push_heap(2);
//        max_heap.pop_heap();
//        System.out.println(max_heap.heap_top());
//        max_heap.pop_heap();
//        max_heap.push_heap(5);
//        System.out.println(max_heap.heap_top());
        int res = 0;
//        System.out.println(max_heap.heap_top());
        max_heap.performKOperations(2);
        System.out.println(max_heap.heap);
        while (!max_heap.isEmpty()){
            res = res +  max_heap.heap_top();
            max_heap.pop_heap();
        }
        System.out.println(res);
    }
}
