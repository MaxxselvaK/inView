//$Id$
package Contest_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class matrix {
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
    }static int min(int a, int b)
    {
        return (a < b) ? a : b;
    }
 
    // A utility function to find min
    // of three integers
    static int min(int a, int b, int c)
    {
        return min(min(a, b), c);
    }
	static void diagonalOrder(int matrix[][],int x,int y,int z)
    {
 
        // There will be ROW+COL-1 lines in the output
        for (int line = 1;
             line <= (x + y - 1);
             line++) {
 
            // Get column index of the first
            // element in this line of output.
            // The index is 0 for first ROW
            // lines and line - ROW for remaining lines
            int start_col = Math.max(0, line - x);
 
            // Get count of elements in this line.
            // The count of elements is equal to
            // minimum of line number, COL-start_col and ROW
            int count = min(line, (y - start_col),
                            x);
 
            // Print elements of this line
            for (int j = 0; j < count; j++)
            	matrix[min(x, line)
                       - j- 1][start_col + j] = z++;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader f = new FastReader();
		int t = f.nextInt();
		while(t!=0) {
			int x1 = f.nextInt();
			int y1 = f.nextInt();
			int x2 = f.nextInt();
			int y2 = f.nextInt();
			int[][] mat = new int[x2-1][y2-1];
			
			t--;
		}
	}

}
