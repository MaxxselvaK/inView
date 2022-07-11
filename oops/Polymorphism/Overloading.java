package oops.Polymorphism;
class A{
    void m1(){
        System.out.println("called from A");
    }
}
class B extends A{
    void m1(){
        System.out.println("called from B");
    }
}
public class Overloading {
    void m1(A a){
        System.out.println("A version");
    }
    void m1(B b){
        System.out.println("B version");
    }
    public static void main(String[] args) {
        A a = new A();
//        a.m1();
        B b = new B();
//        b.m1();
        A a_tricky = new B();
        Overloading overloading = new Overloading();
        overloading.m1(a);
        overloading.m1(b);
        overloading
                .m1(a_tricky);
    }


}
