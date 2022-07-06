package string_problems;
/*
Given a string S containing lowercase English alphabet characters. The task is to calculate the number of distinct strings that can be obtained after performing exactly one swap.

In one swap, Geek can pick two distinct indexes i and j (i.e 1 < i < j < |S| ) of the string, then swap the characters at the position i and j.

S = “geek”
Output: 6
Explanation: After one swap, there are only 6 distinct strings possible. (i.e “egek”,“eegk”,“geek”,“geke”,“gkee” and “keeg”)`

Optimised solution:
int freq[26];
for(int i=0;i<26;i++)freq[i]=0;

long long ans=1;//original string
freq[s[0]-‘a’]++;
for(int i=1;i<s.length();i++)
{
ans+=(i-freq[s[i]-‘a’]);
freq[s[i]-‘a’]++;
}
return ans;
 */
public class distinctStringAfterSwap {
    public static void main(String[] args) {
        // think backward direction to understand. last character can swap with all chars before that . first character cannot swap bcz it don't have char before that.
        int[] freq = new int[26];
        String s = "abc";
        freq[s.charAt(0)-'a']++;
        long ans = 1;
        for(int i=1;i<s.length();i++){
            ans += i- freq[ s.charAt(i)-'a'];
            freq[s.charAt(i)-'a']++;
        }
        System.out.println(ans);
    }
}
