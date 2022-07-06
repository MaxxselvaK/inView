//$Id$
package backtracking_micro_course;

import java.util.ArrayList;
import java.util.List;

public class target_combination {
	private static int[] arr = new int[] {2,3,5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 8;
		List<Integer> selected = new ArrayList<>();
		target_sum(0,target,selected,0);
	}
	
	private static void target_sum(int current_sum,int target,List<Integer> selected,int position) {
		if(current_sum == target) {
			for(int k=0;k<selected.size();k++) {
				System.out.print(selected.get(k)+" ");
			}
			System.out.println();
			return;
		}
		if(current_sum > target) {
			return;
		}
		for(;position<arr.length;position++) {
			current_sum = current_sum + arr[position];
			// do
			selected.add(arr[position]);
			//recurse
			target_sum(current_sum,target,selected,position);
			// undo
			selected.remove(selected.size()-1);
			current_sum = current_sum - arr[position];
		}
	}

}
