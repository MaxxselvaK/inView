package Threading;
class Display{
    public synchronized void wish(String name){
        for(int i=0;i<10;i++){
            try{
                System.out.print("Happy Birthday ");
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.print(name);
            System.out.println();
        }

    }
}
class newThread extends  Thread{
    Display d;

    String name;
    newThread
            (Display d,String name){
        this.d = d;
        this.name = name;
    }
    public  void run(){
        d.wish(name);
    }
}
public class ConstructorDemo extends Thread {
    public static void main(String[] args) {
        newThread t1 = new newThread(new Display(),"Dhoni");
        t1.start();
    }
}
