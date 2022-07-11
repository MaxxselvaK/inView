package Threading.Synchronization;
class EvenPrinter extends Thread{
    Integer curr = 0;
    EvenPrinter(Integer curr){
        this.curr = curr;
    }
    public void run(){
        synchronized (curr){
            for(int i=1;i<=18;i++){
                if(i%2==0){
                    System.out.println(i+ " ");
                    try {
                        curr.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        curr.notify();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
class OddPrinter extends Thread{
    Integer curr;
    OddPrinter(Integer curr){
        this.curr = curr;
    }
    public void run(){

        synchronized (curr){
            for(int i=1;i<=18;i++){
                if(i%2!=0){
                    System.out.println(i+" ");
                    curr.notify();
                }else{
                    try {
                        curr.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
public class EvenOddPrint {
    public static void main(String[] args) {
        Integer curr = 1;
        EvenPrinter evenPrinter = new EvenPrinter(curr);
        OddPrinter oddPrinter = new OddPrinter(curr);
        oddPrinter.start();
        evenPrinter.start();
    }
}
