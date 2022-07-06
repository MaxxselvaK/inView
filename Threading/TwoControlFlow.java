package Threading;
import java.util.*;
class TwoControlFlow{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("hello");
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("world");
                }
            }
        });

        t1.start();
        t2.start();

    }
}