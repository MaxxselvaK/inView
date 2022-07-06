package Contest_problems.AUG_STARTERS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class fourth {
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
            int[] arr = new int[N];
            int[] shuff = new int[N-1];
            for(int i1=0;i1<N;i1++){
                arr[i1] = sc.nextInt();
            }
            for(int i1=0;i1<N-1;i1++){
                shuff[i1] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(shuff);
            Map<Integer,Integer> map = new HashMap<>();
            for(int j = 0;j<N-1;j++){
                int m1 = shuff[j] - arr[j];
                int m2 = shuff[j] - arr[j];
                if(m1 != m2){
                    if(m1>0){
                        map.put(
                                m1,map.get(m1)==null?1:map.get(m1)+1
                        );
//                        m[m1]+=1;
                    }
                    if(m2>0){
//                        m[m2]+=1;
                        map.put(
                                m2,map.get(m2)==null?1:map.get(m2)+1
                        );
                    }
                }else{
                    if(m1>0){
                        map.put(
                                m1,map.get(m1)==null?1:map.get(m1)+1
                        );
                    }
                }
            }
            int pos=0;
            int x = 0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue() == N-1){
                    x = Math.min(x,pos);
                }
                pos++;
            }
            System.out.println(x);
        }
    }
}
