
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
