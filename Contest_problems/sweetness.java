//$Id$
package Contest_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class sweetness {

	static class candy implements Comparator<candy>{
		Integer price;
		Integer sweetness;
		candy(int price,int sweetness){
			this.price = price;
			this.sweetness = sweetness;
		}
		@Override
		public int compare(candy o1, candy o2) {
			
			return o1.sweetness.compareTo(o2.sweetness);
		}
		
	}

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
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] p = new int[n];
            int[] s = new int[n];
            for(int i1=0;i1<n;i1++){
            	p[i1] = sc.nextInt();
            }
            for(int i1=0;i1<n;i1++){
            	s[i1] = sc.nextInt();
            }
            List<candy> list = new ArrayList<>();
            for(int i1=0;i1<n;i1++) {
            	int price = p[i1];
            	int sweetness = s[i1];
            	list.add(new candy(price,sweetness));
            }
            Collections.sort(list,new Comparator<candy>() {

				@Override
				public int compare(candy o1, candy o2) {
					return ~o1.sweetness.compareTo(o2.sweetness);
				}
            	
            });
            Iterator<?> itr = list.iterator();
            int sweetness = 0;
            int count = 0;
            while(itr.hasNext() && d > 0 && count<2) {
            	candy c = (candy) itr.next();
            	if(c.price <= d) {
            		count++;
            		sweetness += c.sweetness;
            		d = d - c.price;
            	}
            }
            System.out.println(sweetness);
         }
    }

}
