//$Id$
package Contest_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class physic {
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
		// TODO Auto-generated method stub
		FastReader f = new FastReader();
		int t = f.nextInt();
		while(t != 0) {
//			System.out.println(t);
			int D = f.nextInt();
			int d = f.nextInt();
			int A = f.nextInt();
			int B = f.nextInt();
			int C = f.nextInt();
			int total = D*d;
//			System.out.println(total);
			int res = 0;
//			while(total >= 10) {
				if(total >= 42) {
					total = total - 42;
					res = res + C;
				}else if(total >= 21) {
					res = res + B;
					total = total - 21;
				}else if(total >= 10) {
					res = res + A;
					total = total - 10;
				}
//			}
			System.out.println(res);
			t--;
		}
	}

}
