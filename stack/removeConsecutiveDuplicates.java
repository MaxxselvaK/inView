package stack;

import java.util.Stack;

public class removeConsecutiveDuplicates {
    // i/p ['a','k','b',b','k','e']
    // given a string remove a consecutive duplicates from the string
    // op  ['a','e']
    public static void main(String[] args) {
        String s = "akbbke";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();){
            if(stack.size() > 0 && stack.peek() == s.charAt(i)){
                Character c = stack.pop();
                while(c == s.charAt(i)){
                    i++;
                }
            }else{
                stack.push(s.charAt(i));
                i++;
            }
        }
        System.out.println(stack);
    }
}
