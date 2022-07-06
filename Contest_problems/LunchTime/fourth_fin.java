import java.util.*;
import java.io.*;
class fourth_fin{
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
           sum = ((sum%M)+M)%M;
        }
        int q = sc.nextInt();
        int new_size = n;
        // int[] fin_arr = new int[n];
        for(int i=0;i<q;i++){
           int x = sc.nextInt();
           sum = ((sum%M)+M)%M;
           System.out.println(sum);
        }
        
    }
}
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int len1 = nums2.length;
        int dis = 0;
        for(int i=0;i<len;i++){
            int val = nums1[i];
            for(int j=len1-1;j>=i && (j-i) > dis;j--){
                if(val <= nums2[j]){
                    dis = Math.max(dis,j-i);
                    break;
                }
            }
        }
        return dis;
    }
}