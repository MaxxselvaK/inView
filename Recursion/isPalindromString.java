package Recursion;

public class isPalindromString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aaaa"));
    }

    private static boolean isPalindrome(String str) {
        if(str.length() == 0){
            return false;
        }
        if(str.length() == 1){
            return true;
        }
        // even length palindrome case
        if(str.length() == 2){
            return str.charAt(0) == str.charAt(1);
        }

        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
