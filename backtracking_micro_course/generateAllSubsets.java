//$Id$
package backtracking_micro_course;

import java.util.ArrayList;
import java.util.List;

public class generateAllSubsets {
	public static void generate(int[] arr,List<Integer> soln,int pos) {
		if(pos == arr.length) {
			printAll(soln);
			return;
		}
//		for(int i=pos;i<arr.length;i++) {
			// do 
			soln.add(arr[pos]);
			
			// recurse
			generate(arr,soln,pos+1);
			
			// undo
			soln.remove(soln.size()-1);
			
			//recurse
			generate(arr,soln,pos+1);
//		}
	}
	private static void printAll(List<Integer> soln) {
		// TODO Auto-generated method stub
		for(int i=0;i<soln.size();i++) {
			System.out.print(soln.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3};
		List<Integer> soln = new ArrayList<>();
		generate(arr,soln,0);
	}

}
