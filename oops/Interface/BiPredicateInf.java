package oops.Interface;
import java.util.function.*;
public class BiPredicateInf{
    public static void main(String[] args){
        BiPredicate<Integer,Integer> BP = (a,b) -> a==b;
        System.out.println(BP.test(2,2));
        System.out.println(BP.test(2,3));
    }
}