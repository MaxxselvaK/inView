package Threading;

public class Priorities extends Thread{
    public void run(){
        System.out.println("Priority Demo "+Thread
        .currentThread().getName());
    }
    public static void main(String[] args) {
        Priorities p = new Priorities();
        p.setPriority(MAX_PRIORITY);
        p.setName("High");
        Priorities p2 = new Priorities();
        p2.setPriority(Thread.MIN_PRIORITY);
        p2.setName(
                "Low"
        );
        p2.start(); // p2 will be completed before starting p
        p.start(); // also there will be many threads in servers, we can't demonstrate by have only 2 threads
    }
}
