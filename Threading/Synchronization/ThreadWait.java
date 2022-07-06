package Threading.Synchronization;
class ThreadA extends Thread{
    int total = 0;
    public void run(){
        synchronized(this){
            System.out.println("Child thread acquires lock and start calculation");
            for(int i=1;i<=100;i++){
                total +=i;
            }
            System.out.println("Child thread completes it calculation and notifying to main thread");
            this.notify();
        }

    }
}
public class ThreadWait {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        t1.start();


        // main thread is expecting a updation from child thread

        // t1.join(); // we can achieve the same by using join() also, but if the main
        // thread should wait until the child thread completes instead of required data . so that we are going for wait and notify
        synchronized (t1) { // to do that, main thread acquires lock of child thread and entering into waiting state and releases the lock.
            try {
                System.out.println(
                        "Main thread acquires child lock and entering waiting State and Releases the Lock"
                );
                t1.wait();

                System.out.println("Main thread recieved Notification from Child thread acquires Lock of child Thread");
                // child thread started
                System.out.println(t1.total); //main thread did not waited until child thread completes,

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        // inorder to achieve this, we have to wait until child thread completes using wait() and notify()
    }
}
