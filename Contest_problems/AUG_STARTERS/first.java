package Contest_problems.AUG_STARTERS;

import java.util.*;
import java.io.*;
class first{
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
        for(int i=0;i<t;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(B > C){
                System.out.println("Bob");
            }else if(C>B){
                System.out.println("Alice");
            }else{
                System.out.println("Draw");
            }
        }
    }
}