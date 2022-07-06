package string_problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args){
        String input = "au";
        // output 3 ("abc")
        int length = input.length();
        int i = 0;
        int max = 0;
        int tempfreq = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(i < length){
            if(map.containsKey(input.charAt(i))){
                max = Math.max(max,tempfreq);
                i = map.get(input.charAt(i)) + 1;
                map.clear();
                tempfreq = 1;
            }else{
                map.put(input.charAt(i),i);
                tempfreq++;
                i++;
            }
        }
        System.out.println(max);
    }
}
