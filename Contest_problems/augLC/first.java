package Contest_problems.augLC;

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
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            int max = 0;
            int count = 0;

            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
                if(arr[j] > max) {
                    max = arr[j];
//                    count = 0;
                }
            }
            for(int j=K-1;j<N;j++){
                if(arr[j] == max){
                    count+=(N-j);
                }
            }

//            int noOfSub = N/K+N%K;
            if(N == K){
                System.out.println(1);
            }else{
                System.out.println(count);
            }
        }
    }
}