package backtracking_micro_course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// unique case

public class combination_sum {
    class LinkedList1{
        Node head = null;
        class Node{
            int data ;
            Node next;
            Node(int d){
                this.data = d;
                this.next = null;
            }
        }
        Node insert(int data){
            Node head = this.head;
            if(head == null){
                Node newNode = new Node(data);
                this.head = newNode;
                return this.head;
            }else{
                while (head.next != null){
                    head = head.next;
                }
                Node newNode = new Node(data);
                head.next = newNode;
            }
            return head;
        }
        void remove(){
            Node head = this.head;
            Node prev = null;
            while (head.next != null){
                prev = head;
                head = head.next;
            }
            if(prev != null) {
                prev.next = null;
            }
        }
        void add(int d){
            this.add(d);
        }

    }
    static int combination = 0;
//    LinkedList list = new LinkedList();
    static List<List<Integer>> unique_list = new ArrayList<>();
    static void comb_sum(int[] arr, int target, int cur_sum, int pos, List<Integer> list){
        if(target == cur_sum && !unique_list.contains(list)) {
//            for(List<Integer> lst: unique_list){
//                if(list.containsAll(lst)){
//                    return;
//                }
//            }
            System.out.println("list "+list);
            unique_list.add(new ArrayList<>(list));
            combination++;
            return;
        }
        if(cur_sum>target){
            return;
        }
        for (int i=0;i<arr.length;i++){
            // do and recurse
//            if(cur_sum+arr[i] <= target){
                list.add(arr[i]);
//            System.out.println(list +" "+ cur_sum);
                comb_sum(arr,target,cur_sum+arr[i],i,list);
//            System.out.println(list);
                list.remove(list.size()-1);
                // backtrack
//                comb_sum(arr,target,cur_sum,i+1, list);
//            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,6,7};
        List<Integer> list = new LinkedList<>();
        comb_sum(arr,8,0,0,list);
        System.out.println(combination);
    }
}
