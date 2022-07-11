package Threading;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(" maxx is Sleeping Pls wait");
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join(); // main thread will wait until t1 completes

//        t1.join(5000); // he will wait only for 5 seconds
        System.out.println("maxx wakeup Now");

        for(int i=1;i<=5;i++){
            System.out.println("Hello maxx, im main thread");
        }
    }
}
