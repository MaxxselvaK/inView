package Threading;

public class ThreadYieldDemo {
    // some platform won't support yield
    static class MyThread extends Thread{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println("child thread BOOM");
                Thread.yield();
            }
        }
    }
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0;i<500;i++){
            System.out.println("Main Thread");
        }
    }
}
