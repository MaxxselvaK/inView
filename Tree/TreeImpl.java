package Tree;

import java.util.Scanner;

public class TreeImpl {
    class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    TreeNode root = null;
    public TreeNode buildTree(TreeNode parent,boolean is_left){
        Scanner sc = new Scanner(System.in);
        if(parent == null){
            System.out.println("Enter root node data");


        }else{
            if(is_left){
                System.out.println("Enter left child data");
            }else{
                System.out.println("Enter right child data");
            }
        }
        int data = sc.nextInt();
        TreeNode node = new TreeNode(data);
        System.out.println("does this node has Left child (Y/N)");
        if(sc.nextBoolean()){
            node.left = buildTree(node,true);
        }



        System.out.println("does this node has right child (Y/N)");
        if(sc.nextBoolean()){
            node.right = buildTree(node,false);
        }

        return  node;
    }
    void takeInput(){
        this.root = buildTree(null,false);
    }
    void print(){
        System.out.println(this.root.left.data);
    }
    public void DFS(TreeNode node){
        if(node == null) {
            return;
        }
        DFS(node.left);
        DFS(node.right);
        System.out.println(node.data);
    }
    int findGoodNodes(TreeNode node){
//        if(node == null){
//            return ;
//        }
        return 0;
    }
}
