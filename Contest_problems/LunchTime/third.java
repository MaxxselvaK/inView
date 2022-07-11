import java.util.*;
import java.io.*;
class third{
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
            int L = sc.nextInt();
            String S = sc.nextLine();
            int len = S.length();
            boolean found = false;
            int count = 0;
            for(int j=0;j<len;j++){
                // int temp_len = j;
                
            //    for(int k=0;k<=j;k++){
                if(S.charAt(j) == '1'){
                       count++;
                }
                double val = Math.ceil((j+1) / 2.0);
                    //    System.out.println(val+" "+count);
                       if((j+1) > 1 && val <= (double)count){
                            System.out.println("YES");
                            found = true;
                            break;
                        }
            //    }
               
            }
            if(!found){
                System.out.println("NO");
            }
        }
    }
}