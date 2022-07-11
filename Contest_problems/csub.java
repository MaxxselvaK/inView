import java.io.*;
import java.util.*;
public class csub{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            // sc.nextLine();
        String s = sc.nextLine();
        int len = s.length();
        long ones = 0;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        System.out.println(ones*(ones+1)/2);
        }
        
    }
}