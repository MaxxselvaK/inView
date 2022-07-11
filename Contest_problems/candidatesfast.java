import java.util.*;
import java.io.*;
class candidatesfast{
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
            int xT = sc.nextInt();
            int yT = sc.nextInt();
            int x =  sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            for (int j=0;j<xT;j++){
                // System.out.println("line");
                String problems = sc.nextLine();
                int len = problems.length();
                int f=0,p=0;
                for(int k=0;k<len;k++){
                    char s = problems.charAt(k);
                    if(s == 'F'){
                        f++;
                    }
                    if(s == 'P'){
                        p++;
                    }
                }
                if(f >= x || ( f >= x-1 && p >= y )){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}