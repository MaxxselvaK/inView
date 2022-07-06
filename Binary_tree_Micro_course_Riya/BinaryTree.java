//$Id$
package Binary_tree_Micro_course_Riya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
// https://unacademy.com/class/introduction-to-binary-trees/XRWP8IVZ
public class BinaryTree {
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	class BalancedPair{
		boolean isBalanced;
		int height;
	}
	private int size;
	private Node root;
	BinaryTree(){
		
		root = takeInput(null,false);
	}
	public boolean is_tree_balanced() {
		return this.isBalanced(this.root);
	}
	//boolean is_left_child
	private Node takeInput(Node parent, boolean is_left_child) {
		if(parent == null) {
			System.out.println("Enter root node data ");
		}else {
			if(is_left_child) {
				System.out.println("Enter left node data");
			}else {
				System.out.println("Enter right node data");
			}
		}
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node child_node = new Node(data);
		this.size++;
		System.out.println(child_node.data+" has left child?");
		boolean ihlc = sc.nextBoolean();
		if(ihlc) {
			child_node.left = takeInput(child_node,true);
		}
		System.out.println(child_node.data+" has right child?");
		boolean ihrc = sc.nextBoolean();
		if(ihrc) {
			child_node.right = takeInput(child_node,false);
		}
		return child_node;
	}
	public void display() {
		System.out.println("______________");
		display(this.root);
		System.out.println("______________");
	}
	public void inorder_traversal() {
		System.out.println("______________");
		inorder_traversal(this.root);
		System.out.println("______________");
	}
	public void preorder_traversal() {
		System.out.println("______________");
		preorder_traversal(this.root);
		System.out.println("______________");
	}
	private void preorder_traversal(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		preorder_traversal(node.left);
		preorder_traversal(node.right);
	}
	public void postorder_traversal() {
		System.out.println("______________");
		postorder_traversal(this.root);
		System.out.println("______________");
	}
	private void postorder_traversal(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {return;}
		postorder_traversal(node.left);
		postorder_traversal(node.right);
		System.out.println(node.data);
	}
	private void inorder_traversal(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		inorder_traversal(node.left);
		System.out.println(node.data);
		inorder_traversal(node.right);
	}
	private void display(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		String str = "";
		if(node.left == null) {
			str += ".";
		}else {
			str+=node.left.data;
		}
		str+= "=> "+node.data+" <= ";
		if(node.right == null) {
			str += ".";
		}else {
			str+=node.right.data;
		}
		System.out.println(str);
		//call recursively for left and right
		display(node.left);
		display(node.right);
		
	}
	public int height() {
		return this.height(this.root);
	}
	private int height(Node parent) {
		if(parent ==  null) {
			return 0;
		}
		
		int max = Math.max(height(parent.left),height(parent.right));
		return 1+ max;
	}
	// O(n^2) solution
	private boolean isBalanced(Node parent) {
		if(parent == null) {
			return true;
		}
		boolean is_left = isBalanced(parent.left);
		boolean is_right = isBalanced(parent.right);
		int left_height = height(parent.left);
		int right_height = height(parent.right);
		return is_left && is_right && Math.abs(left_height-right_height) <= 1;
	}
	public boolean optimalBalanced() {
		return isBalancedOptimal(this.root).isBalanced;
	}
	// O(n) solution
	private BalancedPair isBalancedOptimal(Node parent) {
		if(parent == null) {
			BalancedPair leaf = new BalancedPair();
			leaf.height = 0;
			leaf.isBalanced = true;
			return leaf;
		}
		
		BalancedPair left_pair = isBalancedOptimal(parent.left);
		BalancedPair right_pair = isBalancedOptimal(parent.right);
		
		BalancedPair resultPair = new BalancedPair();
		resultPair.height = Math.max(left_pair.height, right_pair.height) + 1;
		
		if(left_pair.isBalanced && right_pair.isBalanced && Math.abs(left_pair.height-right_pair.height) <= 1) {
			resultPair.isBalanced = true;
		}else {
			resultPair.isBalanced = false;
		}
		return resultPair;
	}
	public List<Integer> right_view(){
		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		List<Integer> res = new ArrayList<>();
//		res.add(this.root.data);
		return right_side_view(q, res);
	}
	// print right side view of tree
	private List<Integer> right_side_view(Queue<Node> queue,List<Integer> result){
		if(queue.size()  == 0) {
			return null;
		}
		Queue<Node> newQueue = new LinkedList<>();
		String s = "";
		while(!queue.isEmpty()) {
			int size = queue.size();
			Node node = queue.poll();
			if(size == 1) {
//				System.out.println(node.right!=null?node.right.data:null);
//				if(node.right != null) {
//					result.add(node.right.data);
//				}else if(node.left != null) {
//					result.add(node.left.data);
//				}
				result.add(node.data);
			}
			if(node.left != null) {
				newQueue.offer(node.left);
				s=s+node.left.data;
			}
			if(node.right != null) {
				newQueue.offer(node.right);
				s=s+node.right.data;
			}
		}
		System.out.println("newQueue " + s);
		right_side_view(newQueue,result);
		return result;
	}
	private List<Integer> findPath(Node parent,List<Integer> path){
		// do
		path.add(parent.data);
		return path;
		
		
	}
}

