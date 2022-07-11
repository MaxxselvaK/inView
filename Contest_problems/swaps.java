//$Id$
package Contest_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class swaps {

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
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    // function to calculate lcm of
    // two numbers.
    static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        // your code goes here
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0; x<t; x++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] temp = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                temp[i] = arr[i];
            }
            Arrays.sort(temp);
            int min = temp[0];
            int count = 0;
            boolean flag = true;
            for(int ele: arr){
                if( ele-min-2 > 0){
                    System.out.println(count);
                    count+=1;
                }else if(ele-min-2 == 0){

                    continue;
                }else{
                    flag = false;
                    break;
                }
            }
            int sol = count;
            if(!flag){
                count=0;
                for (int ele:arr){
                    if(ele>0){
                        count++;
                    }
                }
                sol = count;
            }
            System.out.println(sol);
        }
    }
}
