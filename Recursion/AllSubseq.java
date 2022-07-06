package Recursion;

public class AllSubseq {
    static void solve(String temp, String original,int pos){
        if(pos == original.length()){
            System.out.println(
                    temp
            );
            return;
        }
        solve(temp,original,pos+1); //without picking the character
        temp = temp + original.charAt(pos);
        solve(temp,original,pos+1);
    }
    public static void main(String[] args) {
        String S = "abcd";

        solve("",S,0);
    }
}
