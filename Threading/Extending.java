package Threading;

import sun.jvm.hotspot.runtime.Threads;

public class Extending extends Threads {
    public void run(){
        System.out.println("run()");
    }
    public void run(int a){
        System.out.println("run() "+a);
    }

}
