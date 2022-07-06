package backtracking_micro_course;

import java.util.ArrayList;
import java.util.List;

public class generateValidParanthesis {
    public static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        backtrack(new StringBuilder(),0,0,n);
        System.out.println(ans);
    }

    private static void backtrack(StringBuilder str, int open, int close, int max) {
        if(open+close == 2 * max){
            ans.add(str.toString());
        }
        if(open < max){
            // do
            str = str.append("(");
            // recurse
            backtrack(str,open+1,close,max);
            // undo
            str.deleteCharAt(str.length()-1);
        }

        if(close < open){
            // do
            str = str.append(")");
            // recurse
            backtrack(str,open,close+1,max);
            // undo
            str.deleteCharAt(str.length()-1);
        }
    }
}
