package Threading;
public class changingName implements Runnable{
    @Override
    public void run(){
        System.out.println("Run by thread named "+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        Runnable r = new changingName();
        Thread child = new Thread(r);
        child.setName("Child Thread");
        Thread.currentThread().setName("MainThread");
        child.start();
        System.out.println("Run by Thread named "+Thread.currentThread().getName());
    }
}