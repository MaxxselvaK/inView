package Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public List<Integer> heap = new ArrayList<>(); // all data stored here

    public Integer heap_top(){
        if(heap.isEmpty()){
            return 0;
        }
        return  heap.get(0);
    }

    public void push_heap(Integer value){
        if(heap.isEmpty()){
            heap.add(value);
            return;
        }else{
            int size = heap.size();
            heap.add(value);
            up_heapify(size);
        }
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }
    public void performKOperations(int k){
        while(k != 0){
            int top = heap_top();
            int val = (int) Math.ceil(1.0*top/2);
            heap.set(0,val);
            down_heapify(0);
            k--;
        }
    }
    public void up_heapify(int index){
        if(index == 0){
            return;
        }
        int parent = (index-1)/2;
//        System.out.println(index+" "+parent);
//        System.out.println(heap);
        if(heap.get(index) > heap.get(parent)) {
            swap(index, parent);
            up_heapify(parent);
        }
    }
    public  void down_heapify(int index){
        if(index >= heap.size() || index == -1){
            return;
        }
        int child_left = 2*index+1;
        int child_right = 2*index+2;
//        int parent = heap.get(index);
        int temp_child = -1 ;
//        System.out.println(child_left+" "+child_right);
        if(child_left < heap.size()){
            if(heap.get(index) < heap.get(child_left)){
                temp_child = child_left;
                swap(index,child_left);
//                down_heapify(child_left);
            }
        }
        if(child_right < heap.size()){
            if(heap.get(index) < heap.get(child_right)){
                temp_child = child_right;
                swap(index,child_right);
//                down_heapify(child_right);
            }
        }
        down_heapify(temp_child);
    }
    public void swap(int index,int parent){
//        System.out.println("swapped "+heap);
        int temp = heap.get(index);
        heap.set(index,heap.get(parent));
        heap.set(parent,temp);
    }
    public  Integer pop_heap(){
        if(heap.isEmpty()){
            return -1;
        }else{
            int size = heap.size();
            if(size==1){
                return heap.remove(0);
            }else{
                int value = heap.get(size-1);
                heap.remove(size-1);
                int poped_val = heap.get(0);
                heap.set(0,value);
                down_heapify(0);
                return poped_val;
            }
        }
    }

}
