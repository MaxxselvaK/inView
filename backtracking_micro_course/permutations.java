//$Id$
package backtracking_micro_course;
/*
 * 
 * Total no of combination : n! -> n length of the string
 * 
 * 
 */
public class permutations {

	public static void main(String[] args) {
		String word = "abcd";
		//               left_boundary,right_boundary, word
		findPermutations(0,word.length()-1,word);
	}

	private static void findPermutations(int left, int right, String word) {
		if(left == right) {
			System.out.println(word);
			return;
		}
		
		for(int i=left;i<=right;i++) {
			//do
			word = swap(left,i,word);
			//recurse
			findPermutations(left+1,right,word);
			//undo 
			word = swap(left,i,word);
		}
		
	}

	private static String swap(int left, int right, String word) {
		// TODO Auto-generated method stub
		char[] word_arr = word.toCharArray();
		char temp = word_arr[left];
		word_arr[left] = word_arr[right];
		word_arr[right] = temp;
		return String.valueOf(word_arr);
	}

}
