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
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int anuSum = 0;
            int sarSum = 0;
            List<Character> list = Arrays.asList(new Character[]{'E','Q','U','I','N','O','X'});
            for(int j=0;j<N;j++){
                String word = sc.nextLine();
                if(list.contains(word.charAt(0))){
                    sarSum = sarSum + A;
                }else{
                    anuSum = anuSum + B;
                }
            }
            if(sarSum == anuSum){
                System.out.println("DRAW");
            }else if(sarSum > anuSum){
                System.out.println("SARTHAK");
            }else{
                System.out.println("ANURADHA");
            }
        }
    }
}