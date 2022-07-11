package oops.Interface;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
public class BiFunctionInf{
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> BF = (a,b) -> a*b;
        System.out.println(BF.apply(2,2));
        BiConsumer<Integer,Integer> BC = (a,b) -> System.out.println(a+" Eqals "+b);
        BC.accept(
                2,3
        );
    }
}
