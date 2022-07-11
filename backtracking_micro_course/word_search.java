//$Id$
package backtracking_micro_course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class word_search {
	
	static class TrieNode{
		HashMap<Character,TrieNode> children = new HashMap<>();
		String ending_word = null;
	}
	private static List<String> results = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = new char[][] {
			{'o','a','a','n'},
			{'e','t','a','e'},
			{'t','h','d','o'},
			{'i','f','i','g'}
			};
		String[] words = {"dog","oath","dogs","din"};
		int row = words.length;
		int col = words[0].length();
		findWords(matrix,words);
		System.out.println(Arrays.toString(results.toArray()));
	}
	private static void findWords(char[][] matrix, String[] words) {
		// constructing trie
		TrieNode root = new TrieNode();
		for(String word: words) {
			TrieNode node = root;
			for(Character ch: word.toCharArray()) {
				if(node.children.get(ch) != null) {
					node = node.children.get(ch);
				}else {
					TrieNode new_node = new TrieNode();
					node.children.put(ch, new_node);
					node = new_node;
				}
			}
			node.ending_word = word;
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(root.children.containsKey(matrix[i][j])) {
					backtrack(i,j,matrix,root);
				}
			}
		}
	}
	private static void backtrack(int row, int col, char[][] matrix, TrieNode parent) {
		int[] rowVal = new int[]{-1,0,1,0 };
		int[] colVal = new int[]{0,1,0,-1};
		Character letter = matrix[row][col];
		TrieNode node = parent.children.get(letter);
			if(node.ending_word != null) {
				results.add(node.ending_word);
				node.ending_word = null;
				return;
			}
		//do 
		matrix[row][col] = '#';
		for(int i=0;i<rowVal.length;i++) {
			int newRow = row + rowVal[i];
			int newCol = col + colVal[i];
			
			if(newRow < 0 || newRow >= matrix.length || newCol < 0 || newCol >= matrix[0].length) {
				continue;
			}
			if(node.children.containsKey(matrix[newRow][newCol])) {
				// recurse
				backtrack(newRow,newCol,matrix,node);
			}
			
		}
		// undo
		matrix[row][col] = letter;
		
	} 
	
}
