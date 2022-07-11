package Threading;

import sun.jvm.hotspot.runtime.Threads;

public class Intro implements Runnable {
    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {

        Intro intro = new Intro();
//        intro
        Thread t = new Thread(intro);
        t.start();
    }
}
