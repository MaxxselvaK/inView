package oops.Interface;

import java.util.function.Consumer;


public class ConsumerInf {



    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.print(s);
//        System.out.println(consumer.accept("string"));
        consumer.accept(
                "Good morninng"
        );
    }


}
