package Threading.Synchronization;

import Queue.Queue;

import java.util.ArrayList;
import java.util.List;

class Producer extends Thread{
    List queue;
    Producer(List q){
        this.queue = q;
    }
    public void run(){
        synchronized (queue){
            queue.add(4);
            queue.add(5);
            System.out.println("Producer produced items and notifying to consumer");
            queue.notify();
            System.out.println("Waiting for consumer to consume all Items");
            try {
                queue.wait();
                System.out.println("Producing items again to the Queue");
                queue.add(6);
                queue.add(7);
                System.out.println("Produced new Items, notifying to Consumer");
                queue.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    List queue;
    Consumer(List q){
        this.queue = q;
    }
    public void run(){
        synchronized (queue){
            if(queue.isEmpty()){
                try {
                    System.out.println("Queue is empty, consumer waiting for items from the producer");
                    queue.wait();
                    System.out.println("Items recieved in the queue from Producer "+queue);
                    System.out.println("Consumer consumed all items");
                    queue.clear();
                    System.out.println("Queue is empty, consumer waiting for items from the producer");
                    queue.notify();
                    System.out.println("Waiting for Items from the queue");
                    queue.wait();
                    System.out.println("Recieced items from producer Again "+queue
                    );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        List queue = new ArrayList();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        consumer.start();
//        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.start();
    }
}
