package oops.MethodReferences;
import java.util.*;
class Sample{
    Sample(){
        System.out.println("Const invoked");
    }
}
interface getSample{
    Sample get();
}
public class ConstructorRef{
    public static void main(String[] args){
        getSample s = Sample::new;
        s.get();
    }

}