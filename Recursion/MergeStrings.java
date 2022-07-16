package Recursion;

public class MergeStrings {
    static String mergeStrings(String a, String b){ // instead of positions we use size as base case and shrink the size in each recursive calls
        if(a.length() == 0 || b.length() == 0){
            if(a.length() == 0){
                return b;
            }else{
                return a;
            }
        }
        if(a.charAt(0) < b.charAt(0)){
            return a.charAt(0) + mergeStrings(a.substring(1),b);
        }else{
            return b.charAt(0) + mergeStrings(a,b.substring(1));
        }
    }
    public static void main(String[] args) {
        // given two sorted strings return merged sorted strings
        System.out.println(mergeStrings("abcd","abcd"));
    }
}
