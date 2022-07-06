import java.util.*;
import java.io.*;
class policethief{
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
            int m = sc.nextInt();
            int n = sc.nextInt();
            int tx =  sc.nextInt();
            int ty = sc.nextInt();
            int px =  sc.nextInt();
            int py = sc.nextInt();
            int policeStep = 0;
            int thiefStep = 0;
            if(thiefStep == 1){
                System.out.println("YES");
                continue;
            }
            thiefStep = thiefStep+(m-tx);
            thiefStep = thiefStep+(n-ty);
            // finding police step
            int steps = 0;
            if(px != m && py != n){
                if(m-px > n-py){
                    // stoped at column end
                    steps = n-py;
                    py = py+steps;
                    px = px+steps;
                }else{
                    // stopped at row end
                    steps = m-px;
                    px = px+steps;
                    py = py+steps;
                }
                // int min = Math.min(m-px,n-py);
                // policeStep = policeStep+min;
            }
            policeStep = policeStep+steps;
            // while(px <= m && py <= n){
            //     policeStep++;
            //     px++;
            //     py++;
            // }
            if(px != m || py != n){
                if(px != m) {
                    policeStep = policeStep+(m-px);
                }
                if(py != n){
                    policeStep = policeStep+(n-py);
                }
            }
            if(policeStep < thiefStep){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}