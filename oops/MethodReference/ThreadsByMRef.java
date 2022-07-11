package oops.MethodReference;

public class ThreadsByMRef {
    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread "+ i);
        }
    }
    public static void main(String[] args){
        ThreadsByMRef test = new ThreadsByMRef();
        Runnable r = test :: m1;
        Thread t = new Thread(r);
        t.start();
    }
}
