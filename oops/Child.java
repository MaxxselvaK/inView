package oops;

class Parent {

    static int i =0;

    public String add(){
        return "a";
    }
}
class Child extends Parent{

    static int i = 1;

    public String add(){
        return "b";
    }

    public static void main(String[] args){
        Parent obj = new Child();
        System.out.println(obj.add());
        System.out.println(obj.i);
    }
}
