package oops.Interface;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class FunctionInFace {
    public static void main(String[] args) {
        //Functionn is same as Predicate interface but we can return any type of value from it.
                // InputeType,ReturnType
        Function<Integer,Integer> fInf = (i) -> Math.abs(i); // convert numbers to absolute value

        System.out.println(fInf.apply(-2));
        System.out.println(fInf.apply(-4));
    }
}
