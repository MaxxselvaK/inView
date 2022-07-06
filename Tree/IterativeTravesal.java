package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IterativeTravesal {
    void inorder(BinaryTree.TreeNode node){
        Stack<BinaryTree.TreeNode> stack = new Stack<>();
        stack.push(node);
        List<Integer> res = new LinkedList<>();
        while(node != null && !stack.isEmpty()){

            while(node != null){ // keep traverse until last left node
                stack.push(node);
               node = node.left;

            }
            node = stack.pop(); // pop last left and move one step right
            res.add(node.val);
            node = node.right;
        }

    }
}
