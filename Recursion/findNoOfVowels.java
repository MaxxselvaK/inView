package Recursion;

import java.util.Arrays;
import java.util.List;

public class findNoOfVowels {
    static List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    static int noOfVowels(String source){
        if(source.length() == 0){
            return 0;
        }

        if(list.contains(source.charAt(0))){
            return 1 + noOfVowels(source.substring(1));
        }else{
            return noOfVowels(source.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(noOfVowels("Hello world"));
        System.out.println(noOfVowels("AEIOUaeiou"));

    }
}
