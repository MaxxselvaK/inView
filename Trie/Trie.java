import java.util.*;
class Trie {

	class Node{
		private Character ch;
		private boolean isTerminal;
		private HashMap<Character,Node> children;
		private Node(Character ch,boolean isTerminal) {
			this.isTerminal = isTerminal;
			this.ch = ch;
			this.children = new HashMap<>();
		}
	}
	private Node root;
	private int num_of_words;
	Trie(){
		root = new Node('\0',false);
		this.num_of_words = 0;
	}
	public void addWord(String word) {
		this.addWord(word,this.root);
	}
	private void addWord(String word,Node parent) {
		
		if(word.length() == 0) {
			parent.isTerminal = true;
			this.num_of_words++;
			return;
		}
		Character ch = word.charAt(0);
		String remaining_word = word.substring(1);
		Node existing = parent.children.get(ch);
		if(existing == null) {
			existing = new Node(ch,false);
			parent.children.put(ch, existing);
		}
		addWord(remaining_word,existing);
	}
	public boolean searchWord(String word) {
		return this.searchWord(this.root,word);
	}
	private boolean searchWord(Node parent,String word) {
		
		if(word.length() == 0) {
			if(parent.isTerminal == true) {
				return true;
			}
			return false;
		}
		Character ch = word.charAt(0);
		String rem_word = word.substring(1);
		
		Node existing = parent.children.get(ch);
		if(existing == null) {
			return false;
		}
		return searchWord(existing,rem_word);
	}
	public void displayTrie() {
		this.displayTrie(this.root);
	}
	private void displayTrie(Node parent) {
		// TODO Auto-generated method stub
		if(parent.children.size() == 0) {
			return;
		}
		ArrayList<Character> nodes = new ArrayList<>(parent.children.keySet());
		System.out.println(parent.ch + " --> ");
		for(Character ch: nodes) {
			System.out.print(ch + ", ");
		}
		System.out.println();
		for(Character ch: nodes) {
			displayTrie(parent.children.get(ch));
		}
	}
}