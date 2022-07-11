package oops.MethodReference;
import java.util.*;
interface funcInf{
    void m1();
}
public class methodRef{
    public static void m2(){
        System.out.println("Matching method implementation");
       
    }
    public static void main(String[] args){
         funcInf fnf =  methodRef::m2;
         fnf.m1();
    }
}