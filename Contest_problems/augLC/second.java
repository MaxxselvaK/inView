package Contest_problems.augLC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
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
    static class edge{
        int v1;
        int v2;
        edge(int v1,int v2){
            this.v1 = v1;
            this.v2 = v2;
        }
    }
    static int []parent = new int[1000000];

    // Function to find the topmost
    // parent of vertex a
    static int root(int a)
    {

        // If current vertex is
        // the topmost vertex
        if (a == parent[a])
        {
            return a;
        }

        // Otherwise, set topmost vertex of
        // its parent as its topmost vertex
        return parent[a] = root(parent[a]);
    }

    // Function to connect the component
// having vertex a with the component
// having vertex b
    static void connect(int a, int b)
    {

        // Connect edges
        a = root(a);
        b = root(b);

        if (a != b) {
            parent[b] = a;
        }
    }

    // Function to find unique top most parents
    static void connectedComponents(int n)
    {
        HashSet<Integer> s = new HashSet<Integer>();

        // Traverse all vertices
        for (int i = 0; i < n; i++)
        {

            // Insert all topmost
            // vertices obtained
            s.add(parent[i]);
        }

        // Print count of connected components
        System.out.println(s.size());
    }
    static void printAnswer(int N,List<edge> edges)
    {

        // Setting parent to itself
        for (int i = 0; i <= N; i++)
        {
            parent[i] = i;
        }

        // Traverse all edges
        for (edge e: edges)
        {
            connect(e.v1, e.v2);
        }

        // Print answer
        connectedComponents(N);
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            List<edge> edgeList= new ArrayList<>();
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            for(int i1=0;i1<N;i1++){
                for(int j1=i1+1;j1<N;j1++){
                    if(j1-i1 != arr[j1]-arr[i1]){
                        edgeList.add(new edge(i1,j1));
                    }
                }
            }
            printAnswer(N,edgeList);
        }
    }
}