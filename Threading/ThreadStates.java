package Threading;

public class ThreadStates extends Thread{
    public void run(){
        System.out.println("Run by Thread");
    }
    public static void main(String[] args) {
        ThreadStates thread = new ThreadStates(); // New State

        thread.start(); // Enters into Ready state


        // JVM thread scheduler will pick the thread from the queue and executes it,

        // while running the state moved to running state

        // after completing the run() method thread will enter into Dead State / Terminated state to mark it as completed


        // sleep(time) / wait(time)  will make the thread state from running into sleeping state


        // wait() , notify(), notifyall() will be used for inter thread communication
    }
}
