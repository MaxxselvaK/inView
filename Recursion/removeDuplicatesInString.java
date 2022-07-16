package Recursion;

public class removeDuplicatesInString {
    static String  removeDuplicates(String s){

        if(s.length() == 1){ // base case, if only one letter string present that must be unique
            return s;
        }
        if( s.substring(0,1).equals(s.substring(1,2))){
            return removeDuplicates(s.substring(1));
        }else{
            return s.substring(0,1) + removeDuplicates(s.substring(1)); // fixing character and processing rest
        }
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("Heellop Woorrrrldd"));
    }
}
