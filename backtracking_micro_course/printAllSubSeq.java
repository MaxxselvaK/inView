package backtracking_micro_course;

import java.util.ArrayList;
import java.util.List;

public class printAllSubSeq {
    static  List<String> res = new ArrayList<>();
    static void solve(String str,StringBuilder seq,int pos){
        if(!res.contains(seq)){
            res.add(seq.toString());
        }else{
            return;
        }
        for(int i=pos;i<str.length();i++){
            seq = seq.append(str.charAt(i));
            solve(str,seq,i+1);
            System.out.println(seq+" "+i);
            seq = seq.deleteCharAt(seq.length()-1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        solve(str,new StringBuilder(),0);
        System.out.println(res);
    }
}
