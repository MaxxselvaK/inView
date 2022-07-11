package Contest_problems.AUG_STARTERS;

import java.util.*;
import java.io.*;
class second{
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
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i1=0;i1<K;i1++){
                arr[i1] = Math.abs(arr[i1]);
            }
            for(int a : arr){
                pq.offer(a);
            }
            int sum = 0;
            if(K==0){
                System.out.println(sum);
            }else{
                while(!pq.isEmpty()){
                    if(pq.peek() > 0){
                        sum += pq.poll();
                        continue;
                    }
                    pq.poll();
                }
                System.out.println(sum);
            }
        }
    }
}