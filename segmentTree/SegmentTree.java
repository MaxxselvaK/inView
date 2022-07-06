//$Id$
package segmentTree;

public class SegmentTree {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,7,11};
		int n = arr.length;
		// segment tree node wont exceed 4*n size;
		int[] segment = new int[4*n];
		buildSegmentTree(arr,segment,0,n-1,0);
		for(int i=0;i<segment.length;i++) {
			System.out.print(segment[i] + " ");
		}
		System.out.println();
		System.out.println(getSum(segment,0,n-1,0,2,0));
	}

	private static void buildSegmentTree(int[] arr, int[] segment, int start_ind, int end_ind, int pos) {
		if(start_ind == end_ind) {
			segment[pos] = arr[start_ind];
			return;
		}
		int mid = (start_ind+end_ind)/2;
		buildSegmentTree(arr,segment,start_ind,mid,pos*2+1);
		buildSegmentTree(arr,segment,mid+1,end_ind,pos*2+2);
		segment[pos] = segment[pos*2+1] + segment[pos*2+2];
	}
	
	private static int getSum(int[] segment,int ss,int se,int qs,int qe,int idx) {
		System.out.println("called");
		// complete overlap
		if(qs <= ss && qe >= se) {
			return segment[idx];
		}
		// no overlap
		if(se < qs || ss > qe) {
			return 0;
		}
		// partial overlap
		int mid = (ss+se)/2;
		int left = getSum(segment,ss,mid,qs,qe,idx*2+1);
		int right = getSum(segment,mid+1,se,qs,qe,idx*2+2);
		return left + right;
	}

}
