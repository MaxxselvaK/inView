package Threading;

public class OLoadStart extends Thread{
    public void run(){
        System.out.println("Hellpo");

    }
    public void start(){
        System.out.println(
                "START Invoked" //NO threads will be invoked, to invoke parent class start use super.start()
        );
        super.start(); //new thread will be created and run
    }
    public static void main(String[] args) {
        OLoadStart ol = new OLoadStart();
        ol.start();
    }
}
