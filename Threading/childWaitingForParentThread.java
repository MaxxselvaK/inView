package Threading;

class childThread extends Thread{
    static Thread mt;
    public void run(){
        try {
            mt.join(); // child thread waiting for main thread to complete first
        }catch (Exception e){

        }
        for(int i=0;i<5;i++){
            System.out.println("Im child thread");
        }
    }
}
public class childWaitingForParentThread extends Thread{
    public static void main(String[] args) {
        childThread.mt = Thread.currentThread();

        childThread t1 = new childThread();
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("Im main/Parent thread");
        }
    }
}
