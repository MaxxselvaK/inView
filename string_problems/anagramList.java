package string_problems;

import java.util.*;

//https://unacademy.com/class/interview-problem-solving-on-sets-and-hashmaps/JTHD6T4B
// i/p : [ 'eat','ate','tea','bat','tab','nat','tan' ]
// o/p {{'ate',tea,eat},{bat,tab},{nat,tan}}
public class anagramList {
    public static void main(String[] args) {
        String[] list = {"eat","ate","tea","bat","tab","nat","tan"};
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : list){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);

            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(sorted,l);
            }
        }
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
