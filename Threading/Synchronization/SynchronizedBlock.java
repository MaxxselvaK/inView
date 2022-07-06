package Threading.Synchronization;

class SyncDemoThread extends Thread{
    Maxx m;
    String name;
    SyncDemoThread(Maxx m,String name){
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.display(name);
    }
}
class Maxx{
    void display(String name){
        System.out.println("Executing 100000 lines of code ");
        // ;;; 10000 lines of code is here assume
        synchronized (this){
            for(int i=0;i<10;i++){
                // lines requires synchronization
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" Good morning");
            }
        }

        // ;;; 1000 lines of code
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Maxx m = new Maxx();
        SyncDemoThread t1 = new SyncDemoThread(m,"selva");
        SyncDemoThread t2 = new SyncDemoThread(m,"maxx");
        t1.start();
        t2.start();
    }
}
