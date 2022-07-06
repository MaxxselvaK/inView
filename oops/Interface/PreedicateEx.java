package oops.Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PreedicateEx {
    public static void main(String[] args) {

        Predicate<Integer> p = i->i>10;
        System.out.println(p.test(30));
        System.out.println(p.test(1));


        Predicate<Collection> pc = k-> k.isEmpty();

        ArrayList l = new ArrayList();
        l.add(new String());
        System.out.println(pc.test(l));


        // it is possible to negate the result of predicate

        System.out.println(pc.negate().test(l));

        // Predicate Joining

        // p1.and.p2
        //p1.or.p2
    }
}
