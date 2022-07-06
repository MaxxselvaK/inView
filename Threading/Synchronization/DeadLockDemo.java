package Threading.Synchronization;
class Person1{
    synchronized void First(Person2 person2){
        System.out.println("Person1 Entered in First method");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // mainthread tries to acquire lock of person2 which is hold by child thread.
        person2.last();
    }
    synchronized void last(){
        System.out.println("Invoked last method from Person1");
    }
}
class Person2{
    synchronized void First(Person1 person1){
        System.out.println("person2 Entered into First method");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // child thread tries to acquire lock of person1 which is hold by main thread.
        person1.last();
    }
    synchronized void last(){
        System.out.println("Invoked last method from Person2");
    }
}
public class DeadLockDemo extends Thread{
    Person2 person2 = new Person2();
    Person1 person1 = new Person1();
    void mainThread(){
        // Main thread acquires lock of person1 because of synchronized method
        this.start();
        // It will be executed by main thread
        person1.First(person2);

    }
    public void run(){
        //It will be executed by Child thread
        // child thread acquires lock of person2 because of synchronized method
        person2.First(person1);
    }
    public static void main(String[] args) {
        DeadLockDemo demo = new DeadLockDemo();
        demo.mainThread();
    }
}
