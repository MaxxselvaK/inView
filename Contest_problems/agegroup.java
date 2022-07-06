//$Id$
package Contest_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class agegroup {
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
			int g = f.nextInt();
			int p = f.nextInt();
			int[] arr = new int[10];
			for(int i=0;i<10;i++) {
				arr[i] = f.nextInt();
			}
			int len = arr.length;
			int pos = 9;
			int days_to_complete = 0;
			int min_days_for_chef = 0;
			int max_days_for_chef = 0;
			int remaining_dose = 0;
			int total = 0;
			while(len > g) {
				total = total + arr[pos];
				len--;
				pos--;
			}
			if(total < p) {
				days_to_complete = 1;
			}else {
				days_to_complete = total / p;
			}
//			System.out.println("total "+total);
			remaining_dose = Math.abs(total - days_to_complete * p);
			int remaining_people = total - days_to_complete * p ;
			if(remaining_people > 0) {
				min_days_for_chef = days_to_complete + 1;
			}
			else if(remaining_dose > 0) {
				min_days_for_chef = days_to_complete;
			}else {
				min_days_for_chef = days_to_complete+1;
			}
			
			total = total + arr[g-1];
				if(total < p) {
				days_to_complete = 1;
			}else {
				days_to_complete = total / p;
			}
			remaining_dose = total - days_to_complete * p;
			max_days_for_chef = days_to_complete;
			if(remaining_dose > 0 ) {
				max_days_for_chef = days_to_complete + 1;
			}
			System.out.println(min_days_for_chef+" "+max_days_for_chef);
			t--;
		}
	}
}
