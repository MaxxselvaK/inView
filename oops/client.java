package oops;

public class client {
    public static void main(String[] args) {
        Integer a = new Integer(22);
        myImmutable m = new myImmutable(new Integer(a));
        a = 10;
        System.out.println(m.toString());
        System.out.println(a);
    }
}
