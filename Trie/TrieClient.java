class TrieClient{
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addWord("selva");
		trie.addWord("selvamani");
		trie.addWord("selvaraj");
		trie.addWord("maxx");
		trie.addWord("maxx2122");
		System.out.println(trie.searchWord("maxx"));
		System.out.println(trie.searchWord("selvam"));
		System.out.println(trie.searchWord("maxx2122"));
		trie.displayTrie();
	}
}