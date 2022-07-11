import java.util.*;
import java.io.*;
class fourth{
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
        long M = 1000000007;
        long sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i]  =  sc.nextInt();
        }
        int q = sc.nextInt();
        int new_size = n;
        // int[] fin_arr = new int[n];
        for(int i=0;i<q;i++){
           int x = sc.nextInt();
           sum = 0;
           n = arr.length;
           new_size = new_size + new_size;
           int[] new_arr = new int[new_size];
           int[] temp = new int[n];
           if(x == 0){
            //    clone(temp,arr,x);
           }else if(x > 0){
               // right rotation
                int mod = x%n;

                for(int k = 0;k<n;k++){
                    temp[k] = arr[(n+k-mod)%n];
                }
                System.arraycopy(arr, 0, new_arr, 0, arr.length);
                System.arraycopy(temp, 0, new_arr, arr.length, temp.length);
                arr = new_arr;
           }else{
               // left rotation
                int mod = x%n;
                for(int k = 0;k<n;k++){
                    temp[k] = arr[(k+mod)%n];
                }
                System.arraycopy(arr, 0, new_arr, 0, arr.length);
                System.arraycopy(temp, 0, new_arr, arr.length, temp.length);
                arr = new_arr;
           }
            // fin_arr = arr;
            // long sum = 0;
            int len = new_arr.length;
            for(int i1=0;i1<len;i1++){
                sum = (sum + (long)new_arr[i1]) % M;
            }
            System.out.println(sum%M);
        }
        
    }
}