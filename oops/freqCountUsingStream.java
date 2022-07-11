package oops;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class freqCountUsingStream {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,4,5,6,6,7,7,7,7,7,8,8,8,1};
        Map<Object, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(p->p.intValue(),Collectors.counting()));
        System.out.println(map.get(7));
    }
}
