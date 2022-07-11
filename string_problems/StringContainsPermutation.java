package string_problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutation-in-string/
public class StringContainsPermutation {
    static List<String> allPerm = new ArrayList<>();
    static void findPermutation(String str,int pos,int length){
        if (pos == length) {
            allPerm.add(str);
            return;
        }
        for(int i=pos;i<=length;i++){
            // do
            str = swap(str,i,pos);
            // recurse
            findPermutation(str,i+1,length);
            // undo
            str = swap(str,i,pos);
        }
    }

    private static String swap(String str, int i, int pos) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[pos];
        ch[pos] = temp;
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s = "abc";
        findPermutation(s,0,s.length()-1);
        System.out.println(allPerm);
    }
}
