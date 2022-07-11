package Array.SlidingWindow;
// statically sized window
/*
ASCII value of uppercase alphabets – 65 to 90. ASCII value of lowercase alphabets – 97 to 122.
*/

/*
for (int i = 0; str[i] != '\0'; i++) // Loop until the NUL-terminator
{
    if ((str[i] >= 'a') && (str[i] <= 'z')) // If the current character is a lowercase alphabet
        str[i] = str[i] - ('a' - 'A');      // See the ASCII table to understand this:
                                            // http://www.asciitable.com/index/asciifull.gif
}

printf("%s\n", str);
 */
class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length() <= 1){
            return "";
        }
        int len = s.length();
        int long_length = 0;
        String ans = "";
        for(int i=0;i<len;i++){

            for(int j=i+1;j<len;j++){

                String subStr = s.substring(i,j);

                if(isNice(subStr) && subStr.length() > long_length){
                    ans = subStr;
                    long_length = subStr.length();
                }
            }

        }
        return ans;
    }
    public boolean isNice(String s){

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            boolean isCapital = ((int) c) <= 90;
            if(isCapital){
                char c1 = (char) ((char) c + ('a'-'A'));
                if(s.indexOf(c1) == -1){
                    return false;
                }
            }else{
                char c1 = (char) ((char) c - ('a'-'A'));
                if(s.indexOf(c1) == -1){
                    return false;
                }
            }
        }

        return true;
    }
}
