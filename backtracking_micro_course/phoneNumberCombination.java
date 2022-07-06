package backtracking_micro_course;

import java.util.*;

public class phoneNumberCombination {
    static Map<Integer,String> phone = new HashMap<>();
    static List<String> allCombination = new LinkedList<>();
    static{
        phone.put(2,"abc");
        phone.put(3,"def");
        phone.put(4,"ghi");
        phone.put(5,"jkl");
        phone.put(6,"mno");
        phone.put(7,"pqrs");
        phone.put(8,"tuv");
        phone.put(9,"wxyz");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        backtrack(0,input,new StringBuilder());
        System.out.println(allCombination);
    }
    static void backtrack(int index,String input, StringBuilder builded_string){

        if(input.length() == builded_string.length()){
            allCombination.add(builded_string.toString());
        }

        Integer digit = Integer.valueOf(input.charAt(index));

        String chars = phone.get(digit);

        for(char c : chars.toCharArray()){
            // do
            builded_string.append(c);

            // recurse

            backtrack(index+1,input,builded_string);

            // undo

            builded_string.deleteCharAt(builded_string.length()-1);

        }

    }
}
