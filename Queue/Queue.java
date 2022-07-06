//$Id$
package Queue;

public class Queue {
	static Node front=null,rear=null;
	class Node{
		int value;
		Node next;
		Node(int num){
			this.value = num;
			this.next = null;
		}
	}
	void enque(int item) {
		if(front == null) {
			Node new_node = new Node(item);
			front = new_node;
			rear = new_node;
			return;
		}
		Node new_node = new Node(item);
		rear.next = new_node;
		rear = new_node;
	}
	Node deque() {
		if(front != null) {
			Node to_return = front;
			front = front.next;
			return to_return;
		}
		return null;
		
	}
	boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}
	void printQueue() {
		Node itr = front;
		while(itr != null) {
			System.out.print(itr.value+" ");
			itr = itr.next;
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enque(5);
		q.enque(6);
		q.enque(7);
		q.enque(8);
		q.enque(9);
		q.printQueue();
		q.deque();
		q.deque();
		q.deque();
		q.enque(4);
		q.printQueue();
	}


}