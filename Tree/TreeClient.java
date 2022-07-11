package Tree;

public class TreeClient {
    public static void main(String[] args) {
        TreeImpl tree = new TreeImpl();
        tree.takeInput();
        tree.print();
        tree.DFS(tree.root);
    }
}
