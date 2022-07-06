package Queue;

public class queueArr {
    private int[] queue= null;
    static int front =0,rear = 0;
    queueArr(int size){
        this.queue = new int[size];
    }
    public boolean isFull(){
        if(rear == queue.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(front == rear){
            return true;
        }
        return false;
    }
    public void enque(int ele){
        if(this.isFull()){
            System.out.println("QUEUE full cannot add");
            return;
        }
        queue[rear] = ele;
        rear++;
    }
    public void dequeue(){
        if(this.isEmpty()){
            System.out.println("QUEUE is empty");
            return;
        }
        System.out.println("DEQUEUED value "+queue[front]);
        queue[front] = 0;
        front++;
    }
    public void printQueue(){
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queueArr queue = new queueArr(15);
        queue.enque(5);
        queue.enque(6);
        queue.enque(7);
        queue.dequeue();
        queue.enque(55);
        queue.dequeue();
        queue.printQueue();
    }
}
