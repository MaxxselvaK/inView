package Contest_problems.augLC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class third {
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

    public static void main(String[] args) {
        second.FastReader sc = new second.FastReader();
        int t = sc.nextInt();
        Stack<Integer> stack = new Stack();
        for(int i=0;i<t;i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            boolean first = true;
            boolean noSoln = false;
            int f = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                if(first){
                    f = arr[j];
                    first = false;
                }else
                {
                    if(f < arr[j]){
                        noSoln = true;
                    }
                }
            }
            if(noSoln){
                System.out.println(-1);
            }else{
                stack.push(arr[0]);
                boolean violated
                        = false;
                for(int i1=1;i1<N;i1++){

                    while(!stack.isEmpty() && stack.peek() <= arr[i1]){
                        stack.pop();
                    }
                    stack.push(arr[i1]);
                }

                System.out.println(
                        stack.size()-1
                );
            }
        }
    }
}
/*
1
6
14 5 12 2 3 3
 */