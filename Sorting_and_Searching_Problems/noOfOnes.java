//$Id$
package Sorting_and_Searching_Problems;

public class noOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,23,2,4,51,1,2,1,44,1,224,1,4,2,1};
		System.out.println(findOnes(arr,0,arr.length-1));
	}
	// Time complexity O(n)
	private static int findOnes(int[] arr, int left, int right) {
		if(right-left == 0) {
			return arr[left] == 1 ? 1 : 0;
		}
		if(left < right) {
			int leftOnes = findOnes(arr,left,(left+right)/2);
			int rightOnes = findOnes(arr,(left+right)/2 + 1,right);
			return leftOnes+rightOnes;
		}
		// divide left
		return 0;
	}

}
