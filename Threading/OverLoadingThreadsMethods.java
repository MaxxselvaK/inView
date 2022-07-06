package Threading;
import java.io.*;
class OverLoadingThreadsMethods extends Thread {
    void run(int a){
        System.out.println("Overloaded Run");
    }
    public void run(){
        System.out.println("Run() method");
    }
    public static void main(String[] args){
        OverLoadingThreadsMethods ot = new OverLoadingThreadsMethods();
        ot.start();
        // Extending extend = new Extending();
//        Thread t1 = new Thread(extend);
//        t1.start(); // will invoke always the no arg run() method
    }
}