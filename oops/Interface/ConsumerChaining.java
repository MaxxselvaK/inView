package oops.Interface;
import java.util.function.Consumer;
public class ConsumerChaining{
    public static void main(String[] args){
        // methodname consumer.andThen(nextConsumer).accept();
        Consumer<String> c1 = s-> System.out.println("First method "+s);
        Consumer<String> c2 = s->System.out.println("Second method "+s);

        Consumer<String> chained = c1.andThen(c2);

        chained.accept("Hi");
    }
}