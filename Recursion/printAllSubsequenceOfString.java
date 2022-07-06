package Recursion;

public class printAllSubsequenceOfString {
    StringBuilder res = new StringBuilder();
    static void solve(String original,String temp,int pos){
        if(pos == original.length()){
            System.out.println(temp);
            return;
        }
        temp = temp + original.charAt(pos);
        solve(original,temp,pos+1);
        temp = temp.substring(0,temp.length()-1);
        solve(original,temp,pos+1);
    }
    public static void main(String[] args) {
        String o = "abcd";
        solve(o,"",0);
    }
}
