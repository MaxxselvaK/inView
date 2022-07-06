import java.util.*;
import java.io.*;
class fifth{
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
        while(t != 0){
            --t;
            int n = sc.nextInt();
            int w = sc.nextInt();
            int wr = sc.nextInt();
            int[] weights = new int[n];
            for(int i=0;i<n;i++){
                weights[i] = sc.nextInt();
            }
            if(w <= wr){
                System.out.println("YES");
                continue;
            }
            Arrays.sort(weights);
            for(int i=0;i<n;i++){
                int j=i+1;
                int count = 0;
                int total = 0;
                while(j<n){
                    if(weights[j] != weights[j-1]){
                        break;
                    }
                    count++;
                    total = total + weights[j];
                    j++;
                    
                }
                i=j;
                if(count%2 == 1){
                    total -= weights[j-1];
                    if(total + wr >= w){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else{
                    if(total + wr >= w){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }
        }
        
    }
}