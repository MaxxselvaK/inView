package stack;
import java.util.*;
public class stackImpl{
    public static class stack{
        int capacity = 0;
        int top = -1;
        int[] stack_arr ;
        public stack(int size){
            this.stack_arr = new int[size];
            this.capacity = size;
        }
        public void add(int value){
            // check the stack is not full
            if((this.top + 1) == this.capacity){
                System.out.println("STACK full");
                return;
            }
            this.stack_arr[++top] = value;
        }
        public void remove(){
            if(top < 0 ){
                System.out.println("STACK empty");
                return;
            }
            this.stack_arr[top] = -1;
            --top;
        }
        public void peek(){
            if(top == -1){
                 System.out.println("STACK empty");
                 return;
            }
            System.out.println(this.stack_arr[top]); 
        }
        public void print(){
             if(top == -1){
                 System.out.println("STACK empty");
                 return;
            }
            for(int i=this.top;i>=0;i--){
                System.out.println(stack_arr[i]);
            }
        }
    }
    public static void main(String[] args){
        stackImpl.stack my_stack = new stackImpl.stack(15);
        my_stack.add(15);
        my_stack.add(315);
        my_stack.add(15);
        my_stack.add(34);
        my_stack.peek();
        my_stack.remove();
        my_stack.remove();

        my_stack.remove();
        my_stack.remove();
        my_stack.add(15);
        my_stack.add(315);
        my_stack.add(15);
        my_stack.print();
    }
}