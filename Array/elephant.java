/*
https://www.codechef.com/problems/LECANDY
*/
import java.util.*;
import java.io.*;
public class elephant{
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
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while(t != 0){
            int n =fr.nextInt();
            int c = fr.nextInt();
            String elephants = fr.nextLine();
            String[] ele = elephants.split(" ",0);
            long sum = 0;
            for(int i=0;i<n;i++){
                sum = sum+Long.parseLong(ele[i]);
            }
            if(sum <= c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t = t-1;
        }
    }
}