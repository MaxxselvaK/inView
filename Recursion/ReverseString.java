package Recursion;

public class ReverseString {
    static String reverse(String original, int len){
        if(len < 0){
            return "";
        }
        return original.charAt(len) + reverse(original,len-1);
    }
    public static void main(String[] args) {

        System.out.println(reverse("avles",4));
    }
}
