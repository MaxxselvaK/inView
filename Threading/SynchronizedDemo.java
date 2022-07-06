package Threading;


public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        newThread t1 = new newThread(d,"selva");
        newThread t2 = new newThread(d,"maxx");

        t1.start(); // multiple threads trying to operate on same display object, so we need synchronization
        t2.start(); // we will get irregular output bcz of simultaneous access.
        // make the with method as synchronized to get the proper output
    }
}
