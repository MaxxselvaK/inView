//$Id$
package stack;

import java.util.Stack;

/*
 * https://afteracademy.com/blog/find-the-next-greater-element-for-every-element-in-an-array
 */
public class next_greates_element {

	public static void main(String[] args) {
		int[] numbers = new int[] {10,4,3,12};
		Stack<Integer> stack = new Stack<>();
		stack.push(numbers[0]);
		for(int i=1;i<numbers.length;i++) {
			int next = numbers[i];
			if(!stack.isEmpty()) {
				int element = stack.pop();
				while(next > element) {
					System.out.println(element+"->"+next);
					if(stack.isEmpty()) {
						break;
					}
					element = stack.pop();
				}
				if(element > next) {
					stack.push(element);
				}
			}
			
			stack.push(next);
		}
	}

}
