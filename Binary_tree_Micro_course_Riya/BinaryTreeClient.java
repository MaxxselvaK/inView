//$Id$
package Binary_tree_Micro_course_Riya;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bin = new BinaryTree();
		bin.display();
		bin.inorder_traversal();
		bin.preorder_traversal();
		bin.postorder_traversal();
		System.out.println(bin.height());
		System.out.println(bin.is_tree_balanced());
		System.out.println(bin.optimalBalanced());
		System.out.println("Right Side View ---------");
		System.out.println(bin.right_view());
//		
	}

}
