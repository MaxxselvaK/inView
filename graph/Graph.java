package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	int n;
	List<Integer> list[] ;
	Graph(int no_of_nodes){
		this.n = no_of_nodes;
		list = new LinkedList[no_of_nodes];
		for(int i=0;i<no_of_nodes;i++) {
			list[i] = new LinkedList<>();
		}
	}
	void addEdge(int node1,int node2) {
		list[node1].add(node2);
	}
	void printGraph() {
		for(int i=0;i<this.n;i++) {
			System.out.print(i+" -> ");
			List<Integer> adj = list[i];
			Iterator<Integer> itr  = adj.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
			System.out.println();
		}
	}
	public void BFS(int start) {
		Queue q = new LinkedList<>();
		q.add(start);
		boolean visited[] = new boolean[this.n];
		visited[start] = true;
		while(!q.isEmpty()) {
			int pos = (int) q.poll();
			System.out.println(pos+" ");
			Iterator<Integer> itr = this.list[pos].listIterator();
			while(itr.hasNext()) {
				int node = (int) itr.next();
				if(visited[node] != true) {
					visited[node] = true;
					q.add(node);
				}
			}
		}
	}
}
