//$Id$
package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinaryTree {
	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int data){
			this.val = data;
			this.left = null;
			this.right = null;
		}
	}
	private TreeNode root;
	BinaryTree(){
		this.root = takeInput(this.root,false);
	}
	private TreeNode takeInput(TreeNode parent,boolean is_left_child) {
		Scanner sc = new Scanner(System.in);
		if(parent == null) {
			System.out.println("Enter the root node data");
		}else {
			if(is_left_child) {
				System.out.println("Enter the left child data");
			}else {
				System.out.println("Enter the right child data");
			}
		}
		int val = sc.nextInt();
		TreeNode child = new TreeNode(val);
		System.out.println(child.val+" has left child");
		boolean has_left = sc.nextBoolean();
		if(has_left) {
			child.left = takeInput(child,true);
		}
		System.out.println(child.val+" has right child");
		boolean has_right = sc.nextBoolean();
		if(has_right) {
			child.right = takeInput(child,false);
		}
		return child;
	}
	
	public static void main(String[] args) {
		BinaryTree bin = new BinaryTree();
		bin.verticalTraversal();
	}
	private int height(TreeNode parent) {
		if(parent == null) {
			return -1;
		}
		int left_height = height(parent.left) + 1;
		int right_height = height(parent.right) + 1;
		return Math.max(left_height,right_height);
	}
	private void verticalTraversal(TreeNode parent) {
		int height = height(parent);
		int dimension = (int) (Math.pow(2, height) - 1);
		int[][] mat = new int[dimension][dimension];
//		Arrays.fill(mat, -1);
		Arrays.stream(mat).forEach(a->Arrays.fill(a, -1));
		int row = 0;
		int col = dimension/2;
		fillMatrix(mat,parent,row,col);
		List<List<Integer>> fin = new ArrayList<>();
		for(int i=0;i<dimension;i++) {
			List<Integer> res = new ArrayList<>();
			for(int j=0;j<dimension;j++) {
//				System.out.print(mat[i][j]+" ");
				if(mat[j][i] != -1) {
					res.add(mat[j][i]);
				}
			}
//			System.out.println();
			fin.add(res);
		}
	}
	private void fillMatrix(int[][] mat,TreeNode parent,int row,int col) {
		if(parent == null) {
			return;
		}
		fillMatrix(mat,parent.left,row+1,col-1); // fillLeft
		fillMatrix(mat,parent.right,row+1,col+1); // fillRight
		mat[row][col] = parent.val;
	}
	private void verticalTraversal() {
		this.verticalTraversal(this.root);
	}

}
