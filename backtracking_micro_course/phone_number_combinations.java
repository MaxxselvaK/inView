//$Id$
package backtracking_micro_course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phone_number_combinations {
	private static Map<Character,String> letters = new HashMap<>();
	private static List<String> ans = new ArrayList<>();
	public static void main(String[] mains) {
		letters.put('2',"abc");
		letters.put('3',"def");
		letters.put('4',"ghi");
		letters.put('5',"jkl");
		letters.put('6',"mno");
		letters.put('7',"pqrs");
		letters.put('8',"tuv");
		letters.put('9',"wxyz");
		all_combinations("23");
//		ans.stream().map(System.out.println);
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}
	}


	private static void all_combinations(String digits) {
		// TODO Auto-generated method stub
		backtrack(0,new StringBuilder(),digits);
	}

	private static void backtrack(int current_digit, StringBuilder builded_string, String digits) {
		// TODO Auto-generated method stub
		if(builded_string.length() == digits.length()){
			ans.add(builded_string.toString());
			return;
		}

		String letters_ = letters.get(digits.charAt(current_digit));
		
		for(Character ch: letters_.toCharArray()) {
			// do
			builded_string.append(ch);
			// recurse
			backtrack(current_digit+1,builded_string,digits);
			
			//undo 
			builded_string.deleteCharAt(builded_string.length() - 1);
		}
		
	}
}
