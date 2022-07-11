package string_problems;
// https://leetcode.com/problems/longest-palindrome/

import java.util.HashMap;
import java.util.Map;

/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome
that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }

        int ans = 0, odd = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int freq  = entry.getValue();

            if(freq > 1){
                if(freq %2 == 0){
                    ans += freq;
                }else{
                    ans += freq - 1;
                    odd+=1;
                }
            }else{
                odd+=1;
            }
        }

        return odd > 0 ? ans+1:ans;
    }
    public static void main(String[] args) {

    }
}
